/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.machine.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.cop.Entity;
import org.ghcc.toft.ware.norm.interfaces.cop.define.ID;
import org.ghcc.toft.ware.norm.interfaces.cop.exception.LoadException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.MachineEntity;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.define.MachineID;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.exception.MachineLoadException;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define.EtherMachineID;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.lifecycle.EtherMachineLoader;


/**
 * AbstractEtherMachineLoader
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 01:24:18
 * @version 0.5
 *
 */


public abstract class AbstractEtherMachineLoader implements EtherMachineLoader {

	/**
	 * norm -> disign
	 * 
	 * @param id
	 * @return
	 * @throws MachineLoadException
	 */
	public MachineEntity load(MachineID id) throws MachineLoadException {
		return load((EtherMachineID)id);
	}

	/**
	 * norm -> design
	 * 
	 * @param id
	 * @return
	 * @throws LoadException
	 */
	public Entity load(ID id) throws LoadException {
		return load((MachineID)id);
	}
}
