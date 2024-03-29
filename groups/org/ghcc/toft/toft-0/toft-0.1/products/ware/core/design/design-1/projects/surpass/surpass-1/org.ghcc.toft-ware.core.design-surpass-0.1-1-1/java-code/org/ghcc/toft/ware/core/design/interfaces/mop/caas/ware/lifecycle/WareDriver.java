/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.lifecycle;

import org.ghcc.toft.ware.core.design.interfaces.concept.caas.Ware;
import org.ghcc.toft.ware.core.design.interfaces.cop.lifecycle.Driver;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.define.WareContext;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.exception.WareDriveException;


/**
 * WareDriver
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 21:10:15
 * @version 0.1-1-1
 *
 */


public interface WareDriver extends Ware, Driver, WareCOPLifeCycle {

	public void drive(WareContext context) throws WareDriveException;

}
