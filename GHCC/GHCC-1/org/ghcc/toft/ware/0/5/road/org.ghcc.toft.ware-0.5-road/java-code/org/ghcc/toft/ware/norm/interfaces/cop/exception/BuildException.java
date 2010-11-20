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


public class BuildException extends COPException {

	private static final long serialVersionUID = -7312994796536818974L;

	public BuildException() {
		super();
	}
	public BuildException(Exception javaException) {
		super(javaException);
	}
}
