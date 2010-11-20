/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.define;

import org.dom4j.Element;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.define.FunctionID;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.define.EtherID;


/**
 * EtherFunctionID
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-20 00:17:21
 * @version 0.5
 *
 */


public interface EtherFunctionID extends FunctionID, EtherID, EtherFunctionCOPDefine {
	
	/**
	 * 获取function的类名
	 * @return
	 */
	public String getFunctionClassName();
	
	/**
	 * 获取function elements
	 * @return
	 */
	public Element getFunctionElement();
}
