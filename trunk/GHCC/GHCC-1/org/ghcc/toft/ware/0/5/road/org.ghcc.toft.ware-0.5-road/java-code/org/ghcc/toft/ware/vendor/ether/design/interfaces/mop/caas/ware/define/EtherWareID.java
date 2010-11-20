/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define;

import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.define.WareID;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.define.EtherID;


/**
 * EtherWareID
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-20 00:17:21
 * @version 0.5
 *
 */


public interface EtherWareID extends WareID, EtherID, EtherWareCOPDefine {
	
	/**
	 * get ware class name
	 * @return
	 */
	public String getWareClassName();
	
}
