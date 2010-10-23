/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.waredocument.lifecycle;

import org.ghcc.toft.ware.core.design.interfaces.cop.Entity;
import org.ghcc.toft.ware.core.design.interfaces.cop.exception.RecycleException;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.WareDocumentEntity;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.exception.WareDocumentRecycleException;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.lifecycle.WareDocumentRecycler;


/**
 * AbstractWareDocumentRecycler
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 23:38:13
 * @version 0.1-1-1
 *
 */


public class AbstractWareDocumentRecycler extends AbstractWareDocumentCOPLifeCycle implements WareDocumentRecycler {

	/* (non-Javadoc)
	 * @see org.ghcc.toft.ware.core.design.interfaces.cop.lifecycle.Recycler#recycly(org.ghcc.toft.ware.core.design.interfaces.cop.Entity)
	 */
	public void recycly(Entity entity) throws RecycleException {
		recycly((WareDocumentEntity)entity);
	}

	/* (non-Javadoc)
	 * @see org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.lifecycle.WareDocumentRecycler#recycly(org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.WareDocumentEntity)
	 */
	public void recycly(WareDocumentEntity entity)
			throws WareDocumentRecycleException {
		// TODO Auto-generated method stub
		
	}
}
