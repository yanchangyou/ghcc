/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.cop.exception.COPException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.exception.WareDriveException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.lifecycle.WareDriver;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.lifecycle.EtherDriver;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define.EtherWareContext;


/**
 * EtherWareDriver
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-20 00:17:21
 * @version 0.5
 *
 */


public interface EtherWareDriver extends WareDriver, EtherDriver, EtherWareCOPLifeCycle {

	public void drive(EtherWareContext context) throws WareDriveException, COPException;

}
