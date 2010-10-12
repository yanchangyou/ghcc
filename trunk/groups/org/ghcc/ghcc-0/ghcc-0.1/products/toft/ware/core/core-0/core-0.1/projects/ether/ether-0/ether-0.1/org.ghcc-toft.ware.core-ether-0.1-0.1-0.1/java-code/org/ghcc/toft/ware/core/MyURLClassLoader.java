package org.ghcc.toft.ware.core;

import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLStreamHandlerFactory;

public class MyURLClassLoader extends URLClassLoader {

	public MyURLClassLoader(URL[] urls) {
		super(urls);
	}
	 public MyURLClassLoader(URL[] urls, ClassLoader parent) {
			super(urls, parent);
	 }
	 public MyURLClassLoader(URL[] urls, ClassLoader parent,
			  URLStreamHandlerFactory factory) {
		 super(urls, parent, factory);
	 }
	 
	public void addURL(URL url) {
		super.addURL(url);
	}

}
