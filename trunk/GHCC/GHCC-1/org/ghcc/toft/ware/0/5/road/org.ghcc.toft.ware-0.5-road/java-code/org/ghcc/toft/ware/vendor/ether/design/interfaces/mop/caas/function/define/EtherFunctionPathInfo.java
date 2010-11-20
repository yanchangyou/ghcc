/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.define;

import org.dom4j.Namespace;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.define.FunctionPathInfo;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.define.EtherPathInfo;


/**
 * EtherFunctionPathInfo
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-20 00:17:21
 * @version 0.5
 *
 */


public interface EtherFunctionPathInfo extends FunctionPathInfo, EtherPathInfo, EtherFunctionCOPDefine {
	
	public Namespace getNamespace();
	
}
