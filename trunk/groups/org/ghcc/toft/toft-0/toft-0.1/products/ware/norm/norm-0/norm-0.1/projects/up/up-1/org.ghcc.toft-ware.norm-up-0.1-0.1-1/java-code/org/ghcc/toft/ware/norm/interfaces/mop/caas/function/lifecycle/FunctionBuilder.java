/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.function.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.concept.caas.Function;
import org.ghcc.toft.ware.norm.interfaces.cop.lifecycle.Builder;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.define.FunctionResource;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.exception.FunctionBuildException;


/**
 * FunctionBuilder
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 21:10:15
 * @version 0.1-0.1-1
 *
 */


public interface FunctionBuilder extends Function, Builder, FunctionCOPLifeCycle {

	public void build(FunctionResource resource) throws FunctionBuildException;

}
