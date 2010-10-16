package org.ghcc.toft.ware.core.impl.ether.util;

import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author yanchangyou
 * @date 
 * @version 0.1
 *
 */
public class CodeMakeTool {

	
	public static void main(String[] args) throws Exception {
		JavaCodeInfo cop = new JavaCodeInfo();
		cop.simpleClassNames = new String[]{"Concept", "Node", "Entity", "Driver"};
		cop.packageName = "org.ghcc.toft.ware.core.impl.ether.interfaces.cop";
		cop.importPackage = "org.ghcc.toft.ware.core.design.cop";
		cop.prefix = "Ether";
		cop.path = "L:/ghcc/svn/groups/org/ghcc/toft/toft-0/toft-0.1/products/ware/core/impl/ether/ether-0/ether-0.1/projects/water/water-0/water-0.1/org.ghcc.toft-ware.core.impl.ether-water-0.1-0.1-0.1/java-code";
		cop.class_or_interface = "interface";
		cop.extends_or_implements = "extends";

		JavaCodeInfo caas = new JavaCodeInfo();
		caas.simpleClassNames = new String[]{"WareDocument", "Ware", "Function", "Input", "Output"};
		caas.packageName = "org.ghcc.toft.ware.core.impl.ether.interfaces.caas";
		caas.importPackage = "org.ghcc.toft.ware.core.design.caas";
		caas.prefix = "Ether";
		caas.path = "L:/ghcc/svn/groups/org/ghcc/toft/toft-0/toft-0.1/products/ware/core/impl/ether/ether-0/ether-0.1/projects/water/water-0/water-0.1/org.ghcc.toft-ware.core.impl.ether-water-0.1-0.1-0.1/java-code";
		caas.class_or_interface = "interface";
		caas.extends_or_implements = "extends";

		JavaCodeInfo matrix = new JavaCodeInfo();
		matrix.combineCodeInfo = new JavaCodeInfo[]{caas, cop};
		matrix.packageName = "org.ghcc.toft.ware.core.impl.ether.interfaces.matrix";
		matrix.importPackage = "";
		matrix.prefix = "Ether";
		matrix.path = "L:/ghcc/svn/groups/org/ghcc/toft/toft-0/toft-0.1/products/ware/core/impl/ether/ether-0/ether-0.1/projects/water/water-0/water-0.1/org.ghcc.toft-ware.core.impl.ether-water-0.1-0.1-0.1/java-code";
		matrix.class_or_interface = "interface";
		matrix.extends_or_implements = "extends";
		
		List<String> nameCombine = new ArrayList<String>();
		for (int i = 0; i < caas.simpleClassNames.length; i++) {
			for (int j = 0; j < cop.simpleClassNames.length; j++) {
				nameCombine.add(caas.simpleClassNames[i] + cop.simpleClassNames[j]);
			}
		}
		
		JavaCodeInfo abstractMatrix = new JavaCodeInfo();
		abstractMatrix.simpleClassNames = nameCombine.toArray(new String[]{});
		abstractMatrix.packageName = "org.ghcc.toft.ware.core.impl.ether.abstracts.matrix";
		abstractMatrix.importPackage = "org.ghcc.toft.ware.core.impl.ether.interfaces.matrix";
		abstractMatrix.prefix = "EtherAbstract";
		abstractMatrix.superPrefix = "Ether";
		abstractMatrix.path = "L:/ghcc/svn/groups/org/ghcc/toft/toft-0/toft-0.1/products/ware/core/impl/ether/ether-0/ether-0.1/projects/water/water-0/water-0.1/org.ghcc.toft-ware.core.impl.ether-water-0.1-0.1-0.1/java-code";
		abstractMatrix.class_or_interface = "abstract class";
		abstractMatrix.extends_or_implements = "implements";
		
		JavaCodeInfo defaultMatrix = new JavaCodeInfo();
		defaultMatrix.simpleClassNames = nameCombine.toArray(new String[]{});
		defaultMatrix.packageName = "org.ghcc.toft.ware.core.impl.ether.defaults.matrix";
		defaultMatrix.importPackage = "org.ghcc.toft.ware.core.impl.ether.abstracts.matrix";
		defaultMatrix.prefix = "EtherDefault";
		defaultMatrix.superPrefix = "EtherAbstract";
		defaultMatrix.path = "L:/ghcc/svn/groups/org/ghcc/toft/toft-0/toft-0.1/products/ware/core/impl/ether/ether-0/ether-0.1/projects/water/water-0/water-0.1/org.ghcc.toft-ware.core.impl.ether-water-0.1-0.1-0.1/java-code";
		defaultMatrix.class_or_interface = "class";
		defaultMatrix.extends_or_implements = "extends";
		
		createJavaCode(cop);
		createJavaCode(caas);
		createJavaCode(matrix);
		createJavaCode(abstractMatrix);
		createJavaCode(defaultMatrix);
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
" * @version 0.1\r\n" +
" *\r\n" +
" */\r\n" +
"import " + javaCodeInfo.combineCodeInfo[0].getThisFullClassName(j) + ";\r\n" +
"import " + javaCodeInfo.combineCodeInfo[1].getThisFullClassName(i) + ";\r\n" +
"\r\n" +
"" + javaCodeInfo.getClassHeaerPrefix() + " " + fileName + " " + javaCodeInfo.extends_or_implements + " "  +  javaCodeInfo.combineCodeInfo[0].getThisClassName(j) + ", " + javaCodeInfo.combineCodeInfo[1].getThisClassName(i)  + " {\r\n\r\n}" +
"");
					write.flush();
					write.close();
					System.out.println(file);
				}
			}
		}
	}
}
