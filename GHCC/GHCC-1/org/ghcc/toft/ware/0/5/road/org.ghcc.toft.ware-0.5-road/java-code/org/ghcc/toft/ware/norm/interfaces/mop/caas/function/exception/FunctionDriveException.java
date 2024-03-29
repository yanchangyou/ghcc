/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.function.exception;

import org.ghcc.toft.ware.norm.interfaces.cop.exception.DriveException;


/**
 * FunctionDriveException
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public class FunctionDriveException extends DriveException implements FunctionCOPException {

	private static final long serialVersionUID = -7116422318339972248L;
	
	public FunctionDriveException() {
		super();
	}
	public FunctionDriveException(Exception javaException) {
		super(javaException);
	}
}
