/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.define;

import org.ghcc.toft.ware.norm.interfaces.cop.define.Resource;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.WareEntity;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.lifecycle.WareLoader;


/**
 * WareResource
 * 
 * @author code Ware
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public interface WareResource extends Resource, WareCOPDefine {
	
	/**
	 * 获取资源中的实体
	 * @return
	 */
	public WareEntity getEntity();
	
	/**
	 * 获取实体的加载器
	 * @return
	 */
	public WareLoader getLoader();
	
	/**
	 * 获取实体上下文
	 * @return
	 */
	public WareContext getContext();

}
