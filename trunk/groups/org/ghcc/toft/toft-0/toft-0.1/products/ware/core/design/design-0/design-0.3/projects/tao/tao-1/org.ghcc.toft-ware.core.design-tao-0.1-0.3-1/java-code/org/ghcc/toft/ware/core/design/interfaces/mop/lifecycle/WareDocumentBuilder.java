package org.ghcc.toft.ware.core.design.interfaces.mop.lifecycle;

/**
 * WareDocumentBuilder
 * 
 * @author yanchangyou
 * @date 2010-10-20 23:53:17
 * @version 0.1
 * @since 0.3
 *
 */
import org.ghcc.toft.ware.core.design.interfaces.caas.WareDocument;
import org.ghcc.toft.ware.core.design.interfaces.eop.lifecycle.Builder;
import org.ghcc.toft.ware.core.design.interfaces.mop.define.WareDocumentResource;
import org.ghcc.toft.ware.core.design.interfaces.mop.exception.WareDocumentBuildException;

public interface WareDocumentBuilder extends WareDocument, Builder {

	/**
	 * 构建
	 * @param resorce
	 * @throws Exception
	 */
	public void build(WareDocumentResource wareDocumentResource) throws WareDocumentBuildException;
}