package org.ghcc.toft.ware.manager;

import java.io.IOException;

import org.ghcc.toft.ware.manager.create.ware.project.CreateWareProject;
import org.ghcc.toft.ware.manager.drop.ware.project.DropWareProject;

public class Manager {

	public static void main(String[] args) throws IOException {
		String wareID = "org.ghcc-toft.ware.core-ether-1-1-1";
		String wareRootPath = "l:/test/ghcc/";
		new DropWareProject().dropWareProject(wareRootPath , wareID);
		new CreateWareProject().createWareProject(wareRootPath , wareID);
		new DropWareProject().dropWareProject(wareRootPath , wareID);
	}
	
	/**
	 * wareID 判断的正则表达式
	 */
	public static String WARE_ID_PATTERN = "^" +
			"(([a-zA-Z][a-zA-Z0-9_]*\\.)*)([a-zA-Z][a-zA-Z0-9_]*)-" + //group
			"(([a-zA-Z][a-zA-Z0-9_]*\\.)*)([a-zA-Z][a-zA-Z0-9_]*)-" + //product
			"(([a-zA-Z][a-zA-Z0-9_]*\\.)*)([a-zA-Z][a-zA-Z0-9_]*)"  + //project
			"(-(([0-9]+\\.)*[0-9]+)?)?" + //group-version
			"(-(([0-9]+\\.)*[0-9]+)?)?" + //product-version
			"(-(([0-9]+\\.)*[0-9]+)?)?" + //project-version
			"$";
	public static boolean checkWareID(String wareID) {
		return wareID.matches(WARE_ID_PATTERN);
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
	 * 5， 最终生成
	 *    groups/org/ghcc/ghcc-0/ghcc-0.1/products/toft/ware/manager/manager-0/manager-0.1/projects/creator/creator-0/creator-0.1/org.ghcc-toft.ware.manager-creator-0.1-0.1-0.1
	 * @param wareID
	 * @return
	 */
	public static String getWareProjectPath(String wareID) {
		if (!checkWareID(wareID)) {
			throw new IllegalArgumentException("error wareID:[" + wareID + "] not match " + WARE_ID_PATTERN);
		}
		StringBuffer wareProjectDirectory = new StringBuffer();
		
		String[] threeParts = new String[] {"groups", "products", "projects"};
		String[] parts = wareID.split("-");
		for (int i = 0; i < 3; i++) { //处理 团体,产品,项目
			wareProjectDirectory.append(threeParts[i]);
			wareProjectDirectory.append("/");
			String[] packagePart = parts[i].split("\\.");
			for (int j = 0; j < packagePart.length-1; j++) {//处理包
				wareProjectDirectory.append(packagePart[j]);
				wareProjectDirectory.append("/");
			}
			wareProjectDirectory.append(packagePart[packagePart.length-1]);
			wareProjectDirectory.append("/");
			if (parts.length <= 3+i) {
				continue;
			}
			String[] versionParts = parts[3+i].split("\\.");
			StringBuffer versionBuf = new StringBuffer();
			for (int j = 0; j < versionParts.length; j++) {//处理版本号
				if (versionParts[j] == null || versionParts[j].equals("")) {
					continue;
				}
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
	 * 根据wareID获取ware的class name<br>
	 * 这个是根据规则映射过去<br>
	 * 如: wareID :  org.ghcc-toft.ware.manager-creator-0.1-0.1-0.1<br>
	 * wareName :　org.ghcc.toft.ware.manager.ManagerWare<br>
	 * 算法步骤:<br>
	 * <ul>
	 * 	<li>准备 : 从wareID中截取 团体段: org.ghcc
	 * 	<li>准备 : 从wareID中截取 产品段: toft.ware.manager 
	 * 	<li>包名 : 团体段.产品段:  org.ghcc.toft.ware.manager 
	 * 	<li>类名 : 截取最后一部分并大写, 并且加上Ware:  manager -> ManagerWare
	 * 	<li>完成 : 与前面的包名拼接在一起 : org.ghcc.toft.ware.manager.ManagerWare
	 * </ul>
	 * 
	 * @param wareID
	 * @return
	 */
	public static String getWareClassName(String wareID) {
		String className = null;
		String groupName = wareID.substring(0, wareID.indexOf('-'));
		String productName = wareID.substring(wareID.indexOf('-')+1, wareID.indexOf('-', groupName.length()+1));
		String wareName = productName.substring(productName.lastIndexOf('.')+1);
		wareName = wareName.substring(0, 1).toUpperCase() + wareName.substring(1);
		className = groupName.toLowerCase() + "." + productName.toLowerCase() + "." + wareName + "Ware";
		return className;
	}
}
