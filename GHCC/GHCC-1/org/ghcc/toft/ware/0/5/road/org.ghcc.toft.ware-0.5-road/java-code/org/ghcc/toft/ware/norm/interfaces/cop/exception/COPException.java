/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.cop.exception;

import org.ghcc.toft.ware.norm.interfaces.cop.COP;



/**
 * COPException
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public class COPException extends Exception implements COP {

	private static final long serialVersionUID = -7664477931160534141L;
	
	protected Exception javaException;
	
	public COPException() {
		super();
	}
	public COPException(Exception javaException) {
		setJavaException(javaException);
	}
	protected void setJavaException(Exception javaException) {
		this.javaException = javaException;
	}

	public Exception getJavaException() {
		return javaException;
	}
}
