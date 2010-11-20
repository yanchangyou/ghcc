/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.cop.exception.COPException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.exception.MachineDriveException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.lifecycle.MachineDriver;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.lifecycle.EtherDriver;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define.EtherMachineContext;


/**
 * EtherMachineDriver
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-20 00:17:21
 * @version 0.5
 *
 */


public interface EtherMachineDriver extends MachineDriver, EtherDriver, EtherMachineCOPLifeCycle {

	public void drive(EtherMachineContext context) throws MachineDriveException, COPException;

}
