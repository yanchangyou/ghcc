/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.function.exception;

import org.ghcc.toft.ware.norm.interfaces.cop.exception.RecycleException;


/**
 * FunctionRecycleException
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public class FunctionRecycleException extends RecycleException implements FunctionCOPException {

	private static final long serialVersionUID = 7399807905459346418L;
	
	public FunctionRecycleException() {
		super();
	}
	public FunctionRecycleException(Exception javaException) {
		super(javaException);
	}
}
