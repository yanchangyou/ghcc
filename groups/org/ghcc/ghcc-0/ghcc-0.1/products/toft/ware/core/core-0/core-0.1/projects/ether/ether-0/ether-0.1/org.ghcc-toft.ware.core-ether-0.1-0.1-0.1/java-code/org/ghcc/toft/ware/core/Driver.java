package org.ghcc.toft.ware.core;

import java.util.Map;

/**
 * 驱动, 支持异常处理机制
 * @author yanchangyou
 *
 */
public interface Driver {

	/**
	 * 驱动执行
	 * @param context
	 * @throws Exception
	 */
	public void drive(Map<String, Object> context) throws Exception;
	
	/**
	 * 处理执行过程中的异常, 可以自己处理, 如果处理不了, 就上报上去, 由外界处理
	 * @param WareException
	 * @throws WareException
	 * @throws Exception
	 */
	public void dealWareException(Exception WareException) throws Exception;
	
}
