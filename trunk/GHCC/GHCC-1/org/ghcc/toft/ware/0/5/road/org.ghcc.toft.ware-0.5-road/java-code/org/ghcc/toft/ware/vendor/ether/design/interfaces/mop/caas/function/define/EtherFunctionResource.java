/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.define;

import org.dom4j.Element;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.define.FunctionResource;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.define.EtherResource;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.EtherFunctionEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.lifecycle.EtherFunctionLoader;


/**
 * EtherFunctionResource
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-20 00:17:21
 * @version 0.5
 *
 */


public interface EtherFunctionResource extends FunctionResource, EtherResource, EtherFunctionCOPDefine {
	
	/**
	 * 获取function对于的element
	 * @return
	 */
	public Element getFunctionElement();
	
	/**
	 * 获取资源中的实体
	 * @return
	 */
	public EtherFunctionEntity getEntity();
	
	/**
	 * 获取实体的加载器
	 * @return
	 */
	public EtherFunctionLoader getLoader();
	
	/**
	 * 获取实体上下文
	 * @return
	 */
	public EtherFunctionContext getContext();

}
