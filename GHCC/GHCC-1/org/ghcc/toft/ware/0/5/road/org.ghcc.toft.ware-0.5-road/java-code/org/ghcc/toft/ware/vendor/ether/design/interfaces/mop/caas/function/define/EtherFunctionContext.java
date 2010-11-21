/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.define;

import org.dom4j.Element;
import org.ghcc.toft.ware.norm.interfaces.cop.exception.COPException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.define.FunctionContext;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.exception.FunctionLoadException;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.define.EtherContext;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.EtherFunctionEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define.EtherWareContext;


/**
 * EtherFunctionContext
 * 
 * @author code Function
 * @author yanchangyou
 * @date 2010-11-20 00:17:21
 * @version 0.5
 *
 */


public interface EtherFunctionContext extends FunctionContext, EtherContext, EtherFunctionCOPDefine {
	
	/**
	 * 获取此功能所在的ware上下文
	 * @return
	 */
	public EtherWareContext getWareContext();
	
	/**
	 * 加载功能
	 * @return
	 * @throws FunctionLoadException 
	 */
	public EtherFunctionEntity loadFunctionEntity(Element functionElement) throws FunctionLoadException, COPException;
	
}

