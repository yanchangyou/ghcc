/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.ware.define;

import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define.EtherMachineContext;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define.EtherWareContext;


/**
 * AbstractEtherWareContext
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 01:24:18
 * @version 0.5
 *
 */


public class AbstractEtherWareContext implements EtherWareContext {
	
	private EtherMachineContext machineContext;

	public AbstractEtherWareContext(EtherMachineContext machineContext) {
		setMachineContext(machineContext);
	}

	/**
	 * @param machineContext the machineContext to set
	 */
	public void setMachineContext(EtherMachineContext machineContext) {
		this.machineContext = machineContext;
	}
	/**
	 * @return the machineContext
	 */
	public EtherMachineContext getMachineContext() {
		return machineContext;
	}
}
