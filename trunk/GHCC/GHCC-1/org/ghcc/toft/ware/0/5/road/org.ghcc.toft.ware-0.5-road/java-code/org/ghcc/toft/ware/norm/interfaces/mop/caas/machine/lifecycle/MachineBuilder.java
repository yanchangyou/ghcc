/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.concept.caas.Machine;
import org.ghcc.toft.ware.norm.interfaces.cop.lifecycle.Builder;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.define.MachineResource;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.exception.MachineBuildException;


/**
 * MachineBuilder
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public interface MachineBuilder extends Machine, Builder, MachineCOPLifeCycle {

	public void build(MachineResource resource) throws MachineBuildException;

}
