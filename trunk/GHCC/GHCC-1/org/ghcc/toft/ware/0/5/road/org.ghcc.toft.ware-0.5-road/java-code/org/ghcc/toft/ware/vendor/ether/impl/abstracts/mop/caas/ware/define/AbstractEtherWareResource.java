/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.ware.define;

import org.dom4j.Element;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define.EtherWareResource;


/**
 * AbstractEtherWareResource
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 01:24:18
 * @version 0.5
 *
 */


public class AbstractEtherWareResource implements EtherWareResource {
	
	private Element functionElement;

	public AbstractEtherWareResource(Element functionElement) {
		setFunctionElement(functionElement);
	}
	/**
	 * @param functionElement the functionElement to set
	 */
	public void setFunctionElement(Element functionElement) {
		this.functionElement = functionElement;
	}

	/**
	 * @return the functionElement
	 */
	public Element getFunctionElement() {
		return functionElement;
	}
	
}
