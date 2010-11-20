/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.ware.define;

import java.net.MalformedURLException;
import java.net.URL;

import org.dom4j.Namespace;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define.EtherWarePathInfo;
import org.ghcc.toft.ware.vendor.ether.util.entity.WareUtil;
import org.ghcc.toft.ware.vendor.ether.util.loader.ActiveClassLoader;

/**
 * AbstractEtherWarePathInfo
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 01:24:18
 * @version 0.5
 * 
 */

public class AbstractEtherWarePathInfo implements EtherWarePathInfo {

	protected Namespace namespace;
	protected ActiveClassLoader wareClassLoader;

	public AbstractEtherWarePathInfo(Namespace namespace) throws MalformedURLException {
		this.setNamespace(namespace);
		URL javaLibURL = new URL(WareUtil.getWareJavaLibPath(namespace));
		URL javaClassesURL = new URL(WareUtil.getWareJavaClassesPath(namespace));
		wareClassLoader = new ActiveClassLoader(new URL[]{javaLibURL, javaClassesURL});
	}

	/**
	 * @param namespace
	 */
	public void setNamespace(Namespace namespace) {
		this.namespace = namespace;
	}

	/**
	 * @return the namespace
	 */
	public Namespace getNamespace() {
		return namespace;
	}

	/**
	 * @return
	 */
	public ActiveClassLoader getWareClassLoader() {
		return wareClassLoader;
	}
}
