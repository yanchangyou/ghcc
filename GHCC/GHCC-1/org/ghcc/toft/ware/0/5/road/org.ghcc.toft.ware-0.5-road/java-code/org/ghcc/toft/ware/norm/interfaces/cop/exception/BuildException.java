/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.cop.exception;



/**
 * BuildException
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public class BuildException extends Exception implements COPException {

	private static final long serialVersionUID = -7312994796536818974L;

	protected Exception javaException;
	
	public BuildException() {
		super();
	}
	public BuildException(Exception javaException) {
		setJavaException(javaException);
	}
	protected void setJavaException(Exception javaException) {
		this.javaException = javaException;
	}

	public Exception getJavaException() {
		return javaException;
	}
}
