package org.ghcc.toft.ware.core.design.interfaces.mop.lifecycle;

/**
 * WareDocumentRecycler
 * 
 * @author yanchangyou
 * @date 2010-10-20 23:53:17
 * @version 0.1
 * @since 0.3
 *
 */
import org.ghcc.toft.ware.core.design.interfaces.caas.WareDocument;
import org.ghcc.toft.ware.core.design.interfaces.eop.lifecycle.Recycler;
import org.ghcc.toft.ware.core.design.interfaces.mop.WareDocumentEntity;
import org.ghcc.toft.ware.core.design.interfaces.mop.exception.WareDocumentRecycleException;

public interface WareDocumentRecycler extends WareDocument, Recycler {

	/**
	 * 回收
	 */
	public void recycle(WareDocumentEntity WareDocumententity) throws WareDocumentRecycleException;


}