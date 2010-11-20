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

	/**
	 * 根据命名空间获取对于ware class path<br>
	 * 如 : https://ghcc.googlecode.com/svn/trunk/GHCC/GHCC-1/org.ghcc.demo.ware.helloworld-0.5-hellokitty
	 * 
	 * @param namespace
	 * @return
	 */
	public static String getWareJavaClassesPath(Namespace namespace) {
		String javaClassesPath = getWareProjectPath(namespace) + "/product/java-classes/";
		return javaClassesPath;
	}
	
	public static String getWareJavaLibPath(Namespace namespace) {
		String javaLibPath = getWareProjectPath(namespace) + "/product/java-lib/";
		javaLibPath += getWareID(namespace) + ".jar";
		return javaLibPath;
	}
	
	public static String getWareProjectPath(Namespace namespace) {
		String wareProjectPath = null;
		String uri = namespace.getURI();
		String wareID = getWareID(namespace);
		wareProjectPath = uri.substring(0, uri.lastIndexOf('/')+1); 
		wareProjectPath += wareID.replace('.', '/').replace('-', '/');
		wareProjectPath += "/" + wareID;
		return wareProjectPath;
	}
	
	public static String getWareID(Namespace namespace) {
		String wareID = null;
		String uri = namespace.getURI();
		wareID = uri.substring(uri.lastIndexOf('/')+1);
		return wareID;
	}
	
	/**
	 * 获取包名
	 * @param namespace
	 * @return
	 */
	public static String getWarePackageName(Namespace namespace) {
		String packageName = null;
		String wareID = getWareID(namespace);
		packageName = wareID.substring(0, wareID.indexOf('-'));
		return packageName;
	}
	
	/**
	 * ware 的类名 之后加上 Ware
	 * @param namespace
	 * @return
	 */
	public static String getWareClassName(Namespace namespace) {
		String packageName = getWarePackageName(namespace);
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
