/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.function.exception;

import org.ghcc.toft.ware.norm.interfaces.concept.caas.Function;
import org.ghcc.toft.ware.norm.interfaces.cop.exception.LoadException;


/**
 * FunctionLoadException
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 21:10:15
 * @version 0.1-0.1-1
 *
 */


public class FunctionLoadException extends LoadException implements Function, FunctionCOPException {

	/**
	 * @param e
	 */
	public FunctionLoadException(Exception e) {
		this.javaException = e;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 6769592474813470005L;
}
