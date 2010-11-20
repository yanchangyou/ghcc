/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.cop.exception.COPException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.exception.WareLoadException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.lifecycle.WareLoader;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.lifecycle.EtherLoader;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.EtherWareEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define.EtherWareID;
import org.ghcc.toft.ware.vendor.ether.util.loader.ActiveClassLoader;


/**
 * EtherWareLoader
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-20 00:17:21
 * @version 0.5
 *
 */


public interface EtherWareLoader extends WareLoader, EtherLoader, EtherWareCOPLifeCycle {

	public EtherWareEntity load(EtherWareID id) throws WareLoadException, COPException;

	/**
	 * 根据路径信息生成class loader
	 * @return
	 */
	public ActiveClassLoader getWareClassLoader();
}
