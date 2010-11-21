/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.function.define;

import org.ghcc.toft.ware.norm.interfaces.cop.define.Resource;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.FunctionEntity;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.lifecycle.FunctionLoader;


/**
 * FunctionResource
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public interface FunctionResource extends Resource, FunctionCOPDefine {
	
	/**
	 * 获取资源中的实体
	 * @return
	 */
	public FunctionEntity getEntity();
	
	/**
	 * 获取实体的加载器
	 * @return
	 */
	public FunctionLoader getLoader();
	
	/**
	 * 获取实体上下文
	 * @return
	 */
	public FunctionContext getContext();

}
