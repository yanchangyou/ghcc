package org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.lifecycle;

/**
 * AbstractWareDocumentRecycler
 * 
 * @author yanchangyou
 * @date 2010-10-21 23:31:20
 * @version 0.1
 * @since 0.3
 *
 */
import org.ghcc.toft.ware.core.design.interfaces.eop.Entity;
import org.ghcc.toft.ware.core.design.interfaces.eop.exception.RecycleException;
import org.ghcc.toft.ware.core.design.interfaces.mop.WareDocumentEntity;
import org.ghcc.toft.ware.core.design.interfaces.mop.lifecycle.WareDocumentRecycler;

public abstract class AbstractWareDocumentRecycler implements WareDocumentRecycler {

	public void recycle(Entity entity) throws RecycleException {
		recycle((WareDocumentEntity)entity);
	}

}