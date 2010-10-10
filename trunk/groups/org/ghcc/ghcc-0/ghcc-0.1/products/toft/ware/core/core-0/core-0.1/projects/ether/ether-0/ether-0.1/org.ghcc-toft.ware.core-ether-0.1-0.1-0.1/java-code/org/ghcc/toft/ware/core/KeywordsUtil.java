package org.ghcc.toft.ware.core;


import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import org.dom4j.Element;
import org.dom4j.Namespace;

/**
 * 处理keywords工具包
 * @author yanchangyou
 *
 */
public class KeywordsUtil {
	
	/**
	 * 获取关键字对应的driver
	 * @param element
	 * @return
	 * @throws Exception
	 */
//	public static Driver getDriver(Element element) throws Exception {
//		
//		Namespace namespace = element.getNamespace();
//		
//		ClassLoader classLoader = getKeywordsClassLoader(namespace);
//		
//		String className = getKeyWordsClass(element) ;
//		
//		Driver driver = (Driver)classLoader.loadClass(className).newInstance();
//		
//		return driver;
//	}


	/**
	 * 获取类名 <br>
	 * 如 : ware.xml中的标签 : <ghcc-ware-helloworld:speak-words>
	 * ghcc-ware-helloworld 的命名空间对应  http://host:port/path/ghcc.ware.helloworld<br>
	 *  speak-words 对应的类名  speak.SpeakWords
	 * 于是拼接起来就是  ghcc.ware.helloworld.speak.SpeakWords
	 * @param element
	 * @return
	 */
	public static String getKeyWordsClass(Class<? extends Ware> wareClass, Element element) {
		String className = null;
		String warePackage = wareClass.getPackage().getName();
		String name = element.getName();
		String[] namePart = name.split("-");
		StringBuffer packageBuf = new StringBuffer();
		StringBuffer classNameBuf = new StringBuffer();
		for (int i = 0; i < namePart.length; i++) {
			if(i < namePart.length -1) {
				packageBuf.append(namePart[i]);
				packageBuf.append(".");
			}
			classNameBuf.append(namePart[i].substring(0, 1).toUpperCase() + namePart[i].substring(1));
		}
		if (warePackage.length() > 0) {
			warePackage += ".";
		}
		className = warePackage + packageBuf + classNameBuf;
		
		return className;
	}
	
	/**
	 * 获取ClassLoader<br>
	 * 根据命名空间来获取, 使用命名规范来获取<br>
	 * 如: 命名空间 ： http://host:port/path/production-name/ghcc.ware.helloworld<br>
	 * 会默认指向两个路径 classes  :  http://host:port/path/production-name/java-classes/<br>
	 * 另外一个就是jar路径  : http://host:port/path/production-name/java-lib/production-name.jar<br>
	 * @param namespace
	 * @return
	 * @throws MalformedURLException
	 */
	public static ClassLoader getKeywordsClassLoader(Namespace namespace) throws MalformedURLException {
		ClassLoader classLoader = null;
		String uri = namespace.getURI();
		String productionPath = uri.substring(0, uri.lastIndexOf('/'));
		URL keywordsClassesURL = new URL(productionPath + "/java-classes/");
		
		String productionName = productionPath.substring(productionPath.lastIndexOf('/')+1);
		
		URL keywordsJarURL = new URL(productionPath + "/java-lib/" + productionName + ".jar");
		
		classLoader = new URLClassLoader(new URL[]{keywordsJarURL, keywordsClassesURL}, Thread.currentThread().getContextClassLoader()); 
		return classLoader;
	}
}
