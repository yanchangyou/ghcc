/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine;

import org.dom4j.Document;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.MachineEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.EtherEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.lifecycle.EtherMachineBuilder;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.lifecycle.EtherMachineDriver;


/**
 * EtherMachineEntity
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-20 00:17:21
 * @version 0.5
 *
 */


public interface EtherMachineEntity extends MachineEntity, EtherEntity, EtherMachineCOP, EtherMachineConcept, EtherMachineBuilder, EtherMachineDriver {
	public Document getDocument();
}
