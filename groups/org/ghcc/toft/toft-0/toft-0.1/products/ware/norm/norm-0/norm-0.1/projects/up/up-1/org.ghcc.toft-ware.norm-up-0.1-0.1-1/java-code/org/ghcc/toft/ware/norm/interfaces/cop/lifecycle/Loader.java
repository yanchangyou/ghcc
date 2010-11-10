/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.cop.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.cop.Entity;
import org.ghcc.toft.ware.norm.interfaces.cop.define.ID;
import org.ghcc.toft.ware.norm.interfaces.cop.define.PathInfo;
import org.ghcc.toft.ware.norm.interfaces.cop.exception.LoadException;



/**
 * Loader
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 21:10:15
 * @version 0.1-0.1-1
 *
 */


public interface Loader extends COPLifeCycle {

	public Entity load(ID id) throws LoadException;
	
	public Entity load(PathInfo pathInfo, ID id) throws LoadException;
	
}
