package org.ghcc.toft.ware.manager;

import org.ghcc.toft.ware.manager.create.ware.project.CreateWareProject;
import org.ghcc.toft.ware.manager.drop.ware.project.DropWareProject;

public class Main {

	public static void main(String[] args) {
		String wareID = "org.ghcc-toft.ware.core-ether-0.1.1-0.1.11-0.1";
		String wareRootPath = "l:/test/ghcc/";
		CreateWareProject.createWareProject(wareRootPath , wareID);
		DropWareProject.dropWareProject(wareRootPath , wareID);
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
	public static String getWareProjectDirectory(String wareID) {
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
}
