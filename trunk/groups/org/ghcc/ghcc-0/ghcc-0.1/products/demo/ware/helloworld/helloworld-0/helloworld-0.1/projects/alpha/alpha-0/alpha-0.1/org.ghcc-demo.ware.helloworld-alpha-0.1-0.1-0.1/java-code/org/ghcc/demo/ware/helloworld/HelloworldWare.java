package org.ghcc.demo.ware.helloworld;

import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.ghcc.toft.ware.core.Driver;
import org.ghcc.toft.ware.core.KeywordsUtil;
import org.ghcc.toft.ware.core.Ware;
import org.ghcc.toft.ware.core.WareEntity;


public class HelloworldWare implements Ware {
	{
		System.out.println("load [" + this.getClass() + "] ok!");
	}
	public static void main(String[] args) {
		System.out.println("begin helloworld!");
	}
	public void execute(String xmlElement, Map<String, Object> context)
			throws Exception {
		
		Element element = DocumentHelper.parseText(xmlElement).getRootElement(); 
		String className = KeywordsUtil.getKeyWordsClass(this.getClass(), element);
		System.out.println(className);
		
		ClassLoader current = Thread.currentThread().getContextClassLoader();
		URI uri = (URI) context.get("ware-uri");
		
		String uriString = uri.toString();
		String root = uriString.substring(0, uriString.lastIndexOf('/'));
		String id = uriString.substring(uriString.lastIndexOf('/')+1);
//		URL projectURL = new URL(root + "/" + getWareProjectPath(id));
		
		
		List<URL> classPathURLList = new ArrayList<URL>();
		classPathURLList.add(new URL("http://localhost:9999/org.ghcc-demo.ware.helloworld-alpha-0.1-0.1-0.1/depend/java-lib/commons-lang-2.4.jar"));
		classPathURLList.addAll(Arrays.asList(WareEntity.getClassLoaderURLs(uri)));
		URL[] urls = classPathURLList.toArray(new URL[]{});
		
		URLClassLoader loader = new URLClassLoader(urls, current);
		
		Thread.currentThread().setContextClassLoader(loader);
		Driver driver = (Driver) loader.loadClass(className).newInstance();

		System.out.println("driver : " + driver);
		driver.drive(context);
	}
	public void dealExecuteException(Exception wareException) throws Exception {
		throw wareException;
	}
	public void executeChildElement() throws Exception {
	}
}