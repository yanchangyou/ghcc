/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.concept.caas.Machine;
import org.ghcc.toft.ware.norm.interfaces.cop.lifecycle.Loader;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.MachineEntity;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.define.MachineID;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.define.MachinePathInfo;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.exception.MachineLoadException;


/**
 * MachineLoader
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public interface MachineLoader extends Machine, Loader, MachineCOPLifeCycle {

	public MachineEntity load(MachineID id) throws MachineLoadException;

	public MachineEntity load(MachinePathInfo pathInfo, MachineID id) throws MachineLoadException;

}
