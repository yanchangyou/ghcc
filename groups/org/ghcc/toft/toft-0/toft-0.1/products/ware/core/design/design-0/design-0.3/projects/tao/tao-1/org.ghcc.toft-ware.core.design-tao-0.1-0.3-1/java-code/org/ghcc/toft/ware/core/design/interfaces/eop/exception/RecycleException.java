package org.ghcc.toft.ware.core.design.interfaces.eop.exception;

/**
 * 
 * 实体回收过程中的异常
 * 
 * @author yanchangyou
 * @version 0.1
 * @since 0.3
 *
 */
public class RecycleException extends EOPException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7312994796536818974L;
	
	public RecycleException() {
		super();
	}
	
	public RecycleException(String message) {
		super(message);
	}
}
