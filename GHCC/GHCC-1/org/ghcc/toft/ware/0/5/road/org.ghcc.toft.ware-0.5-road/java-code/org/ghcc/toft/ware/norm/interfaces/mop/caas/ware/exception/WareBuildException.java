/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.exception;

import org.ghcc.toft.ware.norm.interfaces.cop.exception.BuildException;


/**
 * WareBuildException
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public class WareBuildException extends BuildException implements WareCOPException {

	private static final long serialVersionUID = 4758635159557818644L;
	
	public WareBuildException() {
		super();
	}
	public WareBuildException(Exception javaException) {
		super(javaException);
	}
}
