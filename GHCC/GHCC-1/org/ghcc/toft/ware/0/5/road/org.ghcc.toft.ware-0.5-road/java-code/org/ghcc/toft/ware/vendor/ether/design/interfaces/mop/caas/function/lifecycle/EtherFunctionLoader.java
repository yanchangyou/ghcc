/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.FunctionEntity;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.exception.FunctionLoadException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.lifecycle.FunctionLoader;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.lifecycle.EtherLoader;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.define.EtherFunctionID;


/**
 * EtherFunctionLoader
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-20 00:17:21
 * @version 0.5
 *
 */


public interface EtherFunctionLoader extends FunctionLoader, EtherLoader, EtherFunctionCOPLifeCycle {

	public FunctionEntity load(EtherFunctionID id) throws FunctionLoadException;

}
