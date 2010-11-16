/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.concept.caas.Ware;
import org.ghcc.toft.ware.norm.interfaces.cop.lifecycle.Recycler;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.WareEntity;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.exception.WareRecycleException;


/**
 * WareRecycler
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public interface WareRecycler extends Ware, Recycler, WareCOPLifeCycle {

	public void recycly(WareEntity entity) throws WareRecycleException;

}
