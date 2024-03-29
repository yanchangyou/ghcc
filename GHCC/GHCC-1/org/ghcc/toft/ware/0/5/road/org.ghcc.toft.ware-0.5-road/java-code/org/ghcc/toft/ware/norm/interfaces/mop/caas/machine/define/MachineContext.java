/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.define;

import org.ghcc.toft.ware.norm.interfaces.cop.define.Context;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.define.WareContext;


/**
 * MachineContext
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public interface MachineContext extends Context, MachineCOPDefine {

	/**
	 * 获取ware上下文
	 * @return
	 */
	public WareContext getWareContext(Object wareContextInfo);
}
