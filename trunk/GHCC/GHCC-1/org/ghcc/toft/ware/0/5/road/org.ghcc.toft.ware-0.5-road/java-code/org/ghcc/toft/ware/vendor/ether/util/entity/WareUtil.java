/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.util.entity;

import org.dom4j.Namespace;

/**
 * WareUtil
 * 
 * @author yanchangyou
 * @date 2010-11-20 下午03:43:48
 * @version 0.1-1-1
 *
 */

public class WareUtil {

	public static String IDENTIFER_PATTERN = "[a-zA-Z][a-zA-Z0-9]*";
	public static String SMALL_PACKAGE_PATTERN = IDENTIFER_PATTERN + "(\\." + IDENTIFER_PATTERN + ")*" ;
	public static String VERSION_PATTERN = "\\d+(\\.\\d+)*";

	/**
	 * wareID 判断的正则表达式
	 */
	public static String WARE_ID_PATTERN = "^" +
			SMALL_PACKAGE_PATTERN + "(-" + SMALL_PACKAGE_PATTERN + ")*" +  //package
			"(-" + VERSION_PATTERN + ")+" + //version
			"(-" + IDENTIFER_PATTERN + ")" + //code
			"$";
	public static boolean checkWareID(String wareID) {
		return wareID.matches(WARE_ID_PATTERN);
	}
	
	public static boolean checkWareID(Namespace namespace) {
		return checkWareID(getWareID(namespace));
	}
	
	
	/**
	 * 根据命名空间获取对于ware class path<br>
	 * 如 : https://ghcc.googlecode.com/svn/trunk/GHCC/GHCC-1/org.ghcc.demo.ware.helloworld-0.5-hellokitty
	 * 
	 * @param namespace
	 * @return
	 */
	public static String getWareJavaClassesPath(Namespace namespace) {
		return getWareJavaClassesPath(namespace.getURI().replace('\\', '/'));
	}
	public static String getWareJavaClassesPath(String wareURL) {
		String javaClassesPath = getWareProjectPath(wareURL) + "/product/java-classes/";
		return javaClassesPath;
	}
	
	/**
	 * @param wareURL
	 * @return
	 */
	public static String getWareID(String wareURL) {
		String wareID = null;
		wareID = wareURL.substring(wareURL.lastIndexOf('/')+1);
		return wareID;
	}
	

	public static String getWareJavaLibPath(String wareURL) {
		String javaLibPath = getWareProjectPath(wareURL) + "/product/java-lib/";
		javaLibPath += getWareID(wareURL) + ".jar";
		return javaLibPath;
	}
	
	public static String getWareJavaLibPath(Namespace namespace) {
		return getWareJavaLibPath(namespace.getURI().replace('\\', '/'));
	}

	public static String getWareProjectPath(String wareURL) {
		String wareProjectPath = null;
		String wareID = getWareID(wareURL);
		wareProjectPath = wareURL.substring(0, wareURL.lastIndexOf('/')+1); 
		wareProjectPath += wareID.replace('.', '/').replace('-', '/');
		wareProjectPath += "/" + wareID;
		return wareProjectPath;
	}
	
	public static String getWareProjectPath(Namespace namespace) {
		return getWareProjectPath(namespace.getURI().replace('\\', '/'));
	}
	
	public static String getWareID(Namespace namespace) {
		return getWareID(namespace.getURI().replace('\\', '/'));
	}

	/**
	 * 获取包名
	 * @param namespace
	 * @return
	 */
	public static String getWarePackageName(String wareURL) {
		String packageName = null;
		String wareID = getWareID(wareURL);
		packageName = wareID.substring(0, wareID.indexOf('-'));
		return packageName;
	}
	/**
	 * 获取包名
	 * @param namespace
	 * @return
	 */
	public static String getWarePackageName(Namespace namespace) {
		return getWarePackageName(namespace.getURI().replace('\\', '/'));
	}

	/**
	 * ware 的类名 之后加上 Ware
	 * @param namespace
	 * @return
	 */
	public static String getWareClassName(Namespace namespace) {
		return getWareClassName(namespace.getURI().replace('\\', '/'));
	}
	/**
	 * ware 的类名 之后加上 Ware
	 * @param namespace
	 * @return
	 */
	public static String getWareClassName(String wareURL) {
		String packageName = getWarePackageName(wareURL);
		String simpeClassName = packageName.substring(packageName.lastIndexOf('.') + 1);
		simpeClassName = simpeClassName.substring(0,1).toUpperCase() + simpeClassName.substring(1);
		return packageName + "." + simpeClassName + "Ware";
	}
	
	public static void main(String[] args) {
		String uri = "https://ghcc.googlecode.com/svn/trunk/GHCC/GHCC-1/org.ghcc.demo.ware.helloworld-0.5-hellokitty";
		Namespace namespace = new Namespace(null, uri);
		System.out.println("WareUtil.getWareID(namespace) : \r\n" + WareUtil.getWareID(namespace));
		System.out.println("WareUtil.getWareProjectPath(namespace) : \r\n" + WareUtil.getWareProjectPath(namespace));
		System.out.println("WareUtil.getWareJavaClassesPath(namespace) : \r\n" + WareUtil.getWareJavaClassesPath(namespace));
		System.out.println("WareUtil.getWareJavaLibPath(namespace) : \r\n" + WareUtil.getWareJavaLibPath(namespace));
		System.out.println("WareUtil.getWarePackageName(namespace) : \r\n" + WareUtil.getWarePackageName(namespace));
		System.out.println("WareUtil.getWareClassName(namespace) : \r\n" + WareUtil.getWareClassName(namespace));
		}
	
}
