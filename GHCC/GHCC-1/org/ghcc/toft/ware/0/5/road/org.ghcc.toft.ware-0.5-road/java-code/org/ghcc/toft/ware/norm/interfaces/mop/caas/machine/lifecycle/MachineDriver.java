/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.cop.lifecycle.Driver;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.define.MachineContext;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.exception.MachineDriveException;


/**
 * MachineDriver
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public interface MachineDriver extends Driver, MachineCOPLifeCycle {

	public void drive(MachineContext context) throws MachineDriveException;

}
