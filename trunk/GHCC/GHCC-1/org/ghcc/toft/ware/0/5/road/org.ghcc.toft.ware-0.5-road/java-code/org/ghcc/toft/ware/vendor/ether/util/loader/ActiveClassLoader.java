/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.util.loader;

import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLStreamHandlerFactory;

/**
 * ActiveClassLoader<br>
 * 一个可以动态添加 url的类加载器, 便于运行期动态添加查找路径
 * 
 * @author yanchangyou
 * @date 2010-11-20 下午09:51:27
 * @version 0.1-1-1
 *
 */

public class ActiveClassLoader extends URLClassLoader {

	/**
	 * @param urls
	 * @param parent
	 */
	public ActiveClassLoader(URL[] urls, ClassLoader parent) {
		super(urls, parent);
	}
	
	/**
	 * @param urls
	 */
	public ActiveClassLoader(URL[] urls) {
		super(urls);
	}
	
	/**
	 * @param urls
	 * @param parent
	 * @param factory
	 */
	public ActiveClassLoader(URL[] urls, ClassLoader parent,
			URLStreamHandlerFactory factory) {
		super(urls, parent, factory);
	}

	/**
	 * 
	 * 放开添加url的方法
	 * 
	 * @param url
	 */
	public void addURL(URL url) {
		super.addURL(url);
	}
}
