/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define;

import org.dom4j.Element;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.define.WareResource;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.define.EtherResource;


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
	
	public Element getFunctionElement();

}
