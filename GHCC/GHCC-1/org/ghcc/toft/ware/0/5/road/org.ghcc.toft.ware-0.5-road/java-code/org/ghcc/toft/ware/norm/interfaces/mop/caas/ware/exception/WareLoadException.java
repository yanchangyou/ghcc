/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.exception;

import org.ghcc.toft.ware.norm.interfaces.cop.exception.LoadException;


/**
 * WareLoadException
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public class WareLoadException extends LoadException implements WareCOPException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4476768262925050136L;
	
	public WareLoadException(Exception e)  {
		this.javaException = e;
	}
	public WareLoadException()  {
	}
	
}
