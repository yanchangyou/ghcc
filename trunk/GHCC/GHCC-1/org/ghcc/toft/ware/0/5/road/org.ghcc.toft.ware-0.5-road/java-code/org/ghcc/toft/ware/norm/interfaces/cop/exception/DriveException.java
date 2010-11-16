/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.cop.exception;



/**
 * DriveException
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public class DriveException extends Exception implements COPException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8700814991757758068L;
	
	protected Exception javaException;
	
	public DriveException() {
		super();
	}
	public DriveException(Exception javaException) {
		setJavaException(javaException);
	}
	protected void setJavaException(Exception javaException) {
		this.javaException = javaException;
	}

	public Exception getJavaException() {
		return javaException;
	}
}
