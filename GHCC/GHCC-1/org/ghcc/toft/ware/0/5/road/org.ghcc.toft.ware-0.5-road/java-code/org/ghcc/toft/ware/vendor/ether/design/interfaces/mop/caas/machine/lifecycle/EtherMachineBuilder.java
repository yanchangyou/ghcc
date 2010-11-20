/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.exception.MachineBuildException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.lifecycle.MachineBuilder;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.lifecycle.EtherBuilder;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define.EtherMachineResource;


/**
 * EtherMachineBuilder
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-20 00:17:21
 * @version 0.5
 *
 */


public interface EtherMachineBuilder extends MachineBuilder, EtherBuilder, EtherMachineCOPLifeCycle {

	public void build(EtherMachineResource resource) throws MachineBuildException;

}
