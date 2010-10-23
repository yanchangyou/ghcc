/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.lifecycle;

import org.ghcc.toft.ware.core.design.interfaces.concept.caas.Ware;
import org.ghcc.toft.ware.core.design.interfaces.cop.lifecycle.Recycler;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.WareEntity;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.exception.WareRecycleException;


/**
 * WareRecycler
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 21:10:15
 * @version 0.1-1-1
 *
 */


public interface WareRecycler extends Ware, Recycler, WareCOPLifeCycle {

	public void recycly(WareEntity entity) throws WareRecycleException;

}
