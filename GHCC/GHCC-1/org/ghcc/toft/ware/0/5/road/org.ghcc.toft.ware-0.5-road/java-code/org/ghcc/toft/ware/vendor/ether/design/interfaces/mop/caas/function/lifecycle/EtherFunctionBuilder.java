/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.exception.FunctionBuildException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.lifecycle.FunctionBuilder;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.lifecycle.EtherBuilder;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.define.EtherFunctionResource;


/**
 * EtherFunctionBuilder
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-20 00:17:21
 * @version 0.5
 *
 */


public interface EtherFunctionBuilder extends FunctionBuilder, EtherBuilder, EtherFunctionCOPLifeCycle {

	public void build(EtherFunctionResource resource) throws FunctionBuildException;

}
