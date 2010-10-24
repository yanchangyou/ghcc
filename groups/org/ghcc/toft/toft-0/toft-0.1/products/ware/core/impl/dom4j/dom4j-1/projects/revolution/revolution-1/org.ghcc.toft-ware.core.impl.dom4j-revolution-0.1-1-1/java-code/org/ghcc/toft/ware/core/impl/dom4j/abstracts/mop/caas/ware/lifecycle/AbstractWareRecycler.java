/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.ware.lifecycle;

import org.ghcc.toft.ware.core.design.interfaces.cop.Entity;
import org.ghcc.toft.ware.core.design.interfaces.cop.exception.RecycleException;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.WareEntity;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.exception.WareRecycleException;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.lifecycle.WareRecycler;


/**
 * AbstractWareRecycler
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 23:38:13
 * @version 0.1-1-1
 *
 */


public class AbstractWareRecycler extends AbstractWareCOPLifeCycle implements WareRecycler {

	public void recycly(Entity entity) throws RecycleException {
		recycly((WareEntity)entity);
	}

	public void recycly(WareEntity entity) throws WareRecycleException {
		
	}
}
