/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.waredocument.define;

import org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.define.WareDocumentID;

/**
 * AbstractWareDocumentID
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 23:38:13
 * @version 0.1-1-1
 * 
 */

public class AbstractWareDocumentID extends AbstractWareDocumentCOPDefine
		implements WareDocumentID {

	protected String wareDocumentFileName;
	
	public String getWareDocumentFileName() {
		return wareDocumentFileName;
	}

	protected void setWareDocumentFileName(String wareDocumentFileName) {
		this.wareDocumentFileName = wareDocumentFileName;
	}

	public AbstractWareDocumentID(String wareFileName) {
		setWareDocumentFileName(wareFileName);
	}

	/*
	 * @see org.ghcc.toft.ware.core.design.interfaces.cop.define.ID#getID()
	 */
	public String getID() {
		return getWareDocumentFileName();
	}
}
