/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.machine.define;

import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.EtherMachineEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define.EtherMachineContext;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.lifecycle.EtherMachineLoader;
import org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.machine.define.AbstractEtherMachineResource;


/**
 * DefaultEtherMachineResource
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 23:55:27
 * @version 0.5
 *
 */


public class DefaultEtherMachineResource extends AbstractEtherMachineResource {

	/**
	 * @param machineEntity
	 * @param machineLoader
	 * @param machineContext
	 */
	public DefaultEtherMachineResource(EtherMachineEntity machineEntity,
			EtherMachineLoader machineLoader, EtherMachineContext machineContext) {
		super(machineEntity, machineLoader, machineContext);
	}
}
