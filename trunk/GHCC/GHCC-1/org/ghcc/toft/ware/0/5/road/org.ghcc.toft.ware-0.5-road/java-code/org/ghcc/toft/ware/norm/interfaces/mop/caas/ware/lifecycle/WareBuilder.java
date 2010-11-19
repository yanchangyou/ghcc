/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.cop.lifecycle.Builder;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.define.WareResource;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.exception.WareBuildException;


/**
 * WareBuilder
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public interface WareBuilder extends Builder, WareCOPLifeCycle {

	public void build(WareResource resource) throws WareBuildException;

}
