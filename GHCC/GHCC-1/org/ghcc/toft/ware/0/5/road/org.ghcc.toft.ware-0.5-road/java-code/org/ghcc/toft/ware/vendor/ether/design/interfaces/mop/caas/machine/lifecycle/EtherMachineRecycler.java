/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.cop.exception.COPException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.exception.MachineRecycleException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.lifecycle.MachineRecycler;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.lifecycle.EtherRecycler;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.EtherMachineEntity;


/**
 * EtherMachineRecycler
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-20 00:17:21
 * @version 0.5
 *
 */


public interface EtherMachineRecycler extends MachineRecycler, EtherRecycler, EtherMachineCOPLifeCycle {

	public void recycly(EtherMachineEntity entity) throws MachineRecycleException, COPException;

}
