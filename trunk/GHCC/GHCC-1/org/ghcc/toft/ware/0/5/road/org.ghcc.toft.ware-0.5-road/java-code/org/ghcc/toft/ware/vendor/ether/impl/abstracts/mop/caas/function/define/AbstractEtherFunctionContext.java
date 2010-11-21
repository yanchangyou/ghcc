/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.function.define;

import org.dom4j.Element;
import org.ghcc.toft.ware.norm.interfaces.cop.exception.COPException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.FunctionEntity;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.exception.FunctionLoadException;
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

	protected EtherWareContext wareContext;
	
	public AbstractEtherFunctionContext(EtherWareContext wareContext) {
		this.wareContext = wareContext;
	}
	
	/**
	 * @param functionInfo
	 * @return
	 * @throws FunctionLoadException 
	 * @throws COPException 
	 */
	public FunctionEntity loadFunction(Object functionInfo) throws FunctionLoadException, COPException {
		return loadFunctionEntity((Element)functionInfo);
	}

	/**
	 * @return
	 */
	public EtherWareContext getWareContext() {
		return wareContext;
	}	
}
