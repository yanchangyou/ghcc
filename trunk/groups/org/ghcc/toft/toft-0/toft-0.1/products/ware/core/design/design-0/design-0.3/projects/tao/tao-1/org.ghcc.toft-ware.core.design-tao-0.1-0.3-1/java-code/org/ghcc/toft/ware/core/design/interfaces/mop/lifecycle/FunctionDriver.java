package org.ghcc.toft.ware.core.design.interfaces.mop.lifecycle;

/**
 * FunctionDriver
 * 
 * @author yanchangyou
 * @date 2010-10-20 23:53:17
 * @version 0.1
 * @since 0.3
 *
 */
import org.ghcc.toft.ware.core.design.interfaces.caas.Function;
import org.ghcc.toft.ware.core.design.interfaces.eop.exception.DriveException;
import org.ghcc.toft.ware.core.design.interfaces.eop.exception.EOPException;
import org.ghcc.toft.ware.core.design.interfaces.eop.lifecycle.Driver;
import org.ghcc.toft.ware.core.design.interfaces.mop.define.FunctionContext;
import org.ghcc.toft.ware.core.design.interfaces.mop.exception.FunctionDriveException;

public interface FunctionDriver extends Function, Driver {

	/**
	 * 驱动实体执行
	 * @param node
	 * @throws Exception
	 */
	public void drive(FunctionContext functionContext) throws FunctionDriveException;
	
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
	public void driveWithDealException(FunctionContext functionContext) throws EOPException;
}