package org.ghcc.toft.ware.util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;



/**
 * 
 * 用代码解决问题<br>
 * 
 * @author yanchangyou
 * @date 2010-10-23 9:47:48
 * @version 0.3
 */
public class EtherDesignCodeMachine {
	static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	
	
	public static void main(String[] args) throws Exception {
		
		String FROM_PACKAGE_NAME = "org.ghcc.toft.ware.norm";
		String TO_PACKAGE_NAME = "org.ghcc.toft.ware.vendor.ether.design";
		
		String fromPath = "L:/ghcc/ghcc/GHCC-1/svn/org/ghcc/toft/ware/0/5/road/org.ghcc.toft.ware-0.5-road/java-code/org/ghcc/toft/ware/norm";
		String toPath = "L:/ghcc/ghcc/GHCC-1/svn/org/ghcc/toft/ware/0/5/road/org.ghcc.toft.ware-0.5-road/java-code/org/ghcc/toft/ware/vendor/ether/design";
		String prefix = "Ether";
	
		copyFrame(fromPath, toPath, prefix, FROM_PACKAGE_NAME, TO_PACKAGE_NAME);
		

		FROM_PACKAGE_NAME = "org.ghcc.toft.ware.norm.interfaces";
		TO_PACKAGE_NAME = "org.ghcc.toft.ware.vendor.ether.impl.abstracts";
		
		fromPath = "L:/ghcc/ghcc/GHCC-1/svn/org/ghcc/toft/ware/0/5/road/org.ghcc.toft.ware-0.5-road/java-code/org/ghcc/toft/ware/norm/interfaces";
		toPath = "L:/ghcc/ghcc/GHCC-1/svn/org/ghcc/toft/ware/0/5/road/org.ghcc.toft.ware-0.5-road/java-code/org/ghcc/toft/ware/vendor/ether/impl/abstracts";
		prefix = "AbstractEther";
	
		copyFrame(fromPath, toPath, prefix, FROM_PACKAGE_NAME, TO_PACKAGE_NAME);

		FROM_PACKAGE_NAME = "org.ghcc.toft.ware.norm.interfaces";
		TO_PACKAGE_NAME = "org.ghcc.toft.ware.vendor.ether.impl.defaults";
		
		fromPath = "L:/ghcc/ghcc/GHCC-1/svn/org/ghcc/toft/ware/0/5/road/org.ghcc.toft.ware-0.5-road/java-code/org/ghcc/toft/ware/norm/interfaces";
		toPath = "L:/ghcc/ghcc/GHCC-1/svn/org/ghcc/toft/ware/0/5/road/org.ghcc.toft.ware-0.5-road/java-code/org/ghcc/toft/ware/vendor/ether/impl/defaults";
		prefix = "DefaultEther";
	
		copyFrame(fromPath, toPath, prefix, FROM_PACKAGE_NAME, TO_PACKAGE_NAME);
		
	}

	private static void copyFrame(String fromPath, String toPath, String prefix, String FROM_PACKAGE_NAME, String TO_PACKAGE_NAME)
			throws Exception {
		JavaUtil.deleteAll(new File(toPath));
		copyFile(fromPath, toPath);
		addClassPrefixInFile(toPath, prefix);
		changeFileName(toPath, prefix);
		changePackageName(toPath, FROM_PACKAGE_NAME, TO_PACKAGE_NAME);
	}
	
	public static void changePackageName(final String FILE_PATH, final String FROM_PACKAGE_NAME, final String TO_PACKAGE_NAME) throws Exception {
		FileTraver.trave(new File(FILE_PATH), new FileDealer() {

			public void deal(File file) throws Exception {
				if (!file.getAbsolutePath().endsWith(".java")) {
					return;
				}

				String java = JavaUtil.readFileToString(file);
				java = java.replaceAll(FROM_PACKAGE_NAME, TO_PACKAGE_NAME);
				
				java = java.replaceAll("@date \\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}", "@date " + dateFormat.format(new Date()));
				
				System.out.println("change package name in : " + file);
				JavaUtil.writeFile(java, file);
			}
		});
	}
	
	/**
	 * @param FILE_PATH
	 * @param prefix
	 * @throws Exception 
	 */
	public static void changeFileName(final String FILE_PATH, final String PREFIX) throws Exception {
		FileTraver.trave(new File(FILE_PATH), new FileDealer() {

			public void deal(File file) throws Exception {
				if (file.getName().indexOf(PREFIX) != -1) {
					return;
				}
				String CLASS_NAME = JavaUtil.getJavaName(file);

				String java = JavaUtil.readFileToString(file);
				File newFile = new File(file.getAbsolutePath().replaceAll(CLASS_NAME + ".java", PREFIX+CLASS_NAME + ".java"));
				System.out.println("change file name : " + newFile);
				JavaUtil.writeFile(java, newFile);
				file.delete();
			}
		});
	}

	/**
	 * @param toPath
	 * @param PREFIX
	 * @throws Exception 
	 */
	public static void addClassPrefixInFile(final String FILE_PATH, final String PREFIX) throws Exception {
		FileTraver.trave(new File(FILE_PATH), new FileDealer() {

			public void deal(File file) throws Exception {
				String filePath = file.getAbsolutePath();
				if (!filePath.endsWith(".java")) {
					return ;
				}
				final String CLASS_NAME = JavaUtil.getJavaName(file);
				FileTraver.trave(new File(FILE_PATH), new FileDealer() {

					public void deal(File file) throws Exception {
						System.out.println("change class Name in : " + file);
						String java = JavaUtil.readFileToString(file);
						java = java.replaceAll("\\b" + CLASS_NAME + "\\b", PREFIX+CLASS_NAME);
						JavaUtil.writeFile(java, file);
						
					}
				});
			}
		});
	}

	public static void copyFile(final String fromPath, final String toPath) throws Exception {
		FileTraver.trave(new File(fromPath), new FileDealer() {

			public void deal(File file) throws Exception {
				String filePath = file.getAbsolutePath();
				if (!filePath.endsWith(".java")) {
					return ;
				}
				String toFilePath = filePath.replace('\\', '/').replaceAll(fromPath, toPath);
				
				String java = JavaUtil.readFileToString(file);
				JavaUtil.createJavaFile(new File(toFilePath));
				System.out.println(toFilePath);
				JavaUtil.writeFile(java, toFilePath);
			}
		});
	}
	
	public static void showENV() {
		System.out.println(System.getProperties().toString().replaceAll(", ", "\r\n"));
	}
}
