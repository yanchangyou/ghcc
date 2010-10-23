/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.design.interfaces.cop.lifecycle;

import org.ghcc.toft.ware.core.design.interfaces.cop.define.Context;
import org.ghcc.toft.ware.core.design.interfaces.cop.exception.DriveException;



/**
 * Driver
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 21:10:15
 * @version 0.1-1-1
 *
 */


public interface Driver extends COPLifeCycle {
	
	public void drive(Context context) throws DriveException;
	
}
