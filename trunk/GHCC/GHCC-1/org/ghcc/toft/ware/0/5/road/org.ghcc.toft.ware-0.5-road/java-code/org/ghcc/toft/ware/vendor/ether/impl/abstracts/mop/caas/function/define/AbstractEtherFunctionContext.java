/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.function.define;

import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.define.EtherFunctionContext;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define.EtherWareContext;


/**
 * AbstractEtherFunctionContext
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 01:24:18
 * @version 0.5
 *
 */


public abstract class AbstractEtherFunctionContext implements EtherFunctionContext {

	public AbstractEtherFunctionContext(EtherWareContext wareContext) {
		setWareContext(wareContext);
	}
	
	private EtherWareContext wareContext;

	/**
	 * @param wareContext the wareContext to set
	 */
	public void setWareContext(EtherWareContext wareContext) {
		this.wareContext = wareContext;
	}
	/**
	 * @return the wareContext
	 */
	public EtherWareContext getWareContext() {
		return wareContext;
	}
}
