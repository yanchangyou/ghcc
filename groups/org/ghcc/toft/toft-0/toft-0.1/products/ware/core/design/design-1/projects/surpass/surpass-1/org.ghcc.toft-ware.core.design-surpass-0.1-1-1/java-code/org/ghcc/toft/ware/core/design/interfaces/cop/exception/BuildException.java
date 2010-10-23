/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.design.interfaces.cop.exception;



/**
 * BuildException
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 21:10:15
 * @version 0.1-1-1
 *
 */


public class BuildException extends Exception implements COPException {

	private static final long serialVersionUID = -7312994796536818974L;

	protected Exception javaException;
	
	public void setJavaException(Exception javaException) {
		this.javaException = javaException;
	}

	public Exception getJavaException() {
		return javaException;
	}
}
