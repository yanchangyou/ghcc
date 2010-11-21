/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.ware.define;

import org.dom4j.Namespace;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.EtherWareEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define.EtherWareContext;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.lifecycle.EtherWareLoader;
import org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.ware.define.AbstractEtherWareResource;


/**
 * DefaultEtherWareResource
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 23:55:27
 * @version 0.5
 *
 */


public class DefaultEtherWareResource extends AbstractEtherWareResource {

	/**
	 * @param wareNamespace
	 * @param wareEntity
	 * @param wareLoader
	 * @param wareContext
	 */
	public DefaultEtherWareResource(Namespace wareNamespace,
			EtherWareEntity wareEntity, EtherWareLoader wareLoader,
			EtherWareContext wareContext) {
		super(wareNamespace, wareEntity, wareLoader, wareContext);
	}
}
