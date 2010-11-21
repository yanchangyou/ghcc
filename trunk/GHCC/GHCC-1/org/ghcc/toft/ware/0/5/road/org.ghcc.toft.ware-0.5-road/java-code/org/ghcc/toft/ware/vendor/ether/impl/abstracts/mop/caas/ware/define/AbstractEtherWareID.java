/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.ware.define;

import org.dom4j.Namespace;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define.EtherWareID;
import org.ghcc.toft.ware.vendor.ether.util.entity.WareUtil;


/**
 * AbstractEtherWareID
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 01:24:18
 * @version 0.5
 *
 */


public class AbstractEtherWareID implements EtherWareID {
	
	protected String id;
	
	protected Namespace namespace;
	
	public AbstractEtherWareID(Namespace namespace) {
		this.namespace = namespace;
		if (!WareUtil.checkWareID(namespace)) {
			throw new RuntimeException("ware id is invalid, id shoud match" + WareUtil.WARE_ID_PATTERN);
		}
	}

	/**
	 * @return
	 */
	public String getWareClassName() {
		return WareUtil.getWareClassName(namespace);
	}

	/**
	 * @return
	 */
	public String getID() {
		return WareUtil.getWareID(namespace);
	}
}
