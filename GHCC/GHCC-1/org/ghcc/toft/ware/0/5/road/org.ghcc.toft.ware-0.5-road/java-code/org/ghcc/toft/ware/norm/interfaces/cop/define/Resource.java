/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.cop.define;

import org.ghcc.toft.ware.norm.interfaces.cop.Entity;
import org.ghcc.toft.ware.norm.interfaces.cop.lifecycle.Loader;



/**
 * Resource
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public interface Resource extends COPDefine {
	
	/**
	 * 获取资源中的实体
	 * @return
	 */
	public Entity getEntity();
	
	/**
	 * 获取实体的加载器
	 * @return
	 */
	public Loader getLoader();
	
	/**
	 * 获取实体上下文
	 * @return
	 */
	public Context getContext();
}
