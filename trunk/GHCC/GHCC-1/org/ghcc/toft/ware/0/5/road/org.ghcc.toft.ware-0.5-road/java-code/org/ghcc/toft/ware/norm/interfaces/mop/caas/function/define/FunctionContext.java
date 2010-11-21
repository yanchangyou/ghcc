/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.function.define;

import org.ghcc.toft.ware.norm.interfaces.cop.define.Context;
import org.ghcc.toft.ware.norm.interfaces.cop.exception.COPException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.FunctionEntity;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.define.WareContext;


/**
 * FunctionContext
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public interface FunctionContext extends Context, FunctionCOPDefine {
	
	/**
	 * 获取所在的ware上下文
	 * @return
	 */
	public WareContext getWareContext();
	
	/**
	 * 加载功能
	 * @return
	 * @throws COPException 
	 * @throws  
	 */
	public FunctionEntity loadFunction(Object functionInfo) throws COPException;
}
