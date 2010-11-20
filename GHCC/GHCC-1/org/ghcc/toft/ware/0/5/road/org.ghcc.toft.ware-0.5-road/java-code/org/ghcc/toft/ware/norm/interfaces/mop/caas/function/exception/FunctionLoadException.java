/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.function.exception;

import org.ghcc.toft.ware.norm.interfaces.cop.exception.LoadException;


/**
 * FunctionLoadException
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public class FunctionLoadException extends LoadException implements FunctionCOPException {

	private static final long serialVersionUID = 6769592474813470005L;
	
	public FunctionLoadException() {
		super();
	}
	public FunctionLoadException(Exception javaException) {
		super(javaException);
	}
}
