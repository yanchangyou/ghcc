/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.function;

import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.exception.FunctionDriveException;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.define.EtherFunctionContext;
import org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.function.AbstractEtherFunctionEntity;

/**
 * DefaultEtherFunctionEntity
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 23:55:27
 * @version 0.5
 * 
 */

public class DefaultEtherFunctionEntity extends AbstractEtherFunctionEntity {

	/**
	 * @param context
	 * @throws FunctionDriveException
	 */
	public void drive(EtherFunctionContext context) throws FunctionDriveException {
		System.out.println("function drive...");
		System.out.println(this.getFunctionResource().getFunctionElement().asXML());
	}
}
