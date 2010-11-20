/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.machine;

import org.dom4j.Document;
import org.ghcc.toft.ware.norm.interfaces.cop.define.Context;
import org.ghcc.toft.ware.norm.interfaces.cop.define.Resource;
import org.ghcc.toft.ware.norm.interfaces.cop.exception.BuildException;
import org.ghcc.toft.ware.norm.interfaces.cop.exception.DriveException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.define.MachineContext;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.define.MachineResource;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.exception.MachineBuildException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.exception.MachineDriveException;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.EtherMachineEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define.EtherMachineContext;


/**
 * AbstractEtherMachineEntity
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 01:24:18
 * @version 0.5
 *
 */


public abstract class AbstractEtherMachineEntity implements EtherMachineEntity {
	protected Document document = null;

	public AbstractEtherMachineEntity(Document document) {
		setDocument(document);
	}
	
	public Document getDocument() {
		return document;
	}

	protected void setDocument(Document document) {
		this.document = document;
	}
	/**
	 * @param resource
	 * @throws BuildException
	 */
	public void build(Resource resource) throws BuildException {
		build((MachineResource)resource);
	}

	/**
	 * @param context
	 * @throws DriveException
	 */
	public void drive(Context context) throws DriveException {
		drive((MachineContext)context);
	}

	/**
	 * @param resource
	 * @throws MachineBuildException
	 */
	public void build(MachineResource resource) throws MachineBuildException {
		build((MachineResource)resource);
	}

	/**
	 * @param context
	 * @throws MachineDriveException
	 */
	public void drive(MachineContext context) throws MachineDriveException {
		drive((EtherMachineContext)context);
	}
}
