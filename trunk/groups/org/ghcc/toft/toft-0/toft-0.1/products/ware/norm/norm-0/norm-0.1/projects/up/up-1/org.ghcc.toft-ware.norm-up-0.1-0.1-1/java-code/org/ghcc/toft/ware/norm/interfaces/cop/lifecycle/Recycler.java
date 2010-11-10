/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.cop.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.cop.Entity;
import org.ghcc.toft.ware.norm.interfaces.cop.exception.RecycleException;



/**
 * Recycler
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 21:10:15
 * @version 0.1-0.1-1
 *
 */


public interface Recycler extends COPLifeCycle {
	
	public void recycly(Entity entity) throws RecycleException;
	
}
