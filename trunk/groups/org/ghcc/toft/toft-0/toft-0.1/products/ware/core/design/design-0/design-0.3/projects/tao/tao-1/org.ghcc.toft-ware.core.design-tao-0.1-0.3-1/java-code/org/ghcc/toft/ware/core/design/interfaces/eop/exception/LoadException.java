package org.ghcc.toft.ware.core.design.interfaces.eop.exception;

/**
 * 
 * 加载实体过程中的异常
 * 
 * @author yanchangyou
 * @version 0.3
 * @since 0.1
 *
 */
public class LoadException extends EOPException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -984582587455087754L;
	
	public LoadException() {
		super();
	}
	
	public LoadException(String message) {
		super(message);
	}
}
