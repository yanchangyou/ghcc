/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.function.define;

import org.dom4j.Namespace;
import org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.function.define.AbstractEtherFunctionPathInfo;


/**
 * DefaultEtherFunctionPathInfo
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 23:55:27
 * @version 0.5
 *
 */


public class DefaultEtherFunctionPathInfo extends AbstractEtherFunctionPathInfo {

	protected Namespace namespace;
	protected ClassLoader functionClassLoader;

	public DefaultEtherFunctionPathInfo(Namespace namespace) {
		this.setNamespace(namespace);
	}

	/**
	 * @param namespace
	 */
	protected void setNamespace(Namespace namespace) {
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
	public ClassLoader getFunctionClassLoader() {
		return functionClassLoader;
	}
}
