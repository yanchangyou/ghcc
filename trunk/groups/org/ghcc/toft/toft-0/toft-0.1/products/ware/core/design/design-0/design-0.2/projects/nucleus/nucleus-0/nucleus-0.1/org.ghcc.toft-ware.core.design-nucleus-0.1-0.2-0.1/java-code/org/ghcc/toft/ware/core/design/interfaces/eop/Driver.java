package org.ghcc.toft.ware.core.design.interfaces.eop;

import org.ghcc.toft.ware.core.design.interfaces.eop.exception.EOPException;
import org.ghcc.toft.ware.core.design.interfaces.eop.exception.DriveException;

/**
 * Driver
 * 
 * @author yanchangyou
 * @date 2010-10-17 00:08:58
 * @version 0.1
 *
 */
public interface Driver extends EOP {
	/**
	 * 驱动实体执行
	 * @param node
	 * @throws Exception
	 */
	public void drive() throws DriveException;
	
	/**
	 * 处理执行过程中的异常
	 * @param e
	 * @throws Exception
	 */
	public void dealException(DriveException e) throws EOPException;
	
	/**
	 * 执行并处理异常
	 * @param node
	 * @throws Exception
	 */
	public void driveWithDealException() throws EOPException;
	
}