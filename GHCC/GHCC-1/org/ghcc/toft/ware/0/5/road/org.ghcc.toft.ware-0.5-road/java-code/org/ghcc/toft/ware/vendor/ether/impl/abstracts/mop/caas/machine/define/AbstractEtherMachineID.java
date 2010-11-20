/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.machine.define;

import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define.EtherMachineID;
import org.ghcc.toft.ware.vendor.ether.impl.abstracts.cop.define.AbstractEtherID;


/**
 * AbstractEtherMachineID
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 01:24:18
 * @version 0.5
 *
 */


public abstract class AbstractEtherMachineID extends AbstractEtherID implements EtherMachineID {

	/**
	 * @param id
	 */
	public AbstractEtherMachineID(String id) {
		super(id);
	}
	
}
