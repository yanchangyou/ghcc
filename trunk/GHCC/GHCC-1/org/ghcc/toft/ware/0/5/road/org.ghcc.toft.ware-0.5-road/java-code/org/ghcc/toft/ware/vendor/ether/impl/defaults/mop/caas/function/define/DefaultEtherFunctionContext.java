/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.function.define;

import java.net.MalformedURLException;

import org.dom4j.Element;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.exception.FunctionBuildException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.exception.FunctionLoadException;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.EtherFunctionEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.define.EtherFunctionID;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.lifecycle.EtherFunctionLoader;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define.EtherWareContext;
import org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.function.define.AbstractEtherFunctionContext;
import org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.function.lifecycle.DefaultEtherFunctionLoader;


/**
 * DefaultEtherFunctionContext
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 23:55:27
 * @version 0.5
 *
 */


public class DefaultEtherFunctionContext extends AbstractEtherFunctionContext {

	/**
	 * @param wareContext
	 */
	public DefaultEtherFunctionContext(EtherWareContext wareContext) {
		super(wareContext);
	}

	/**
	 * @param functionElement
	 * @return
	 * @throws FunctionLoadException 
	 * @throws FunctionBuildException 
	 */
	public EtherFunctionEntity loadFunctionEntity(Element functionElement) throws FunctionLoadException, FunctionBuildException {
		
		EtherFunctionLoader functionLoader;
		try {
			functionLoader = new DefaultEtherFunctionLoader(wareContext.getEtherWareLoader(functionElement.getNamespace()));
		} catch (MalformedURLException e) {
			throw new FunctionLoadException(e);
		}
		
		EtherFunctionID functionID = new DefaultEtherFunctionID(functionElement);
		EtherFunctionEntity functionEntity = functionLoader.load(functionID);
		functionEntity.build(new DefaultEtherFunctionResource(functionElement, functionEntity, functionLoader, this));
		return functionEntity;
	}
}
