package org.ghcc.toft.ware.manager.create.ware.project;

import java.io.File;
import java.io.IOException;

import org.ghcc.toft.ware.manager.Ware;
import org.ghcc.toft.ware.manager.WareHandler;

public class CreateWareProject implements WareHandler {

	/**
	 * 根据根路径和wareID创建ware项目
	 * @param wareRootPath
	 * @param wareID
	 * @throws IOException 
	 */
	public void createWareProject(Ware ware) throws IOException {
		
		String wareProjectDirectory = ware.getWareProjectPath();
		String wareProjectPath = wareProjectDirectory + ware.getWareID();
		String wareClassName = ware.getWareClassName();
		createWareProjectContent(ware.getRootDirectory(), wareProjectPath);
		createWareJavaFile(ware.getRootDirectory(), wareProjectPath, wareClassName);
	}
	
	/**
	 * 创建项目内容:<br>
	 * --{project-root}<br>
	 * ---------------depend                      项目依赖的东西<br>
	 * ---------------------java-lib              依赖的jar包<br>
	 * ---------------product                     产品目录<br>
	 * ----------------------java-classes         classes产品<br>
	 * ----------------------java-lib             jar包产品<br>
	 * @param wareRoot 
	 * @param wareClassPath 
	 * 
	 * @param wareProjectDirectoryPath
	 */
	public static void createWareProjectContent(File wareRoot, String wareProjectPath) {
		File wareProjectDirectory = new File(wareRoot, wareProjectPath);
		String[] wareProjectContent = new String[]{
				"depend/java-lib",
				"product/java-lib",
				"product/java-classes",
				};
		for (int i = 0; i < wareProjectContent.length; i++) {
			File contextFile = new File(wareProjectDirectory, wareProjectContent[i]);
			createFolder(contextFile);
		}
		
	}
	
	/**
	 * 创建ware java 文件<br>
	 * --{project-root}<br>
	 * ----------------\java-code\${wareClassName}.java    存放java代码<br>
	 * @param wareRoot
	 * @param wareProjectPath
	 * @param wareClassName
	 * @throws IOException
	 */
	public static void createWareJavaFile(File wareRoot, String wareProjectPath, String wareClassName) throws IOException {
		String wareClassPath = wareClassName.replace('.', '/') + ".java";
		wareClassPath = "java-code/" + wareClassPath;
		File wareFile = new File(new File(wareRoot, wareProjectPath), wareClassPath);
		createFile(wareFile);
	}
	
	/**
	 * 创建文件夹
	 * @param FolderPath
	 * @return 
	 */
	public static boolean createFolder(File folder) {
		boolean isOk = false;
		if (folder.exists() == false) {
			isOk = folder.mkdirs();
			System.out.println("创建文件夹[" + isOk + "]!  路径:" + folder.getAbsolutePath());
		} else {
			System.out.println("创建文件夹Warning! 已经存在文件夹:" + folder.getAbsolutePath());
		}
		return isOk;
	}
	
	/**
	 * 创建文件
	 * @param FolderPath
	 * @return 
	 * @throws IOException 
	 */
	public static boolean createFile(File file) throws IOException {
		boolean isOk = false;
		if (file.exists() == false) {
			if (file.getParentFile().exists() == false) { //父目录不存在就创建
				createFolder(file.getParentFile());
			}
			isOk = file.createNewFile();
			System.out.println("创建文件[" + isOk + "]!  　路径:" + file.getAbsolutePath());
		} else {
			System.out.println("创建文件Warning!   已经存在文件:" + file.getAbsolutePath());
		}
		return isOk;
	}

	public void handle(Ware ware) throws Exception {
		createWareProject(ware);
	}
}
