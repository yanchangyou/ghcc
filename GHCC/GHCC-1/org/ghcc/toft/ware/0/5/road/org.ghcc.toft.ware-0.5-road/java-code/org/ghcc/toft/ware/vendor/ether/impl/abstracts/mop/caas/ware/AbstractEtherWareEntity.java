/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.ware;

import java.net.URL;

import org.ghcc.toft.ware.norm.interfaces.cop.define.Context;
import org.ghcc.toft.ware.norm.interfaces.cop.define.Resource;
import org.ghcc.toft.ware.norm.interfaces.cop.exception.BuildException;
import org.ghcc.toft.ware.norm.interfaces.cop.exception.COPException;
import org.ghcc.toft.ware.norm.interfaces.cop.exception.DriveException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.define.WareContext;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.define.WareResource;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.exception.WareBuildException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.exception.WareDriveException;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.EtherWareEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define.EtherWareContext;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define.EtherWareID;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define.EtherWareResource;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.lifecycle.EtherWareLoader;


/**
 * AbstractEtherWareEntity
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 01:24:18
 * @version 0.5
 *
 */


public abstract class AbstractEtherWareEntity implements EtherWareEntity {
	
	protected EtherWareID wareID;
	
	protected EtherWareResource resource;
	
	private EtherWareLoader wareLoader;
	
	public EtherWareID getWareID() {
		return wareID;
	}

	/**
	 * @param resource
	 * @throws BuildException
	 * @throws COPException
	 */
	public void build(Resource resource) throws BuildException, COPException {
		build((WareResource)resource);
	}

	/**
	 * @param context
	 * @throws DriveException
	 * @throws COPException
	 */
	public void drive(Context context) throws DriveException, COPException {
		drive((WareContext)context);
	}

	/**
	 * @param resource
	 * @throws WareBuildException
	 * @throws COPException
	 */
	public void build(WareResource resource) throws WareBuildException,
			COPException {
		build((EtherWareResource)resource);
		
	}

	/**
	 * @param context
	 * @throws WareDriveException
	 * @throws COPException
	 */
	public void drive(WareContext context) throws WareDriveException,
			COPException {
		drive((EtherWareContext)context);
	}

	/**
	 * @param wareID
	 */
	public void setWareID(EtherWareID wareID) {
		this.wareID = wareID;
	}

	/**
	 * @param resource
	 * @throws WareBuildException
	 * @throws COPException
	 */
	public void build(EtherWareResource resource) throws WareBuildException,
			COPException {
		this.resource = resource;
	}

	/**
	 * @param context
	 * @throws WareDriveException
	 * @throws COPException
	 */
	public void drive(EtherWareContext context) throws WareDriveException,
			COPException {
		URL[] urls = configClassPath();
		urls = urls == null ? new URL[0] : urls;
		for (URL url : configClassPath()) { //添加后续需要的第三方类
			getWareLoader().getWareClassLoader().addURL(url);
		}
		executeFunction(context, this.resource.getFunctionElement());
	}

	/**
	 * @param wareLoader the wareLoader to set
	 */
	public void setWareLoader(EtherWareLoader wareLoader) {
		this.wareLoader = wareLoader;
	}

	/**
	 * @return the wareLoader
	 */
	public EtherWareLoader getWareLoader() {
		return wareLoader;
	}
}
