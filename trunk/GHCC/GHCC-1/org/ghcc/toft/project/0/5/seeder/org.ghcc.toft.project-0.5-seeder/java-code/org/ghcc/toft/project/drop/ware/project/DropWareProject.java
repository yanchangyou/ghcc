package org.ghcc.toft.project.drop.ware.project;

import java.io.File;

import org.ghcc.toft.project.WareHandler;
import org.ghcc.toft.project.WareID;

public class DropWareProject implements WareHandler {
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
	public void dropWareProject(WareID ware) {
		File wareProjectDirectory = ware.getProjectDirectory();
		File rootDirectory = ware.getRootDirectory();
		File rootEmptyFile = getRootEmptyParentFile(rootDirectory, wareProjectDirectory);
		deleteDictory(rootEmptyFile);
	}
	/**
	 * 删除指定目录下文件, 同时也删除空的父目录, 指定根目录<br>
	 * 为了解决创建 ware 项目时创建大量空目录, 而不能删除
	 * @param root
	 * @param path
	 */
	public static File getRootEmptyParentFile(File root, File file) {
		File parent = file.getParentFile();
		if(parent != null && 
				parent.list() != null && 
				parent.list().length == 1 && //只有自身文件夹
				parent.getAbsolutePath().indexOf(root.getAbsolutePath()) > -1) { // 不能到达根目录
			return getRootEmptyParentFile(root, parent);
		}
		return file;
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
		deleteDictory(new File("C:/Users/yanchangyou/Desktop/core-0.1.10.1.1"));
	}
	public void handle(WareID ware) throws Exception {
		dropWareProject(ware);
	}
}
