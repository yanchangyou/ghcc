/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.machine;

import org.dom4j.Document;
import org.dom4j.Element;
import org.ghcc.toft.ware.norm.interfaces.cop.exception.COPException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.exception.MachineBuildException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.exception.MachineDriveException;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.EtherFunctionEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.define.EtherFunctionContext;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define.EtherMachineContext;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define.EtherMachineResource;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define.EtherWareContext;
import org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.machine.AbstractEtherMachineEntity;


/**
 * DefaultEtherMachineEntity
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 23:55:27
 * @version 0.5
 *
 */


public class DefaultEtherMachineEntity extends AbstractEtherMachineEntity {
	
	
	/**
	 * 
	 * @param document
	 */
	public DefaultEtherMachineEntity(Document document) {
		super(document);
	}

	/**
	 * @param resource
	 * @throws MachineBuildException
	 */
	public void build(EtherMachineResource resource)
			throws MachineBuildException {
//		System.out.println("build run...");
	}

	/**
	 * @param context
	 * @throws MachineDriveException
	 * @throws COPException 
	 */
	public void drive(EtherMachineContext context) throws MachineDriveException, COPException {
		
		for (Element functionElement : document.getRootElement().elements()) {
			EtherWareContext wareContext = context.getWareContext(functionElement.getNamespace());
			EtherFunctionContext functionContext = wareContext.getFunctionContext(functionElement);
			EtherFunctionEntity functionEntity = functionContext.loadFunctionEntity(functionElement);
			functionEntity.drive(functionContext);
		}
	}
}
