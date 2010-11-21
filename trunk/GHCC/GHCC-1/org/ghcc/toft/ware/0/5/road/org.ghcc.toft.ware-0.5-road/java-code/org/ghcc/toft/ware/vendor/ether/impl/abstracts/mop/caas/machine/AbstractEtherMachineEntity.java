/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.machine;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Namespace;
import org.ghcc.toft.ware.norm.interfaces.cop.define.Context;
import org.ghcc.toft.ware.norm.interfaces.cop.define.Resource;
import org.ghcc.toft.ware.norm.interfaces.cop.exception.BuildException;
import org.ghcc.toft.ware.norm.interfaces.cop.exception.COPException;
import org.ghcc.toft.ware.norm.interfaces.cop.exception.DriveException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.define.MachineContext;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.define.MachineResource;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.exception.MachineBuildException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.exception.MachineDriveException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.WareEntity;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.define.WareID;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.exception.WareLoadException;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.EtherMachineEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define.EtherMachineContext;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.EtherWareEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define.EtherWareID;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.lifecycle.EtherWareLoader;
import org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.ware.define.DefaultEtherWareID;
import org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.ware.define.DefaultEtherWarePathInfo;
import org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.ware.lifecycle.DefaultEtherWareLoader;


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
	protected static Map<String, EtherWareEntity> wareEntityBufferMap;

	public AbstractEtherMachineEntity(Document document) {
		setDocument(document);
		wareEntityBufferMap = new HashMap<String, EtherWareEntity>();
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
	 * @throws COPException
	 */
	public void build(Resource resource) throws BuildException, COPException {
		build((MachineResource)resource);
	}

	/**
	 * @param context
	 * @throws DriveException
	 */
	public void drive(Context context) throws MachineDriveException, COPException {
		drive((MachineContext)context);
	}

	/**
	 * @param resource
	 * @throws MachineBuildException
	 */
	public void build(MachineResource resource) throws MachineBuildException, COPException {
		build((MachineResource)resource);
	}

	/**
	 * @param context
	 * @throws MachineDriveException
	 */
	public void drive(MachineContext context) throws MachineDriveException, COPException {
		drive((EtherMachineContext)context);
	}
	
	/**
	 * @param wareEntity
	 */
	public void installWare(WareEntity wareEntity) {
		installWare((EtherWareEntity)wareEntity);
	}

	/**
	 * @param wareID
	 * @return
	 */
	public WareEntity getWare(WareID wareID) {
		return getWare((EtherWareID)wareID);
	}

	/**
	 * @param wareEntity
	 */
	public void installWare(EtherWareEntity wareEntity) {
		wareEntityBufferMap.put(wareEntity.getWareID().getID(), wareEntity);
	}
	
	public EtherWareEntity installWare(Namespace wareNamespace) throws MalformedURLException, WareLoadException, COPException {
		EtherWareLoader wareLoader = null;
		wareLoader = new DefaultEtherWareLoader(new DefaultEtherWarePathInfo(wareNamespace));
		EtherWareID wareID = new DefaultEtherWareID(wareNamespace);
		EtherWareEntity wareEntity = wareLoader.load(wareID);
		wareEntity.setWareLoader(wareLoader);
		wareEntity.setWareID(wareID);
		installWare(wareEntity);
		return wareEntity;
	}

	/**
	 * @param wareID
	 * @return
	 */
	public EtherWareEntity getWare(EtherWareID wareID) {
		return wareEntityBufferMap.get(wareID.getID());
	}
}
