/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.ware.define;

import java.net.MalformedURLException;

import org.dom4j.Namespace;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define.EtherWarePathInfo;

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

	public AbstractEtherWarePathInfo(Namespace namespace) throws MalformedURLException {
		this.namespace = namespace;
	}

	/**
	 * @return the namespace
	 */
	public Namespace getNamespace() {
		return namespace;
	}
}
