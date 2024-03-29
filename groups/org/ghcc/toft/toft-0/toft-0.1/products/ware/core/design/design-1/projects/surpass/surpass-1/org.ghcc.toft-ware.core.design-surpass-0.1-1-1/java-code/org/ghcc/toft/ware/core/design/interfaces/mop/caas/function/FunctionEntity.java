/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.design.interfaces.mop.caas.function;

import org.ghcc.toft.ware.core.design.interfaces.concept.caas.Function;
import org.ghcc.toft.ware.core.design.interfaces.cop.Entity;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.function.lifecycle.FunctionBuilder;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.function.lifecycle.FunctionDriver;


/**
 * FunctionEntity
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 21:10:15
 * @version 0.1-1-1
 *
 */


public interface FunctionEntity extends Function, Entity, FunctionCOP, FunctionConcept, FunctionBuilder, FunctionDriver {
}
