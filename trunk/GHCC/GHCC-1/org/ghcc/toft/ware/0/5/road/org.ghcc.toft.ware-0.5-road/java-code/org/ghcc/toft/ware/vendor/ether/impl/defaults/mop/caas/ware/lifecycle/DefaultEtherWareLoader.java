/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.ware.lifecycle;

import java.net.MalformedURLException;
import java.net.URL;

import org.dom4j.Namespace;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.exception.WareLoadException;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.EtherWareEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define.EtherWareID;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define.EtherWarePathInfo;
import org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.ware.lifecycle.AbstractEtherWareLoader;
import org.ghcc.toft.ware.vendor.ether.util.entity.WareUtil;
import org.ghcc.toft.ware.vendor.ether.util.loader.ActiveClassLoader;


/**
 * DefaultEtherWareLoader
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 23:55:27
 * @version 0.5
 *
 */


public class DefaultEtherWareLoader extends AbstractEtherWareLoader {
	
	protected EtherWarePathInfo pathInfo;
	
	protected ActiveClassLoader wareClassLoader;
	
	public DefaultEtherWareLoader(EtherWarePathInfo pathInfo) throws MalformedURLException {
		this.pathInfo = pathInfo;
		Namespace namespace = pathInfo.getNamespace();
		URL javaLibURL = new URL(WareUtil.getWareJavaLibPath(namespace ));
		URL javaClassesURL = new URL(WareUtil.getWareJavaClassesPath(namespace));
		wareClassLoader = new ActiveClassLoader(new URL[]{javaLibURL, javaClassesURL});
	}
	
	/**
	 * @param id
	 * @return
	 * @throws WareLoadException
	 */
	public EtherWareEntity load(EtherWareID id) throws WareLoadException {

		EtherWareEntity wareEntity = null;
		
		try {
			wareEntity = (EtherWareEntity) wareClassLoader.loadClass(id.getWareClassName()).newInstance();
		} catch (Exception e) {
			throw new WareLoadException(e);
		}
		wareEntity.setWareID(id);
		wareEntity.setWareLoader(this);
		return wareEntity;
	}

	/**
	 * @return
	 */
	public ActiveClassLoader getWareClassLoader() {
		return wareClassLoader;
	}
}
