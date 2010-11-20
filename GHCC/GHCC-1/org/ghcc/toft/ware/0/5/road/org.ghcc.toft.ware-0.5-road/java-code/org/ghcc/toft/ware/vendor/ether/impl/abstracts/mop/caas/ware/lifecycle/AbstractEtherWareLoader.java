/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.ware.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.cop.Entity;
import org.ghcc.toft.ware.norm.interfaces.cop.define.ID;
import org.ghcc.toft.ware.norm.interfaces.cop.exception.COPException;
import org.ghcc.toft.ware.norm.interfaces.cop.exception.LoadException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.WareEntity;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.define.WareID;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.exception.WareLoadException;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define.EtherWareID;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.lifecycle.EtherWareLoader;


/**
 * AbstractEtherWareLoader
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 01:24:18
 * @version 0.5
 *
 */


public abstract class AbstractEtherWareLoader implements EtherWareLoader {

	/**
	 * norm -> design
	 * 
	 * @param id
	 * @return
	 * @throws WareLoadException
	 */
	public WareEntity load(WareID id) throws WareLoadException, COPException {
		return load((EtherWareID)id);
	}

	/**
	 * norm -> design
	 * 
	 * @param id
	 * @return
	 * @throws LoadException
	 */
	public Entity load(ID id) throws LoadException, COPException {
		return load((WareID)id);
	}
}
