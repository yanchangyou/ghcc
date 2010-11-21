/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.ware.define;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.dom4j.Element;
import org.dom4j.Namespace;
import org.ghcc.toft.ware.norm.interfaces.cop.exception.COPException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.exception.WareLoadException;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.define.EtherFunctionContext;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define.EtherMachineContext;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.EtherWareEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define.EtherWareID;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.lifecycle.EtherWareLoader;
import org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.ware.define.AbstractEtherWareContext;
import org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.function.define.DefaultEtherFunctionContext;
import org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.ware.lifecycle.DefaultEtherWareLoader;


/**
 * DefaultEtherWareContext
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 23:55:27
 * @version 0.5
 *
 */


public class DefaultEtherWareContext extends AbstractEtherWareContext {

	protected Map<Element, EtherFunctionContext> functionContextMap;
	protected Map<Namespace, EtherWareLoader> wareLoaderMap;
	
	/**
	 * @param machineContext
	 */
	public DefaultEtherWareContext(EtherMachineContext machineContext) {
		super(machineContext);
		functionContextMap = new HashMap<Element, EtherFunctionContext>();
		wareLoaderMap = new HashMap<Namespace, EtherWareLoader>();
	}

	/**
	 * @return
	 */
	public EtherFunctionContext getFunctionContext(Element functionElement) {
		EtherFunctionContext functionContext = functionContextMap.get(functionElement);
		if (functionContext == null) {
			functionContext = new DefaultEtherFunctionContext(this);
			functionContextMap.put(functionElement, functionContext);
		}
		return functionContext;
	
	}

	/**
	 * @param wareNamespace
	 * @return
	 * @throws COPException 
	 * @throws WareLoadException 
	 */
	public EtherWareEntity loadWareEntity(Namespace wareNamespace) throws WareLoadException, COPException {
		EtherWareLoader wareLoader = null;
		try {
			wareLoader = getEtherWareLoader(wareNamespace);
		} catch (MalformedURLException e) {
			throw new WareLoadException(e);
		}
		EtherWareID wareID = new DefaultEtherWareID(wareNamespace);
		
		EtherWareEntity wareEntity = wareLoader.load(wareID);
		wareEntity.build(new DefaultEtherWareResource(wareNamespace, wareEntity, wareLoader, this));
		wareEntity.setWareID(wareID);
		wareEntity.setWareLoader(wareLoader);
		return wareEntity;
	}
	
	public EtherWareLoader getEtherWareLoader(Namespace wareNamespace) throws MalformedURLException {
		EtherWareLoader wareLoader = wareLoaderMap.get(wareNamespace);
		if (wareLoader == null) {
			wareLoader = new DefaultEtherWareLoader(new DefaultEtherWarePathInfo(wareNamespace));
			wareLoaderMap.put(wareNamespace, wareLoader);
		}
		return wareLoaderMap.get(wareNamespace);
	}
}
