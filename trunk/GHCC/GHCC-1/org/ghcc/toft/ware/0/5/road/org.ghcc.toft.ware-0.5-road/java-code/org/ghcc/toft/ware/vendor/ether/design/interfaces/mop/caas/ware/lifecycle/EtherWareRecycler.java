/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.cop.exception.COPException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.exception.WareRecycleException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.lifecycle.WareRecycler;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.lifecycle.EtherRecycler;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.EtherWareEntity;


/**
 * EtherWareRecycler
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-20 00:17:21
 * @version 0.5
 *
 */


public interface EtherWareRecycler extends WareRecycler, EtherRecycler, EtherWareCOPLifeCycle {

	public void recycly(EtherWareEntity entity) throws WareRecycleException, COPException;

}
