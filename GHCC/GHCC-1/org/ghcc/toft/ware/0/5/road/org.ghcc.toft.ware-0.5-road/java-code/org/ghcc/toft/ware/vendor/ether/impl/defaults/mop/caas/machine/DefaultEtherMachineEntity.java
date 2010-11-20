/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.machine;

import java.net.MalformedURLException;

import org.dom4j.Document;
import org.dom4j.Element;
import org.ghcc.toft.ware.norm.interfaces.cop.exception.COPException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.exception.MachineBuildException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.exception.MachineDriveException;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define.EtherMachineContext;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define.EtherMachineResource;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.EtherWareEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define.EtherWareID;
import org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.machine.AbstractEtherMachineEntity;
import org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.ware.define.DefaultEtherWareContext;
import org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.ware.define.DefaultEtherWareID;
import org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.ware.define.DefaultEtherWareResource;


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
			EtherWareID wareID = new DefaultEtherWareID(functionElement.getNamespace());
			EtherWareEntity wareEntity = this.getWare(wareID);
			if (wareEntity == null) {
				try {
					wareEntity = installWare(functionElement.getNamespace());
				} catch (MalformedURLException e) {
					throw new MachineDriveException(e);
				}
			}
			wareEntity.build(new DefaultEtherWareResource(functionElement));
			wareEntity.drive(new DefaultEtherWareContext(context));
		}
	}

}
