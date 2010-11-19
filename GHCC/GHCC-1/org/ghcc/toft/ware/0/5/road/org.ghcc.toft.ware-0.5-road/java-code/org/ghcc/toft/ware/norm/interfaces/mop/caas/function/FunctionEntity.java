/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.function;

import org.ghcc.toft.ware.norm.interfaces.cop.Entity;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.lifecycle.FunctionBuilder;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.lifecycle.FunctionDriver;


/**
 * FunctionEntity
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public interface FunctionEntity extends Entity, FunctionCOP, FunctionConcept, FunctionBuilder, FunctionDriver {
}
