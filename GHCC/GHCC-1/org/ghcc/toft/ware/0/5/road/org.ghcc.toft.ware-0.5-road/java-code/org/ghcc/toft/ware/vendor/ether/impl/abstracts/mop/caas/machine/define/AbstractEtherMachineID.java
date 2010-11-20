/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.machine.define;

import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define.EtherMachineID;


/**
 * AbstractEtherMachineID
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 01:24:18
 * @version 0.5
 *
 */


public abstract class AbstractEtherMachineID implements EtherMachineID {

	/**
	 * @param id
	 */
	public AbstractEtherMachineID(String id) {
		setId(id);
	}
	protected String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getID() {
		return getId();
	}
	
}
