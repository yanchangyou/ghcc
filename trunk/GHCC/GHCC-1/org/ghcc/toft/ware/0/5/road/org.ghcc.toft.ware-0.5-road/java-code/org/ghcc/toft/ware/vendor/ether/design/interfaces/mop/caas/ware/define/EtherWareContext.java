/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define;

import java.net.MalformedURLException;

import org.dom4j.Element;
import org.dom4j.Namespace;
import org.ghcc.toft.ware.norm.interfaces.cop.exception.COPException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.define.WareContext;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.exception.WareLoadException;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.define.EtherContext;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.define.EtherFunctionContext;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define.EtherMachineContext;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.EtherWareEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.lifecycle.EtherWareLoader;


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
	
	/**
	 * machine context
	 * @return
	 */
	public EtherMachineContext getMachineContext();
	
	/**
	 * 加载ware
	 * @param wareNamespace
	 * @return
	 * @throws COPException 
	 */
	public EtherWareEntity loadWareEntity(Namespace wareNamespace) throws WareLoadException, COPException;
	
	/**
	 * 获取功能上下文
	 * @return
	 */
	public EtherFunctionContext getFunctionContext(Element functionElement);
	
	/**
	 * 获取加载器
	 * @param wareNamespace
	 * @return
	 * @throws MalformedURLException
	 */
	public EtherWareLoader getEtherWareLoader(Namespace wareNamespace) throws MalformedURLException ;

}
