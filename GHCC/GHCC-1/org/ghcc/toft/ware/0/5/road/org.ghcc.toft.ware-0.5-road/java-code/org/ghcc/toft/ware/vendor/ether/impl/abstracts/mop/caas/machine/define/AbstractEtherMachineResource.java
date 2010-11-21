/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.machine.define;

import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.EtherMachineEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define.EtherMachineContext;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define.EtherMachineResource;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.lifecycle.EtherMachineLoader;


/**
 * AbstractEtherMachineResource
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 01:24:18
 * @version 0.5
 *
 */


public class AbstractEtherMachineResource implements EtherMachineResource {

	protected EtherMachineEntity machineEntity;
	protected EtherMachineLoader machineLoader;
	protected EtherMachineContext machineContext;
	
	public AbstractEtherMachineResource(EtherMachineEntity machineEntity,EtherMachineLoader machineLoader,
			EtherMachineContext machineContext) {
		this.machineEntity = machineEntity;
		this.machineLoader = machineLoader;
		this.machineContext = machineContext;
	}
	/**
	 * @return
	 */
	public EtherMachineEntity getEntity() {
		return machineEntity;
	}

	/**
	 * @return
	 */
	public EtherMachineLoader getLoader() {
		return machineLoader;
	}

	/**
	 * @return
	 */
	public EtherMachineContext getContext() {
		return machineContext;
	}
}
