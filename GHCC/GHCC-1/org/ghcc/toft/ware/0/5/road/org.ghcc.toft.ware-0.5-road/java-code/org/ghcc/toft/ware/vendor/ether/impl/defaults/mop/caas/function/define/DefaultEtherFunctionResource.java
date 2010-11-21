/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.function.define;

import org.dom4j.Element;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.EtherFunctionEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.define.EtherFunctionContext;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.lifecycle.EtherFunctionLoader;
import org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.function.define.AbstractEtherFunctionResource;

/**
 * DefaultEtherFunctionResource
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 23:55:27
 * @version 0.5
 * 
 */

public class DefaultEtherFunctionResource extends AbstractEtherFunctionResource {

	/**
	 * @param functionElement
	 * @param functionEntity
	 * @param functionLoader
	 * @param functionContext
	 */
	public DefaultEtherFunctionResource(Element functionElement,
			EtherFunctionEntity functionEntity,
			EtherFunctionLoader functionLoader,
			EtherFunctionContext functionContext) {
		super(functionElement, functionEntity, functionLoader, functionContext);
	}
}