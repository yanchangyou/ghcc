/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.exception.MachineLoadException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.lifecycle.MachineLoader;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.lifecycle.EtherLoader;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.EtherMachineEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define.EtherMachineID;


/**
 * EtherMachineLoader
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-20 00:17:21
 * @version 0.5
 *
 */


public interface EtherMachineLoader extends MachineLoader, EtherLoader, EtherMachineCOPLifeCycle {

	public EtherMachineEntity load(EtherMachineID id) throws MachineLoadException;
}
