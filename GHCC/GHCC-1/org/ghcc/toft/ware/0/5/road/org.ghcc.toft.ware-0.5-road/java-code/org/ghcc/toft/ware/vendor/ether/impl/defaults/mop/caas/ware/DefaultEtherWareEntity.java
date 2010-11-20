/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.ware;

import java.net.URL;

import org.dom4j.Element;
import org.ghcc.toft.ware.norm.interfaces.cop.exception.COPException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.FunctionEntity;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.lifecycle.FunctionLoader;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define.EtherWareContext;
import org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.ware.AbstractEtherWareEntity;
import org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.function.define.DefaultEtherFunctionContext;
import org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.function.define.DefaultEtherFunctionID;
import org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.function.define.DefaultEtherFunctionResource;
import org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.function.lifecycle.DefaultEtherFunctionLoader;


/**
 * DefaultEtherWareEntity
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 23:55:27
 * @version 0.5
 *
 */


public class DefaultEtherWareEntity extends AbstractEtherWareEntity {

	/**
	 * @param functionElement
	 * @throws COPException 
	 */
	public void executeFunction(EtherWareContext context, Element functionElement) throws COPException {
		FunctionLoader functionLoader = new DefaultEtherFunctionLoader(this.getWareLoader(), functionElement.getNamespace());
		FunctionEntity functionEntity = functionLoader.load(new DefaultEtherFunctionID(functionElement));
		functionEntity.build(new DefaultEtherFunctionResource(functionElement));
		functionEntity.drive(new DefaultEtherFunctionContext(context));
	}
	
	/**
	 * @return
	 */
	public URL[] configClassPath() {
		return new URL[0];
	}

}
