/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.machine.define;

import java.net.MalformedURLException;
import java.net.URL;

import org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.machine.define.AbstractEtherMachinePathInfo;


/**
 * DefaultEtherMachinePathInfo
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 23:55:27
 * @version 0.5
 *
 */


public class DefaultEtherMachinePathInfo extends AbstractEtherMachinePathInfo {

	/**
	 * @param wareMachineURL
	 * @throws MalformedURLException 
	 */
	public DefaultEtherMachinePathInfo(String wareMachineURL) throws MalformedURLException {
		if (wareMachineURL == null) {
			return;
		}
		String[] urlPaths = wareMachineURL.split(";");
		urls = new URL[urlPaths.length];
		for (int i = 0; i < urlPaths.length; i++) {
			urlPaths[i] = urlPaths[i].matches("^.+(/|\\\\)$") ? urlPaths[i] : urlPaths[i] + "/";
			urls[i] = new URL(urlPaths[i]);
		}
	}
}
