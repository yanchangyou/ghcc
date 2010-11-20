/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.machine.define;

import org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.machine.define.AbstractEtherMachineID;


/**
 * DefaultEtherMachineID
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 23:55:27
 * @version 0.5
 *
 */


public class DefaultEtherMachineID extends AbstractEtherMachineID {

	/**
	 * @param id
	 */
	public DefaultEtherMachineID(String id) {
		super(id);
	}

	/**
	 * @return
	 */
	public String getFileName() {
		return this.getID().replace('.', '/') + ".ware.xml";
	}
}
