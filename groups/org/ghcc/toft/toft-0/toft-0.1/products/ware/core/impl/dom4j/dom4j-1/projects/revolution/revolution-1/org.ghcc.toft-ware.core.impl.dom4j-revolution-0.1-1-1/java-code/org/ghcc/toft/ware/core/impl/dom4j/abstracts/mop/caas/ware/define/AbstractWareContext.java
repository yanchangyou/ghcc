/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.ware.define;

import org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.define.WareContext;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.function.define.AbstractFunctionResource;


/**
 * AbstractWareContext
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 23:38:13
 * @version 0.1-1-1
 *
 */


public class AbstractWareContext extends AbstractWareCOPDefine implements WareContext {
	
	protected AbstractFunctionResource functionResource;
	
	public AbstractWareContext(AbstractFunctionResource functionResource) {
		setFunctionResource(functionResource);
	}

	public AbstractFunctionResource getFunctionResource() {
		return functionResource;
	}

	protected void setFunctionResource(AbstractFunctionResource functionResource) {
		this.functionResource = functionResource;
	}
	
	
}
