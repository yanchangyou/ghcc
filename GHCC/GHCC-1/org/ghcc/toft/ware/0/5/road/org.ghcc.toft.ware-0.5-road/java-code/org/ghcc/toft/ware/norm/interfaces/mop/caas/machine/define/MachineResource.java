/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.define;

import org.ghcc.toft.ware.norm.interfaces.cop.define.Resource;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.MachineEntity;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.lifecycle.MachineLoader;


/**
 * MachineResource
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public interface MachineResource extends Resource, MachineCOPDefine {
	
	/**
	 * 获取资源中的实体
	 * @return
	 */
	public MachineEntity getEntity();
	
	/**
	 * 获取实体的加载器
	 * @return
	 */
	public MachineLoader getLoader();
	
	/**
	 * 获取实体上下文
	 * @return
	 */
	public MachineContext getContext();

}
