/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define;

import org.dom4j.Namespace;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.define.WarePathInfo;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.define.EtherPathInfo;


/**
 * EtherWarePathInfo
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-20 00:17:21
 * @version 0.5
 *
 */


public interface EtherWarePathInfo extends WarePathInfo, EtherPathInfo, EtherWareCOPDefine {

	/**
	 * 获取节点的命名空间
	 * @return
	 */
	public Namespace getNamespace();
	
}
