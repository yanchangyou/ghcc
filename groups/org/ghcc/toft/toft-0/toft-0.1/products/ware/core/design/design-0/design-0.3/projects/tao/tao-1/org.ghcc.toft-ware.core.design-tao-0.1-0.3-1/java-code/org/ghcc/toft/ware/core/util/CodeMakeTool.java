package org.ghcc.toft.ware.core.util;

import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author yanchangyou
 * @date 
 * @version 0.1
 *
 */
public class CodeMakeTool {

	static String MATRIX_PATH = "L:/ghcc/svn/groups/org/ghcc/toft/toft-0/toft-0.1/products/ware/core/design/design-0/design-0.3/projects/tao/tao-1/org.ghcc.toft-ware.core.design-tao-0.1-0.3-1/java-code";
	
	private static JavaCodeInfo getCAAS() {
		JavaCodeInfo caas = new JavaCodeInfo();
		caas.simpleClassNames = new String[]{
				"WareDocument", 
				"Ware", 
				"Function", 
//				"Input", 
//				"Output"
				};
		caas.packageName = "org.ghcc.toft.ware.core.design.interfaces.caas";
		caas.importPackage = "";
		caas.prefix = "";
		caas.path = "";
		caas.class_or_interface = "interface";
		caas.extends_or_implements = "extends";
		return caas;
	}
	
	public static void main(String[] args) throws Exception {
		JavaCodeInfo caas = getCAAS();
		JavaCodeInfo eopMatrix = makeEOP(caas);
		JavaCodeInfo eopExceptionMatrix = makeEOPException(caas);
		JavaCodeInfo eopLifeCycleMatrix = makeEOPLifeCycle(caas);
		JavaCodeInfo eopDefineMatrix = makeEOPDefine(caas);
		if (Integer.parseInt("1") != 1) {
			createJavaCode(eopMatrix);
			createJavaCode(eopExceptionMatrix);
			createJavaCode(eopLifeCycleMatrix);
			createJavaCode(eopDefineMatrix);
			}
		
	}
	private static JavaCodeInfo makeEOP(JavaCodeInfo caas) {
		JavaCodeInfo eop = new JavaCodeInfo();
		eop.simpleClassNames = new String[]{
				"Concept", 
				"Entity", 
				};
		eop.classComment = new String[]{
				"",
				"",
				};
		eop.packageName = "org.ghcc.toft.ware.core.design.interfaces.eop";
		eop.importPackage = "";
		eop.prefix = "";
		eop.path = "";
		eop.class_or_interface = "interface";
		eop.extends_or_implements = "extends";

		JavaCodeInfo matrix = new JavaCodeInfo();
		matrix.combineCodeInfo = new JavaCodeInfo[]{caas, eop};
		matrix.packageName = "org.ghcc.toft.ware.core.design.interfaces.mop";
		matrix.importPackage = "";
		matrix.prefix = "";
		matrix.superPrefix = "";
		matrix.path = MATRIX_PATH;
		matrix.class_or_interface = "interface";
		matrix.extends_or_implements = "extends";
		return matrix;
	}
	

	private static JavaCodeInfo makeEOPException(JavaCodeInfo caas) {
		JavaCodeInfo eop = new JavaCodeInfo();
		eop.simpleClassNames = new String[]{
				"BuildException", 
				"DriveException", 
				"LoadException", 
				"RecycleException", 
				};
		eop.classComment = new String[]{
				"",
				"",
				};
		eop.packageName = "org.ghcc.toft.ware.core.design.interfaces.eop.exception";
		eop.importPackage = "";
		eop.prefix = "";
		eop.path = "";
		eop.class_or_interface = "class";
		eop.extends_or_implements = "extends";


		JavaCodeInfo matrix = new JavaCodeInfo();
		matrix.combineCodeInfo = new JavaCodeInfo[]{caas, eop};
		matrix.packageName = "org.ghcc.toft.ware.core.design.interfaces.mop.exception";
		matrix.importPackage = "";
		matrix.prefix = "";
		matrix.superPrefix = "";
		matrix.path = MATRIX_PATH;
		matrix.class_or_interface = "class";
		matrix.extends_or_implements = "extends";
		return matrix;
	}
	
	private static JavaCodeInfo makeEOPLifeCycle(JavaCodeInfo caas) {
		JavaCodeInfo eop = new JavaCodeInfo();
		eop.simpleClassNames = new String[]{
				"Builder", 
				"Driver", 
				"Loader", 
				"Recycler", 
				};
		eop.classComment = new String[]{
				"",
				"",
				};
		eop.packageName = "org.ghcc.toft.ware.core.design.interfaces.eop.lifecycle";
		eop.importPackage = "";
		eop.prefix = "";
		eop.path = "";
		eop.class_or_interface = "interface";
		eop.extends_or_implements = "extends";


		JavaCodeInfo matrix = new JavaCodeInfo();
		matrix.combineCodeInfo = new JavaCodeInfo[]{caas, eop};
		matrix.packageName = "org.ghcc.toft.ware.core.design.interfaces.mop.lifecycle";
		matrix.importPackage = "";
		matrix.prefix = "";
		matrix.superPrefix = "";
		matrix.path = MATRIX_PATH;
		matrix.class_or_interface = "interface";
		matrix.extends_or_implements = "extends";
		return matrix;
	}
	

	private static JavaCodeInfo makeEOPDefine(JavaCodeInfo caas) {
		JavaCodeInfo eop = new JavaCodeInfo();
		eop.simpleClassNames = new String[]{
				"Context", 
				"ID", 
				"PathInfo", 
				"Resource", 
				};
		eop.classComment = new String[]{
				"",
				"",
				};
		eop.packageName = "org.ghcc.toft.ware.core.design.interfaces.eop.define";
		eop.importPackage = "";
		eop.prefix = "";
		eop.path = "";
		eop.class_or_interface = "interface";
		eop.extends_or_implements = "extends";

		JavaCodeInfo matrix = new JavaCodeInfo();
		matrix.combineCodeInfo = new JavaCodeInfo[]{caas, eop};
		matrix.packageName = "org.ghcc.toft.ware.core.design.interfaces.mop.define";
		matrix.importPackage = "";
		matrix.prefix = "";
		matrix.superPrefix = "";
		matrix.path = MATRIX_PATH;
		matrix.class_or_interface = "interface";
		matrix.extends_or_implements = "extends";
		return matrix;
	}
	
	
	static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static void createJavaCode(JavaCodeInfo javaCodeInfo) throws Exception {
		if (javaCodeInfo.simpleClassNames != null) {
			for (int i = 0; i < javaCodeInfo.simpleClassNames.length; i++) {
				File parent = new File(new File(javaCodeInfo.path), javaCodeInfo.packageName.replace('.', '/'));
				parent.mkdirs();
				File file = new File(parent, javaCodeInfo.getThisClassName(i) + ".java");
				file.createNewFile();
				PrintWriter write = new PrintWriter(file);
				
				write.write(
"package " + javaCodeInfo.packageName + ";\r\n" +
"\r\n" +
"import " + javaCodeInfo.getSuperFullClassName(i) + ";\r\n" +
"\r\n" +
"/**\r\n" +
" * " + javaCodeInfo.getThisClassName(i) + "\r\n" +
" * \r\n" +
" * @author yanchangyou\r\n" +
" * @date " + dateFormat.format(new Date()) + "\r\n" +
" * @version 0.1\r\n" +
" *\r\n" +
" */\r\n" +
"" + javaCodeInfo.getClassHeader(i) + " {\r\n" +
"\r\n" +
"}" +
"");
				write.flush();
				write.close();
				System.out.println(file);				
			}
		} 
		if (javaCodeInfo.combineCodeInfo != null && javaCodeInfo.combineCodeInfo.length == 2) {
			for (int j = 0; j < javaCodeInfo.combineCodeInfo[0].simpleClassNames.length; j++) {
				for (int i = 0; i < javaCodeInfo.combineCodeInfo[1].simpleClassNames.length; i++) {
					String fileName = javaCodeInfo.prefix + javaCodeInfo.combineCodeInfo[0].simpleClassNames[j] + javaCodeInfo.combineCodeInfo[1].simpleClassNames[i];
					File parent = new File(new File(javaCodeInfo.path), javaCodeInfo.packageName.replace('.', '/'));
					parent.mkdirs();
					File file = new File(parent, fileName + ".java");
					file.createNewFile();
					PrintWriter write = new PrintWriter(file);
					
					write.write(
"package " + javaCodeInfo.packageName + ";\r\n" +
"\r\n" +
"/**\r\n" +
" * " + fileName + "\r\n" +
" * \r\n" +
" * @author yanchangyou\r\n" +
" * @date " + dateFormat.format(new Date()) + "\r\n" +
" * @version " + javaCodeInfo.version + "\r\n" +
" * @since 0.3\r\n" +
" *\r\n" +
" */\r\n" +     
"import " + javaCodeInfo.combineCodeInfo[0].getThisFullClassName(j) + ";\r\n" +
"import " + javaCodeInfo.combineCodeInfo[1].getThisFullClassName(i) + ";\r\n" +
"\r\n" +
"" + javaCodeInfo.getClassHeaerPrefix() + " " + fileName + " " + javaCodeInfo.extends_or_implements + " " + javaCodeInfo.combineCodeInfo[0].getThisClassName(j) + ", " + javaCodeInfo.combineCodeInfo[1].getThisClassName(i)  + " {\r\n\r\n}" +
"");
					write.flush();
					write.close();
					System.out.println(file);
				}
			}
		}
	}
}
