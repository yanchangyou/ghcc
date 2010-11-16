/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.cop.exception;



/**
 * LoadException
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public class LoadException extends Exception implements COPException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -984582587455087754L;
	
	protected Exception javaException;
	
	public LoadException() {
		super();
	}
	public LoadException(Exception javaException) {
		setJavaException(javaException);
	}
	protected void setJavaException(Exception javaException) {
		this.javaException = javaException;
	}

	public Exception getJavaException() {
		return javaException;
	}
}
