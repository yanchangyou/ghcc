/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.function.define;

import org.dom4j.Element;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.function.define.FunctionContext;


/**
 * AbstractFunctionContext
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 23:38:13
 * @version 0.1-1-1
 *
 */


public class AbstractFunctionContext extends AbstractFunctionCOPDefine implements FunctionContext {
	
	protected Element functionElement;
	
	public AbstractFunctionContext(Element functionElement) {
		setFunctionElement(functionElement);
	}

	public Element getFunctionElement() {
		return functionElement;
	}

	public void setFunctionElement(Element functionElement) {
		this.functionElement = functionElement;
	}

}
