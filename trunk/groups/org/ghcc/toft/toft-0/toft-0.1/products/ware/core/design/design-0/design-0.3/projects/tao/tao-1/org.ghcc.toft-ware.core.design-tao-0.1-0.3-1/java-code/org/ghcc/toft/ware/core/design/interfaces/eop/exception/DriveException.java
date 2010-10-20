package org.ghcc.toft.ware.core.design.interfaces.eop.exception;

/**
 * 
 * 实体驱动执行过程中的异常
 * 
 * @author yanchangyou
 * @version 0.2
 * @since 0.2
 *
 */
public class DriveException extends EOPException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8700814991757758068L;
	public DriveException() {
		super();
	}
	
	public DriveException(String message) {
		super(message);
	}
}
