package org.ghcc.toft.ware.core;

import java.util.Map;

public interface Ware {
	
	/**
	 * 执行
	 * @param context
	 * @throws Exception
	 */
	public void execute(String xmlElement, Map<String,Object> context) throws Exception;
	
	/**
	 * 处理执行过程中的异常, 可以自己处理, 如果处理不了, 就上报上去, 由外界处理
	 * @param WareException
	 * @throws WareException
	 * @throws Exception
	 */
	public void dealExecuteException(Exception WareException) throws Exception;
	
	/**
	 * 执行子节点
	 * @throws Exception
	 */
	public void executeChildElement() throws Exception;
}