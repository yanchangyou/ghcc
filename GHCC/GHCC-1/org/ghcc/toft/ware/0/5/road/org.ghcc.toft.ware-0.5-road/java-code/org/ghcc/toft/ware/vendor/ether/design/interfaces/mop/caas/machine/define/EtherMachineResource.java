/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define;

import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.define.MachineResource;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.define.EtherResource;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.EtherMachineEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.lifecycle.EtherMachineLoader;


/**
 * EtherMachineResource
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-20 00:17:21
 * @version 0.5
 *
 */


public interface EtherMachineResource extends MachineResource, EtherResource, EtherMachineCOPDefine {
	
	/**
	 * 获取资源中的实体
	 * @return
	 */
	public EtherMachineEntity getEntity();
	
	/**
	 * 获取实体的加载器
	 * @return
	 */
	public EtherMachineLoader getLoader();
	
	/**
	 * 获取实体上下文
	 * @return
	 */
	public EtherMachineContext getContext();


}
