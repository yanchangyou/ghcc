/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.ware.define;

import org.dom4j.Element;
import org.dom4j.Namespace;
import org.ghcc.toft.ware.norm.interfaces.cop.exception.COPException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.define.FunctionContext;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.WareEntity;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.exception.WareLoadException;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define.EtherMachineContext;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define.EtherWareContext;

/**
 * AbstractEtherWareContext
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 01:24:18
 * @version 0.5
 * 
 */

public abstract class AbstractEtherWareContext implements EtherWareContext {

	protected EtherMachineContext machineContext;
	
	public AbstractEtherWareContext(EtherMachineContext machineContext) {
		this.machineContext = machineContext;
	}

	/**
	 * @return
	 */
	public EtherMachineContext getMachineContext() {
		return machineContext;
	}

	/**
	 * @param wareInfo
	 * @return
	 * @throws COPException 
	 * @throws WareLoadException 
	 */
	public WareEntity loadWareEntity(Object wareInfo) throws WareLoadException, COPException {
		return loadWareEntity((Namespace)wareInfo);
	}

	/**
	 * @param functionContextInfo
	 * @return
	 */
	public FunctionContext getFunctionContext(Object functionContextInfo) {
		return getFunctionContext((Element)functionContextInfo);
	}
}
