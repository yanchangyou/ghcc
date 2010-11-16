package org.ghcc.toft.ware.util;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
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
public class NormCodeMachine {
	
	static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	static String PROJECT_NAME = "org.ghcc.toft.ware-0.5-road";
	static String VERSION = "0.5";
	static String PATH = "L:/ghcc/ghcc/GHCC-1/svn/org/ghcc/toft/ware/0/5/road/org.ghcc.toft.ware-0.5-road/java-code";

	/**
	 * 
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		JavaClass.classNamePrefix = "";
		
		JavaClass[] caas = makeCaasJavaCode();
		JavaClass[] cop = makeCOPJavaCode();
		JavaClass[] mop = makeMopJavaCode(caas, cop);
		
		createJavaCodeFile(caas);
		createJavaCodeFile(cop);
		createJavaCodeFile(mop);
		
		
	}
	private static JavaClass[] makeMopJavaCode(JavaClass[] caas, JavaClass[] cop) throws Exception {
		String[] classNameArray = new String[caas.length * cop.length];
		String[] packageNameArray = new String[caas.length * cop.length];
		
		int classIndex = 0;
		int packageIndex = 0;
		for (int i = 0; i < caas.length; i++) {
			for (int j = 0; j < cop.length; j++) {
				classNameArray[classIndex ++] = caas[i].className + cop[j].className;
				packageNameArray[packageIndex ++] = "org.ghcc.toft.ware.norm.interfaces.mop.caas" + "." + caas[i].className.toLowerCase() + cop[j].packageName.substring("org.ghcc.toft.ware.norm.interfaces.cop".length());
			}
		}
		
		
		JavaClass[] javaClassArray = initJavaCode(classNameArray,
				packageNameArray);
		
		classIndex = 0;
		packageIndex = 0;
		for (int i = 0; i < caas.length; i++) {
			for (int j = 0; j < cop.length; j++) {
//				javaClassArray[classIndex].importClassFullName[1] = cop[j].getClassFullName();
				javaClassArray[classIndex].implementsClassName = new String[2];
				javaClassArray[classIndex].implementsClassName[0] = cop[j].className;
				javaClassArray[classIndex].implementsClassName[1] = caas[i].className;
				
				javaClassArray[classIndex].importClassFullName = new String[2];
				javaClassArray[classIndex].importClassFullName[0] = cop[j].getClassFullName();
				javaClassArray[classIndex].importClassFullName[1] = caas[i].getClassFullName();
				
				classIndex ++;
				
			}
		}
		
		return javaClassArray;
	}
	
	private static JavaClass[] makeCaasJavaCode() throws Exception {
		String[] caasClassNameArray = new String[]{
				//caas
				"CAAS",
				"Machine",
				"Ware",
				"Function",
		};
		for (int i = 0; i < caasClassNameArray.length; i++) {
//			caasClassNameArray[i] = "Dom4j" + caasClassNameArray[i];
		}
		String PACKAGE_NAME = "org.ghcc.toft.ware.norm.interfaces.concept.caas";
		String[] caasPackageNameArray = new String[caasClassNameArray.length];
		for (int i = 0; i < caasPackageNameArray.length; i++) {
			caasPackageNameArray[i] = PACKAGE_NAME;
		}

		JavaClass[] javaClassArray = initJavaCode(caasClassNameArray,
				caasPackageNameArray);
		
		return javaClassArray;
	}

	private static JavaClass[] initJavaCode(String[] classNameArray,
			String[] packageNameArray) {
		String COPY_MIDDLE = "" +
				"/*\r\n" +
				" * CopyCenter 2010 GHCC.ORG, all rights freed.\r\n" +
				" */";
		
		JavaClass[] javaClassArray = new JavaClass[classNameArray.length];
		
		for (int i = 0; i < classNameArray.length; i++) {
			javaClassArray[i] = new JavaClass(PATH);
			javaClassArray[i].copyCenter = COPY_MIDDLE;
			javaClassArray[i].packageName = packageNameArray[i];
			javaClassArray[i].importClassFullName = new String[0];
			javaClassArray[i].classVersion = VERSION;
			javaClassArray[i].classComment = "" +
					"/**\r\n" +
					" * " + classNameArray[i] + "\r\n" +
					" * \r\n" +
					" * @author code machine\r\n" +
					" * @author yanchangyou\r\n" +
					" * @date " + dateFormat.format(new Date()) + "\r\n" +
					" * @version " + javaClassArray[i].classVersion + "\r\n" +
//					" * @since " + PROJECT_NAME + "\r\n" +
					" *\r\n" +
					" */\r\n";
			javaClassArray[i].classSign = "public interface";
			javaClassArray[i].className = classNameArray[i];
		}
		return javaClassArray;
	}
	private static JavaClass[] makeCOPJavaCode() throws IOException {
		String[] copClassNameArray = new String[]{
				//define
				"COPDefine",
				"Context",
				"COPDefine",
				"ID",
				"PathInfo",
				"Resource",
				//exception
				"BuildException",
				"DriveException",
				"COPException",
				"LoadException",
				"RecycleException",
				//lifecycle
				"COPLifeCycle",
				"Builder",
				"Driver",
				"Loader",
				"Recycler",
				//COP
				"Concept",
				"Entity",
				"COP",
		};
		for (int i = 0; i < copClassNameArray.length; i++) {
			//copClassNameArray[i] = "Dom4j" + copClassNameArray[i];
		}
		String[] copPackageNameArray = new String[]{
				
				//define
				"org.ghcc.toft.ware.norm.interfaces.cop.define",
				"org.ghcc.toft.ware.norm.interfaces.cop.define",
				"org.ghcc.toft.ware.norm.interfaces.cop.define",
				"org.ghcc.toft.ware.norm.interfaces.cop.define",
				"org.ghcc.toft.ware.norm.interfaces.cop.define",
				"org.ghcc.toft.ware.norm.interfaces.cop.define",
				//exception
				"org.ghcc.toft.ware.norm.interfaces.cop.exception",
				"org.ghcc.toft.ware.norm.interfaces.cop.exception",
				"org.ghcc.toft.ware.norm.interfaces.cop.exception",
				"org.ghcc.toft.ware.norm.interfaces.cop.exception",
				"org.ghcc.toft.ware.norm.interfaces.cop.exception",
				//lifecycle
				"org.ghcc.toft.ware.norm.interfaces.cop.lifecycle",
				"org.ghcc.toft.ware.norm.interfaces.cop.lifecycle",
				"org.ghcc.toft.ware.norm.interfaces.cop.lifecycle",
				"org.ghcc.toft.ware.norm.interfaces.cop.lifecycle",
				"org.ghcc.toft.ware.norm.interfaces.cop.lifecycle",
				//cop
				"org.ghcc.toft.ware.norm.interfaces.cop",
				"org.ghcc.toft.ware.norm.interfaces.cop",
				"org.ghcc.toft.ware.norm.interfaces.cop",
		};
//		String[][] methodNameArray = new String[][]{
//				{},
//		};
		JavaClass[] javaClassArray = initJavaCode(copClassNameArray,
				copPackageNameArray);
		return javaClassArray;
	}

	private static void createJavaCodeFile(JavaClass[] javaClassArray)
			throws IOException {
		for (int i = 0; i < javaClassArray.length; i++) {
			System.out.println(javaClassArray[i]);
			javaClassArray[i].createJavaCodeFile();
		}
	}
}

abstract class JavaCode {
	public abstract String toJavaCode();
	
	public String toString() {
		return toJavaCode();
	}
	
	
}
class JavaClass extends JavaCode {
	static String classNamePrefix;
	public JavaClass(String path) {
		this.path = path;
	}
	
//	static String JavaClass.classNamePrefix = "Dom4j";
	
	String path;
	
	
	String copyCenter = "";
	String classSign = "";
	String classComment = "";
	String classVersion = "";
	String classSince = "";
	
	String packageName = "";
	String className = "";
	String[] importClassFullName = new String[0];
	String extendsClassName = "";
	String[] implementsClassName = new String[0];
	JavaMethod[] methods = new JavaMethod[0];
	public String getExtendsPart() {
		return extendsClassName.length() > 0 ? " extends " + classNamePrefix + extendsClassName : "";
	}
	public String getImplementsPart() {
		String implement = "";
		if (implementsClassName.length > 0) {
			implement = " extends ";
			for (int i = 0; i < implementsClassName.length; i++) {
				if (i > 0) {
					implement += ", ";
				}
				implement += classNamePrefix + implementsClassName[i];
			}
		}
		return implementsClassName.length > 0 ? implement : "";
	}
	public String toJavaCode() {
		String code = new String();
		code += "" + copyCenter + "\r\n";
		code += "\r\n";
		code += "package " + packageName + ";\r\n";
		code += "\r\n";
	for (int i = 0; i < importClassFullName.length; i++) {
		code += "import " + importClassFullName[i] + ";\r\n";
	}
		code += "\r\n";
		code += "\r\n";
		code += "" + classComment + "\r\n";
		code += "\r\n";
		code += "" + classSign + " " + getClassNameByPrefix() + getExtendsPart() + getImplementsPart() +  " {\r\n";
	for (int i = 0; i < methods.length; i++) {
		code += "" + methods[i].toJavaCode() + "\r\n";
		code += "\r\n";
	}
		code += "}\r\n";
		return code;
	}
	public void createJavaCodeFile() throws IOException {
		File parent = new File(new File(path), packageName.replace('.', '/'));
		parent.mkdirs();
		File file = new File(parent, getClassNameByPrefix() + ".java");
		file.createNewFile();
		PrintWriter write = new PrintWriter(file);
		write.write(toJavaCode());
		write.flush();
		write.close();
	}
	
	public String getClassFullName() {
		return this.packageName + "." + getClassNameByPrefix();
	}
	
	public String getClassNameByPrefix() {
		return classNamePrefix + className;
	}
}


class JavaMethod extends JavaCode {
	String methodComment = "";
	String methodSign = "";
	
	String methodName = "";
	String[] param = new String[0];
	String methodBody = "";
	public String toJavaCode() {
		String code = "";
		code += "" + methodComment + "\r\n";
		code += "\r\n";
		code += "" + methodSign + " " + methodName + "(";
		for (int i = 0; i < param.length; i++) {
			code += param[i];
			if (i>0) {
				code += ", ";
			}
		}
		code += ")  { \r\n";
		code += "" + methodBody + "\r\n";
		code += "}\r\n";
		
		return code;
	}
}