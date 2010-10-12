package org.ghcc.demo.ware.helloworld;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.ghcc.toft.ware.core.Common;
import org.ghcc.toft.ware.core.Driver;
import org.ghcc.toft.ware.core.KeywordsUtil;
import org.ghcc.toft.ware.core.MyURLClassLoader;
import org.ghcc.toft.ware.core.Ware;


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
		
//		URI uri = (URI) context.get("ware-uri");
		
		List<URL> classPathURLList = new ArrayList<URL>();
//		classPathURLList.addAll(Arrays.asList(((URLClassLoader)this.getClass().getClassLoader()).getURLs()));
		classPathURLList.add(new URL("http://localhost:9999/org.ghcc-demo.ware.helloworld-alpha-0.1-0.1-0.1/depend/java-lib/commons-lang-2.4.jar"));
//		URL[] urls = classPathURLList.toArray(new URL[]{});

		Common.printClassLoaderInfo(this);
		
		MyURLClassLoader loader = (MyURLClassLoader) this.getClass().getClassLoader();
		loader.addURL(new URL("http://localhost:9999/org.ghcc-demo.ware.helloworld-alpha-0.1-0.1-0.1/depend/java-lib/commons-lang-2.4.jar"));
//		Thread.currentThread().setContextClassLoader(loader);
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