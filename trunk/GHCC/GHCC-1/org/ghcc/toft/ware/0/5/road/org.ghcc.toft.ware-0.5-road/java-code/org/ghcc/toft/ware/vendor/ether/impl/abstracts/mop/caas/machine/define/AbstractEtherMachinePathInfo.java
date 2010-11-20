/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.machine.define;

import java.net.URL;

import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define.EtherMachinePathInfo;


/**
 * AbstractEtherMachinePathInfo
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 01:24:18
 * @version 0.5
 *
 */


public class AbstractEtherMachinePathInfo implements EtherMachinePathInfo {

	protected URL[] urls;
	
	/**
	 * @return
	 */
	public URL[] getPathURLs() {
		return getUrls();
	}

	/**
	 * @param urls the urls to set
	 */
	public void setUrls(URL[] urls) {
		this.urls = urls;
	}

	/**
	 * @return the urls
	 */
	public URL[] getUrls() {
		return urls;
	}
}
