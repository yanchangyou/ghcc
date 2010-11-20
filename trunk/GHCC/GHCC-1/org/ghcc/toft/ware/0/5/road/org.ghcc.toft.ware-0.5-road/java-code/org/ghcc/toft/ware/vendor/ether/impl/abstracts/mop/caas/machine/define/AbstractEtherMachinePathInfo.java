/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.machine.define;

import java.net.URL;

import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define.EtherMachinePathInfo;
import org.ghcc.toft.ware.vendor.ether.impl.abstracts.cop.define.AbstractEtherPathInfo;


/**
 * AbstractEtherMachinePathInfo
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 01:24:18
 * @version 0.5
 *
 */


public class AbstractEtherMachinePathInfo extends AbstractEtherPathInfo implements EtherMachinePathInfo {

	/**
	 * @param pathURL
	 */
	public AbstractEtherMachinePathInfo(URL pathURL) {
		super(pathURL);
	}
}
