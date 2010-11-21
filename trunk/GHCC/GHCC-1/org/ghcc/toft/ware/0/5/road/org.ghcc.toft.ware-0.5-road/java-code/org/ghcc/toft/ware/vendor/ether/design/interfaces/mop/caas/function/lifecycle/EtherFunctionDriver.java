/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.cop.exception.COPException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.exception.FunctionDriveException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.lifecycle.FunctionDriver;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.lifecycle.EtherDriver;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.define.EtherFunctionContext;


/**
 * EtherFunctionDriver
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-20 00:17:21
 * @version 0.5
 *
 */


public interface EtherFunctionDriver extends FunctionDriver, EtherDriver, EtherFunctionCOPLifeCycle {

	public void drive(EtherFunctionContext context) throws FunctionDriveException, COPException;

}
