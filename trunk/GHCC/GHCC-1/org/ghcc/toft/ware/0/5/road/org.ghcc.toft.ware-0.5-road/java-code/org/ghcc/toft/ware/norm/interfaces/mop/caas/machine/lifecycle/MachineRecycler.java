/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.cop.lifecycle.Recycler;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.MachineEntity;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.exception.MachineRecycleException;


/**
 * MachineRecycler
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public interface MachineRecycler extends Recycler, MachineCOPLifeCycle {

	public void recycly(MachineEntity entity) throws MachineRecycleException;

}
