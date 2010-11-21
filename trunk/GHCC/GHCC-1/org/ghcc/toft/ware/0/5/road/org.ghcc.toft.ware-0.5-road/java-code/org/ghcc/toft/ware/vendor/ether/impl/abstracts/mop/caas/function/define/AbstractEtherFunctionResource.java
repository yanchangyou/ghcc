/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.function.define;

import org.dom4j.Element;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.EtherFunctionEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.define.EtherFunctionContext;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.define.EtherFunctionResource;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.lifecycle.EtherFunctionLoader;


/**
 * AbstractEtherFunctionResource
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 01:24:18
 * @version 0.5
 *
 */


public class AbstractEtherFunctionResource implements EtherFunctionResource {
	
	protected Element functionElement;
	
	protected EtherFunctionEntity functionEntity;
	
	protected EtherFunctionLoader functionLoader;
	
	protected EtherFunctionContext functionContext;

	public AbstractEtherFunctionResource(
			Element functionElement, 
			EtherFunctionEntity functionEntity, 
			EtherFunctionLoader functionLoader,
			EtherFunctionContext functionContext
			) {
		
		setFunctionElement(functionElement);
		this.functionEntity = functionEntity;
		this.functionLoader = functionLoader;
		this.functionContext = functionContext;
		
		
	}

	public Element getFunctionElement() {
		return functionElement;
	}

	protected void setFunctionElement(Element functionElement) {
		this.functionElement = functionElement;
	}

	/**
	 * @return
	 */
	public EtherFunctionEntity getEntity() {
		return functionEntity;
	}

	/**
	 * @return
	 */
	public EtherFunctionLoader getLoader() {
		return functionLoader;
	}

	/**
	 * @return
	 */
	public EtherFunctionContext getContext() {
		return functionContext;
	}

}
