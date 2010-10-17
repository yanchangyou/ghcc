package org.ghcc.toft.ware.core.impl.ether.boot;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLStreamHandlerFactory;

import org.ghcc.toft.ware.core.impl.ether.bean.WareID;

/**
 * 可以在使用过程中任意添加url
 * @author yanchangyou
 *
 */
public class ActiveURLClassLoader extends URLClassLoader {

	public ActiveURLClassLoader(URL[] urls) {
		super(urls);
	}
	 public ActiveURLClassLoader(URL[] urls, ClassLoader parent) {
			super(urls, parent);
	 }
	 public ActiveURLClassLoader(URL[] urls, ClassLoader parent,
			  URLStreamHandlerFactory factory) {
		 super(urls, parent, factory);
	 }
	 
	 public ActiveURLClassLoader(WareID wareID) throws MalformedURLException {
			super(wareID.getWareClassPathURLs());
		}
	 
	public void addURL(URL url) {
		super.addURL(url);
	}

	public static void main(String[] args) throws Exception {
		String wareId = "org.ghcc.demo-ware.helloworld-hellokitty-0.1-0.1-0.1";
		WareID wareID = new WareID(new URL("http://i:9999"), wareId); 
		URL[] urls = wareID.getWareClassPathURLs();
//			new URL[]{
//				new URL("http://127.0.0.1:9999/svn/"),
//		};
		ActiveURLClassLoader activeURLClassLoader = new ActiveURLClassLoader(urls);
		Object obj = activeURLClassLoader.loadClass("org.ghcc.demo.ware.helloworld.HelloworldWare").newInstance();
		System.out.println(obj);
	}
}
