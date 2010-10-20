package org.ghcc.toft.ware.core.design.interfaces.eop.lifecycle;

import org.ghcc.toft.ware.core.design.interfaces.eop.define.Context;
import org.ghcc.toft.ware.core.design.interfaces.eop.exception.DriveException;
import org.ghcc.toft.ware.core.design.interfaces.eop.exception.EOPException;

/**
 * 
 * 实体驱动
 * 
 * @author yanchangyou
 * @version 0.3
 * @since 0.1
 *
 */
public interface Driver extends LifeCycle {
	
	/**
	 * 驱动实体执行
	 * @param node
	 * @throws Exception
	 */
	public void drive(Context context) throws DriveException;
	
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
	public void driveWithDealException(Context context) throws EOPException;
	
}