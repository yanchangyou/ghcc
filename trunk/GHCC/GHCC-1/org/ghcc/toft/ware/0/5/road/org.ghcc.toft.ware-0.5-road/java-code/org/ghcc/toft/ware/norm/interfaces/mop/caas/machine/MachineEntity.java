/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.machine;

import org.ghcc.toft.ware.norm.interfaces.cop.Entity;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.lifecycle.MachineBuilder;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.lifecycle.MachineDriver;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.WareEntity;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.define.WareID;


/**
 * MachineEntity
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public interface MachineEntity extends Entity, MachineCOP, MachineConcept, MachineBuilder, MachineDriver {
	
	/**
	 * install ware
	 * @param wareEntity
	 */
	public void installWare(WareEntity wareEntity);
	
	/**
	 * 
	 * @param wareID
	 * @return
	 */
	public WareEntity getWare(WareID wareID);
	
}
