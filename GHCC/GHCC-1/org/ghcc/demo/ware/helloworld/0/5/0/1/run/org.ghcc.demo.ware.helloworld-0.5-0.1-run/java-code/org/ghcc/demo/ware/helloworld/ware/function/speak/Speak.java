/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.demo.ware.helloworld.ware.function.speak;

import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.exception.FunctionDriveException;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.define.EtherFunctionContext;
import org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.function.AbstractEtherFunctionEntity;

/**
 * Speak
 * 
 * @author yanchangyou
 * @date 2010-11-20 下午10:42:00
 * @version 0.1-1-1
 *
 */

public class Speak extends AbstractEtherFunctionEntity {

	/**
	 * @param context
	 * @throws FunctionDriveException
	 */
	public void drive(EtherFunctionContext context) throws FunctionDriveException {
		System.out.println(this.getFunctionElement().getText());
	}

}
