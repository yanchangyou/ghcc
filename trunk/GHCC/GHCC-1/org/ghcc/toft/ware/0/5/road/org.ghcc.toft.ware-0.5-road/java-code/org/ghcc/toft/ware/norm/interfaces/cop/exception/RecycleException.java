/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.cop.exception;



/**
 * RecycleException
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public class RecycleException extends Exception implements COPException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4473781849900244454L;
	
	protected Exception javaException;
	
	public RecycleException() {
		super();
	}
	public RecycleException(Exception javaException) {
		setJavaException(javaException);
	}
	protected void setJavaException(Exception javaException) {
		this.javaException = javaException;
	}

	public Exception getJavaException() {
		return javaException;
	}
}
