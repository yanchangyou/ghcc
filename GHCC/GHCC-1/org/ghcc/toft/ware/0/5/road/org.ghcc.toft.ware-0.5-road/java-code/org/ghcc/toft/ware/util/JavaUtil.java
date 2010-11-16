/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * JavaBodyCopy
 * 
 * @author yanchangyou
 * @date 2010-11-16 下午09:37:21
 * @version 0.1-1-1
 *
 */

public class JavaUtil {

	public static void main(String[] args) throws Exception {
//		String fromClassPath = "L:/ghcc/ghcc/GHCC-1/svn/org/ghcc/toft/ware/norm/0/2/0/1/up/org.ghcc.toft-ware.norm-0.2-0.1-up/java-code/org/ghcc/toft/ware/norm/interfaces/cop/exception";
//		String toClassPath = "L:/ghcc/ghcc/GHCC-1/svn/org/ghcc/toft/ware/0/5/road/org.ghcc.toft.ware-0.5-road/java-code/org/ghcc/toft/ware/norm/interfaces/cop/exception";
//		copyJavaBody(fromClassPath, toClassPath);
		
//		String fromDirectory = "L:/ghcc/ghcc/GHCC-1/svn/org/ghcc/toft/ware/norm/0/2/0/1/up/org.ghcc.toft-ware.norm-0.2-0.1-up/java-code/org/ghcc/toft/ware/norm/interfaces";
//		
//		String toDirectory = "L:/ghcc/ghcc/GHCC-1/svn/org/ghcc/toft/ware/0/5/road/org.ghcc.toft.ware-0.5-road/java-code/org/ghcc/toft/ware/norm/interfaces";
		
		String fromWareDocument = "L:/ghcc/ghcc/GHCC-1/svn/org/ghcc/toft/ware/norm/0/2/0/1/up/org.ghcc.toft-ware.norm-0.2-0.1-up/java-code/org/ghcc/toft/ware/norm/interfaces/mop/caas/waredocument"; 
		String toWareDocument = "L:/ghcc/ghcc/GHCC-1/svn/org/ghcc/toft/ware/0/5/road/org.ghcc.toft.ware-0.5-road/java-code/org/ghcc/toft/ware/norm/interfaces/mop/caas/machine"; 
		
		copyFile(fromWareDocument, toWareDocument);
		
		
	}
	public static void copyFile(String fromDirectory, String toDirectory) {
		File fromDirectoryFile = new File(fromDirectory);
		if (fromDirectoryFile.isFile()) {
			try {
				copyJavaBody(fromDirectory, toDirectory);
			} catch (Throwable e) {
				e.printStackTrace();
			}
		} else {
			File[] list = fromDirectoryFile.listFiles();
			for (int i = 0; i < list.length; i++) {
				copyFile(list[i].getAbsolutePath().replace('\\', '/'), toDirectory + '/' + list[i].getName().replaceAll("WareDocument", "Machine"));
			}
		}
	}
	
	public static void copyJavaBody(String fromClassPath, String toClassPath) throws Exception {
		String fromString = readFileToString(fromClassPath);
		String toString = readFileToString(toClassPath);
		int bodyIndex = getBodyIndex(fromClassPath);
		String body = fromString.substring(bodyIndex);
		toString = toString.replaceAll("public [^神]+", body);
		System.out.println(toString);
		writeFile(toString, toClassPath);
	}
	
	public static int getBodyIndex(String javaFilePath) throws Exception {
		String javaName = getJavaName(javaFilePath);
		String java = readFileToString(javaFilePath);
		int index = -1;
		index = java.indexOf("public class " + javaName);
		if (index == -1) {
			index = java.indexOf("public interface " + javaName);
		}
//		index = java.indexOf('{', index) + 4;
		return index;
	}
	
	public static String getJavaName(String javaFilePath) {
		return javaFilePath.substring(javaFilePath.lastIndexOf('/')+1).replaceAll(".java", "");
	}
	
	public static String readFileToString(String filePath) throws Exception {
		StringBuffer buf = new StringBuffer();
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		String str = null;
		while((str = reader.readLine()) != null) {
			buf.append(str);
			buf.append("\r\n");
		}
		reader.close();
		return buf.toString();
	}
	
	public static void writeFile(String java, String javaPath) throws Exception {
		FileWriter writer = new FileWriter(javaPath);
		writer.write(java);
		writer.flush();
		writer.close();
	}
}