package org.ghcc.toft.ware.manager;

import java.io.File;

public class Manager {

	public static void main(String[] args) {
		String wareID = "org.ghcc-toft.ware.core-ether-0.1-0.1-0.1";
		String wareRootPath = "l:/test/ghcc/";
		createWareProject(wareRootPath , wareID);
	}
	
	public static void createWareProject(String wareRootPath, String wareID) {
		String wareProjectDirectory = getWareProjectDirectory(wareID);
		String wareProjectPath = wareRootPath + wareProjectDirectory + wareID;
		createWareProjectContent(wareProjectPath);
	}
	
	/**
	 * wareID 格式 org.ghcc-toft.ware.manager-creator-0.1-0.1-0.1<br>
	 * 处理步骤 <br> 
	 * 1, 按照'-'分割 成 六段 
	 * 		<ul>
	 * 			<li>团体[org.ghcc]
	 * 			<li>产品[toft.ware.manager]
	 * 			<li>项目[creator]
	 * 			<li>团体版本号[0.1]
	 * 			<li>产品版本号[0.1]
	 * 			<li>项目版本号[0.1]
	 * 		</ul>
	 * 2, 填上大类 
	 * 		<ul>
	 * 			<li>团体[org.ghcc]          -> groups/org.ghcc
	 * 			<li>产品[toft.ware.manager] -> products/toft.ware.manager
	 * 			<li>项目[creator]           -> projects/creator
	 * 		</ul>	
	 * 3， 处理包 
	 * 		<ul>
	 * 			<li>org.ghcc          -> org/
	 * 			<li>toft.ware.manager -> toft/ware/
	 * 			<li>projects/creator  -> /
	 * 		</ul>
	 * 4， 处理版本号 
	 * 		<ul>
	 * 			<li>org.ghcc-0.1          -> ghcc/ghcc-0/ghcc-0.1
	 * 			<li>toft.ware.manager-0.1 -> manager/manager-0/manager-0.1
	 * 			<li>creator-0.1           -> creator/creator-0/creator-0.1
	 * 		</ul> 
	 * @param wareID
	 * @return
	 */
	public static String getWareProjectDirectory(String wareID) {
		
		StringBuffer wareProjectDirectory = new StringBuffer();
		
		String[] threeParts = new String[] {"groups", "products", "projects"};
		String[] parts = wareID.split("-");
		for (int i = 0; i < parts.length/2; i++) { //处理 团体,产品,项目
			wareProjectDirectory.append(threeParts[i]);
			wareProjectDirectory.append("/");
			String[] packagePart = parts[i].split("\\.");
			for (int j = 0; j < packagePart.length-1; j++) {//处理包
				wareProjectDirectory.append(packagePart[j]);
				wareProjectDirectory.append("/");
			}
			String[] versionParts = parts[3+i].split("\\.");
			StringBuffer versionBuf = new StringBuffer();
			wareProjectDirectory.append(packagePart[packagePart.length-1]);
			wareProjectDirectory.append("/");
			for (int j = 0; j < versionParts.length; j++) {//处理版本号
				if (j > 0) versionBuf.append(".");
				versionBuf.append(versionParts[j]);
				
				wareProjectDirectory.append(packagePart[packagePart.length-1]);
				wareProjectDirectory.append("-");
				wareProjectDirectory.append(versionBuf);
				wareProjectDirectory.append("/");
			}
		}
		
		return wareProjectDirectory.toString();
	}
	
	/**
	 * 创建项目内容:<br>
	 * --{project-root}<br>
	 * ---------------java-code                   存放java代码<br>
	 * ---------------depend                      项目依赖的东西<br>
	 * ---------------------java-lib              依赖的jar包<br>
	 * ---------------product                     产品目录<br>
	 * ----------------------java-classes         classes产品<br>
	 * ----------------------java-lib             jar包产品<br>
	 * 
	 * @param wareProjectDirectoryPath
	 */
	public static void createWareProjectContent(String wareProjectDirectoryPath) {
		File wareProjectDirectory = new File(wareProjectDirectoryPath);
		if (wareProjectDirectory.exists() == false) {
			wareProjectDirectory.mkdirs();
			System.out.println("创建文件:" + wareProjectDirectory.getAbsolutePath());
		}
		String[] wareProjectContent = new String[]{
				"java-code",
				"depend/java-lib",
				"product/java-lib",
				"product/java-classes"};
		for (int i = 0; i < wareProjectContent.length; i++) {
			File contextFile = new File(wareProjectDirectory, wareProjectContent[i]);
			if (contextFile.exists() == false) {
				contextFile.mkdirs();
				System.out.println("创建文件:" + contextFile.getAbsolutePath());
			}
		}
	}
}
