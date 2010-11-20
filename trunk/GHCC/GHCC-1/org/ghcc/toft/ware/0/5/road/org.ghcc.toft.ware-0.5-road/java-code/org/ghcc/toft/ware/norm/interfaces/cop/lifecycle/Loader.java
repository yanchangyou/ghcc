/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.cop.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.cop.Entity;
import org.ghcc.toft.ware.norm.interfaces.cop.define.ID;
import org.ghcc.toft.ware.norm.interfaces.cop.exception.LoadException;



/**
 * Loader
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public interface Loader extends COPLifeCycle {

	public Entity load(ID id) throws LoadException;

}
