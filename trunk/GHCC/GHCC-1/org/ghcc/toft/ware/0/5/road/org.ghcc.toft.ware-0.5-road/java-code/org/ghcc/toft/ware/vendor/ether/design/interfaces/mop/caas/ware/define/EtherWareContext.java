/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define;

import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.define.WareContext;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.define.EtherContext;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define.EtherMachineContext;


/**
 * EtherWareContext
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-20 00:17:21
 * @version 0.5
 *
 */


public interface EtherWareContext extends WareContext, EtherContext, EtherWareCOPDefine {
	
	public void setMachineContext(EtherMachineContext machineContext);
	
}
