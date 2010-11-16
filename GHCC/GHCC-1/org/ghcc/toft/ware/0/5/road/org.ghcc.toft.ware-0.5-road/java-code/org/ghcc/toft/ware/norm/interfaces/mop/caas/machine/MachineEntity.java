/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.machine;

import org.ghcc.toft.ware.norm.interfaces.concept.caas.Machine;
import org.ghcc.toft.ware.norm.interfaces.cop.Entity;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.lifecycle.MachineBuilder;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.lifecycle.MachineDriver;


/**
 * MachineEntity
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public interface MachineEntity extends Machine, Entity, MachineCOP, MachineConcept, MachineBuilder, MachineDriver {
}
