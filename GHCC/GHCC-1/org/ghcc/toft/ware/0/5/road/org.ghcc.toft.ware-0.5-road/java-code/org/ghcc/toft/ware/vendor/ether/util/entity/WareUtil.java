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
		return getWareJavaClassesPath(namespace.getURI());
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
		return getWareJavaLibPath(namespace.getURI());
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
		return getWareProjectPath(namespace.getURI());
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
		return getWarePackageName(namespace.getURI());
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
