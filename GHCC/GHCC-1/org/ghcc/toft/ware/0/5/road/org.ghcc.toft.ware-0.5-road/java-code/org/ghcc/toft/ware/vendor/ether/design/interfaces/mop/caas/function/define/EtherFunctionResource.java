/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.define;

import org.dom4j.Element;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.define.FunctionResource;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.define.EtherResource;


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
	
}
