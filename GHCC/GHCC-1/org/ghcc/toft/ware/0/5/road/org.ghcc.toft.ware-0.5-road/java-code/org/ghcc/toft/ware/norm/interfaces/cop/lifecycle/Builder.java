/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.cop.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.cop.define.Resource;
import org.ghcc.toft.ware.norm.interfaces.cop.exception.BuildException;
import org.ghcc.toft.ware.norm.interfaces.cop.exception.COPException;



/**
 * Builder
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public interface Builder extends COPLifeCycle {
	
	public void build(Resource resource) throws BuildException, COPException;
	
}
