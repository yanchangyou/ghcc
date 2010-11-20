/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.cop.exception.COPException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.exception.WareBuildException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.lifecycle.WareBuilder;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.lifecycle.EtherBuilder;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define.EtherWareResource;


/**
 * EtherWareBuilder
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-20 00:17:21
 * @version 0.5
 *
 */


public interface EtherWareBuilder extends WareBuilder, EtherBuilder, EtherWareCOPLifeCycle {

	public void build(EtherWareResource resource) throws WareBuildException, COPException;

}
