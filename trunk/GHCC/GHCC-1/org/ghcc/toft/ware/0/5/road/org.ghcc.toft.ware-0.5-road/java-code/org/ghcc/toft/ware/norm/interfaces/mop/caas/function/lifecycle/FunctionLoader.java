/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.function.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.cop.lifecycle.Loader;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.FunctionEntity;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.define.FunctionID;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.exception.FunctionLoadException;


/**
 * FunctionLoader
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public interface FunctionLoader extends Loader, FunctionCOPLifeCycle {

	public FunctionEntity load(FunctionID id) throws FunctionLoadException;

}
