package org.ghcc.toft.ware.core.impl.ether.boot;

import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLStreamHandlerFactory;

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
	 
	public void addURL(URL url) {
		super.addURL(url);
	}

}
