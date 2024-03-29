/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.function.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.concept.caas.Function;
import org.ghcc.toft.ware.norm.interfaces.cop.lifecycle.Driver;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.define.FunctionContext;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.exception.FunctionDriveException;


/**
 * FunctionDriver
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 21:10:15
 * @version 0.1-0.1-1
 *
 */


public interface FunctionDriver extends Function, Driver, FunctionCOPLifeCycle {

	public void drive(FunctionContext context) throws FunctionDriveException;

}
