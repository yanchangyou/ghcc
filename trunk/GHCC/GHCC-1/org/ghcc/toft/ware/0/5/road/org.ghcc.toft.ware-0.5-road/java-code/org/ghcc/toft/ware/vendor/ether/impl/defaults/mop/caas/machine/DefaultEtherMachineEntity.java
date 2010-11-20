/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.machine;

import org.dom4j.Document;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.exception.MachineBuildException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.exception.MachineDriveException;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define.EtherMachineContext;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define.EtherMachineResource;
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
		System.out.println("build run...");
	}

	/**
	 * @param context
	 * @throws MachineDriveException
	 */
	public void drive(EtherMachineContext context) throws MachineDriveException {
		System.out.println("driver run...");
		System.out.println(this.document.asXML());
		
		
		
	}
}
