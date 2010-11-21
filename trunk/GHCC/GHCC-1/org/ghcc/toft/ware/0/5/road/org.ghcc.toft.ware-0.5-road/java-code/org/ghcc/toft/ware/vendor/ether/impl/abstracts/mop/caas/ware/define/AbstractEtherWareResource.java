/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.ware.define;

import org.dom4j.Namespace;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.EtherWareEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define.EtherWareContext;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define.EtherWareResource;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.lifecycle.EtherWareLoader;


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
	
	protected Namespace wareNamespace;
	protected EtherWareEntity wareEntity;
	protected EtherWareLoader wareLoader;
	protected EtherWareContext wareContext;

	public AbstractEtherWareResource(Namespace wareNamespace,
			EtherWareEntity wareEntity,
			EtherWareLoader wareLoader,
			EtherWareContext wareContext) {
		
		this.wareNamespace = wareNamespace;
		this.wareEntity = wareEntity;
		this.wareLoader = wareLoader;
		this.wareContext = wareContext;
		
	}

	/**
	 * @return the functionElement
	 */
	public Namespace getWareNamespace() {
		return wareNamespace;
	}
	/**
	 * @return
	 */
	public EtherWareEntity getEntity() {
		return wareEntity;
	}
	/**
	 * @return
	 */
	public EtherWareLoader getLoader() {
		return wareLoader;
	}
	/**
	 * @return
	 */
	public EtherWareContext getContext() {
		return wareContext;
	}
	
}
