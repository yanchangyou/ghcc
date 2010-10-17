package org.ghcc.toft.ware.core.impl.ether.util;

public class JavaCodeInfo {
	String[] simpleClassNames;
	JavaCodeInfo[] combineCodeInfo;
	String packageName = "";
	String importPackage = "";
	String path = "";
	String class_or_interface = "";
	String extends_or_implements = "";
	String prefix = "";
	String superPrefix = "";
	
	public String getClassName(int index) {
		return this.prefix + this.simpleClassNames[index];
	}

	public String getSuperClassName (int index) {
		return this.superPrefix + this.simpleClassNames[index];
	}
	public String getThisClassName (int index) {
		return this.prefix + this.simpleClassNames[index];
	}

	public String getThisFullClassName(int index) {
		return this.packageName + "." + this.getThisClassName(index);
	}
	public String getSuperFullClassName(int index) {
		return this.importPackage + "." + this.getSuperClassName(index);
	}

	public String getClassHeader(int index) {
		return getClassHeaerPrefix() + " " + getThisClassName(index) + " " + extends_or_implements + " " + getSuperClassName(index);
	}
	
	public String getClassHeaerPrefix() {
		return "public " + class_or_interface;
	}

	public String getSuperClassName(int j, int i) {
		return combineCodeInfo[0].simpleClassNames[j] + "" + combineCodeInfo[1].simpleClassNames[i];
	}

	public String getSuperFullClassName(int j, int i) {
		return importPackage + "." + getSuperClassName(j,i);
	}
}