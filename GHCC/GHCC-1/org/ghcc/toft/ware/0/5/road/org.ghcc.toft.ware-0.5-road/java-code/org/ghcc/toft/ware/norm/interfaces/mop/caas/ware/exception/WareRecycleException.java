/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.exception;

import org.ghcc.toft.ware.norm.interfaces.cop.exception.RecycleException;


/**
 * WareRecycleException
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public class WareRecycleException extends RecycleException implements WareCOPException {

	private static final long serialVersionUID = 2632832732068886515L;
	
	public WareRecycleException() {
		super();
	}
	public WareRecycleException(Exception javaException) {
		super(javaException);
	}
}