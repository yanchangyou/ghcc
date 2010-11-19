/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.cop.lifecycle.Driver;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.define.WareContext;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.exception.WareDriveException;


/**
 * WareDriver
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public interface WareDriver extends Driver, WareCOPLifeCycle {

	public void drive(WareContext context) throws WareDriveException;

}
