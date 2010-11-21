/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define;

import org.dom4j.Namespace;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.define.WareResource;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.define.EtherResource;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.EtherWareEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.lifecycle.EtherWareLoader;


/**
 * EtherWareResource
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-20 00:17:21
 * @version 0.5
 *
 */


public interface EtherWareResource extends WareResource, EtherResource, EtherWareCOPDefine {
	
	/**
	 * 获取命名空间
	 * @return
	 */
	public Namespace getWareNamespace();
	
	/**
	 * 获取资源中的实体
	 * @return
	 */
	public EtherWareEntity getEntity();
	
	/**
	 * 获取实体的加载器
	 * @return
	 */
	public EtherWareLoader getLoader();
	
	/**
	 * 获取实体上下文
	 * @return
	 */
	public EtherWareContext getContext();

}
