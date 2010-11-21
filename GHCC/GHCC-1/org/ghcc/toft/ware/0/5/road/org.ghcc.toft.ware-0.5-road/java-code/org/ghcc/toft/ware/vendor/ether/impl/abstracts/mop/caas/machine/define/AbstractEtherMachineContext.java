/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.machine.define;

import org.dom4j.Namespace;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.define.WareContext;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define.EtherMachineContext;


/**
 * AbstractEtherMachineContext
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 01:24:18
 * @version 0.5
 *
 */


public abstract class AbstractEtherMachineContext implements EtherMachineContext {

	/**
	 * @param wareInfo
	 * @return
	 */
	public WareContext getWareContext(Object wareContextInfo) {
		return getWareContext((Namespace)wareContextInfo);
	}
}
