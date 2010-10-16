package org.ghcc.toft.ware.core.impl.ether.interfaces.cop;

import org.ghcc.toft.ware.core.design.cop.Driver;

/**
 * EtherDriver
 * 
 * @author yanchangyou
 * @date 2010-10-17 00:08:58
 * @version 0.1
 *
 */
public interface EtherDriver extends Driver {
	/**
	 * 驱动节点执行
	 * @param node
	 * @throws Exception
	 */
	public void drive(EtherNode node) throws Exception;
	
	/**
	 * 处理执行过程中的异常
	 * @param e
	 * @throws Exception
	 */
	public void dealException(Exception e) throws Exception;
}