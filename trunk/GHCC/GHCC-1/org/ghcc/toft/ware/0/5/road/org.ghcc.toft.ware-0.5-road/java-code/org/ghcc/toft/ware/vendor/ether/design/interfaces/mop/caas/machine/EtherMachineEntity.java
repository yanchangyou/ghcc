/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine;

import org.dom4j.Document;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.MachineEntity;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.WareEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.EtherEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.lifecycle.EtherMachineBuilder;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.lifecycle.EtherMachineDriver;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.EtherWareEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define.EtherWareID;


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
	
	/**
	 * 
	 * @return
	 */
	public Document getDocument();
	
	/**
	 * install ware
	 * @param wareEntity
	 */
	public void installWare(EtherWareEntity wareEntity);
	
	/**
	 * 
	 * @param wareID
	 * @return
	 */
	public WareEntity getWare(EtherWareID wareID);
	
}
