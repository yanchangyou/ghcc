/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.waredocument.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.concept.caas.WareDocument;
import org.ghcc.toft.ware.norm.interfaces.cop.lifecycle.Recycler;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.waredocument.WareDocumentEntity;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.waredocument.exception.WareDocumentRecycleException;


/**
 * WareDocumentRecycler
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 21:10:15
 * @version 0.1-0.1-1
 *
 */


public interface WareDocumentRecycler extends WareDocument, Recycler, WareDocumentCOPLifeCycle {

	public void recycly(WareDocumentEntity entity) throws WareDocumentRecycleException;

}
