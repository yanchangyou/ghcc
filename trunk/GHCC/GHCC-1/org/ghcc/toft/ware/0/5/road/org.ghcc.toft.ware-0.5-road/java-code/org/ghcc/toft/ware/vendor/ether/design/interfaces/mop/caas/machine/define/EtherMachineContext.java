/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define;

import org.dom4j.Namespace;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.define.MachineContext;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.define.EtherContext;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define.EtherWareContext;


/**
 * EtherMachineContext
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-20 00:17:21
 * @version 0.5
 *
 */


public interface EtherMachineContext extends MachineContext, EtherContext, EtherMachineCOPDefine {

	/**
	 * 获取ware上下文
	 * @return
	 */
	public EtherWareContext getWareContext(Namespace wareNamespace);
}
