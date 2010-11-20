/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.function.define;

import org.dom4j.Element;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.define.EtherFunctionResource;


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

	public AbstractEtherFunctionResource(Element functionElement) {
		setFunctionElement(functionElement);
	}

	public Element getFunctionElement() {
		return functionElement;
	}

	protected void setFunctionElement(Element functionElement) {
		this.functionElement = functionElement;
	}

}
