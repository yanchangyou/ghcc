/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.exception;

import org.ghcc.toft.ware.norm.interfaces.cop.exception.DriveException;

/**
 * MachineDriveException
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 * 
 */

public class MachineDriveException extends DriveException implements MachineCOPException {

	private static final long serialVersionUID = -2581827724979764176L;

	public MachineDriveException() {
		super();
	}

	public MachineDriveException(Exception javaException) {
		super(javaException);
	}
}
