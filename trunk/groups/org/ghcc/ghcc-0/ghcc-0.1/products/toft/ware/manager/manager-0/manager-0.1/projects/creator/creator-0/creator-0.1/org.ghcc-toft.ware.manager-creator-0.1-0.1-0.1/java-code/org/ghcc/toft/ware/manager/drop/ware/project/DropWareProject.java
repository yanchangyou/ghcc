package org.ghcc.toft.ware.manager.drop.ware.project;

import java.io.File;

import org.ghcc.toft.ware.manager.Manager;

public class DropWareProject {
	/**
	 * 删除项目文件夹:<br>
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
	public void dropWareProject(String wareRootPath, String wareID) {
		String wareProjectDirectory = Manager.getWareProjectPath(wareID);
		String wareProjectPath = wareProjectDirectory + wareID;
		File wareProjectDirectoryFile = new File(wareRootPath, wareProjectPath);
		if (wareProjectDirectoryFile.exists() == true) {
			deleteDictory(wareProjectDirectoryFile);
		} else {
			System.out.println("删除文件Warning!   　不存在文件:" + wareProjectDirectoryFile.getAbsolutePath());
		}
	}
	
	public static void deleteDictory(File dir) {
		if(dir.isDirectory()) {
			for(File file : dir.listFiles()) {
				deleteDictory(file);
			}
		}
		boolean isOk = dir.delete();
		try {
			Thread.sleep(100);  //可能速度快了, 不能递归删除, 暂停减慢速度
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("删除文件[" + isOk + "]!  　路径:" + dir.getAbsolutePath());
	}
	
	public static void main(String[] args) {
		deleteDictory(new File("L:/test/ghcc/groups/org/"));
	}
}
