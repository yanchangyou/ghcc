/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.define;

import org.ghcc.toft.ware.norm.interfaces.cop.define.Context;
import org.ghcc.toft.ware.norm.interfaces.cop.exception.COPException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.define.FunctionContext;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.define.MachineContext;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.WareEntity;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.exception.WareLoadException;


/**
 * WareContext
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public interface WareContext extends Context, WareCOPDefine {

	/**
	 * machine context 
	 * 
	 * @return
	 */
	public MachineContext getMachineContext();
	
	/**
	 * 加载ware
	 * @param wareInfo
	 * @return
	 */
	public WareEntity loadWareEntity(Object wareInfo) throws WareLoadException, COPException;
	
	/**
	 * 获取功能上下文
	 * @return
	 */
	public FunctionContext getFunctionContext(Object functionContextInfo);
	
}
