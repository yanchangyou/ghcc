package org.ghcc.toft.project;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;

/**
 * 标识一个ware<br>
 * 
 * 包括跟ware的URL path和wareID
 * 
 * @author yanchangyou
 *
 */
public class WareID {
	
	private URL rootURL;
	private String wareID;
	private URL wareRealURL;
	
	public WareID(URL rootURL, String wareID){
		
		if (!checkWareID(wareID)) {
			throw new IllegalArgumentException("error wareID:[" + wareID + "] not match " + WARE_ID_PATTERN);
		}
		
		this.rootURL = rootURL;
		this.wareID = wareID;
	}
	
	public URL getRootURL() {
		return rootURL;
	}

	public String getWareID() {
		return wareID;
	}
	
	public File getRootDirectory() {
		File file = null;
		try {
			file = new File(URLDecoder.decode(this.rootURL.toString(), "UTF-8").substring("file://".length()));
//			new File(URLDecoder.decode(this.rootURL.toString(), "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			//can't occur
			e.printStackTrace();
		}
		return file;
	}
	public static String IDENTIFER_PATTERN = "[a-zA-Z][a-zA-Z0-9]*";
	public static String SMALL_PACKAGE_PATTERN = IDENTIFER_PATTERN + "(\\." + IDENTIFER_PATTERN + ")*" ;
	public static String VERSION_PATTERN = "\\d+(\\.\\d+)*";

	/**
	 * wareID 判断的正则表达式
	 */
	public static String WARE_ID_PATTERN = "^" +
			SMALL_PACKAGE_PATTERN + "(-" + SMALL_PACKAGE_PATTERN + ")*" +  //package
			"(-" + VERSION_PATTERN + ")+" + //version
			"(-" + IDENTIFER_PATTERN + ")" + //code
			"$";
	public static boolean checkWareID(String wareID) {
		return wareID.matches(WARE_ID_PATTERN);
	}
	
	/**
	 * wareID 格式 org.ghcc.toft.ware-0.5-road<br>
	 * wareID 采用三段式   : 包名 + 版本号? + 代号?<br>
	 * 前面的包名会直接反应到java类里面<br>
	 * 对于的文件夹就是把分隔符[-],[.]替换成[/]及形成对于路径
	 * 大分隔符[-]和小分割符[.]<br> 
	 * 使用'-'大分割的标准就是是否需要版本化管理, 如果需要, 就对其使用'-'分割
	 * 处理步骤 <br> 
	 * 1, 按照'-'分割    
	 * 		<ul>
	 * 			<li>org.ghcc.toft.ware <-- 包
	 * 			<li>0.1                <-- 版本(可选)
	 * 			<li>seeder             <-- 代号(可选)
	 * 		</ul>
	 * 2， 处理包 
	 * 		<ul>
	 * 			<li>org.ghcc.toft.ware   -> org/ghcc/toft/ware
	 * 		</ul>
	 * 4， 处理版本号 
	 * 		<ul>
	 * 			<li>0.5             -> 0/5
	 * 		</ul> 
	 * 5， 最终生成org.ghcc.toft.ware-0.5-road
	 *     org/ghcc/toft/ware/0/5/road/org.ghcc.toft.ware-0.5-road
	 * @param wareID
	 * @return
	 * @throws MalformedURLException 
	 */
	public String getWareProjectPath() {
		return wareID.replace('.', '/').replace('-', '/') + "/" + wareID;
	}
	
	public URL getWareRealURL() throws MalformedURLException {
		if (wareRealURL != null) {
			return wareRealURL;
		}
		String wareProjectDirectory = getWareProjectPath();
		wareRealURL = new URL(this.wareRealURL.toString() + "/" + wareProjectDirectory );
		return wareRealURL;
	}
	
	/**
	 * 根据wareID获取ware的class name<br>
	 * 去掉版本号后面的部分
	 *  
	 * @param wareID
	 * @return
	 * @throws ClassNotFoundException 
	 */
	public String getWareClassName() {
		String packageName = wareID.replaceAll("-\\d.+", "").replace('-', '.');
		String simpleClassName = packageName.substring(packageName.lastIndexOf('.') + 1);
		simpleClassName = simpleClassName.substring(0, 1).toUpperCase() + simpleClassName.substring(1);
		return packageName + "." + simpleClassName + "Ware";
	}
	
	public File getProjectDirectory() {
		return new File(this.getRootDirectory(), this.getWareProjectPath());
	}
	public File getSubDirectory(String subPath) {
		return new File(this.getRootDirectory() + "/" + subPath);
	}
	
	public File getGroupsDirectory() {
		return new File(this.getRootDirectory() + "/GHCC-1/svn/");
	}
	
	public static void main(String[] args) throws Exception {
		WareID wareID = new WareID(null, "org.ghcc.toft.ware-0.5-road");
		System.out.println("projectPath : " + wareID.getWareProjectPath());
		System.out.println("getWareClassName : " + wareID.getWareClassName());
	}
}
