/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.waredocument.define;

import java.net.URL;

import org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.define.WareDocumentPathInfo;

/**
 * AbstractWareDocumentPathInfo
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 23:38:13
 * @version 0.1-1-1
 * 
 */

public class AbstractWareDocumentPathInfo extends AbstractWareDocumentCOPDefine
		implements WareDocumentPathInfo {

	protected URL wareDocumentPathURL;

	public URL getWareDocumentPathURL() {
		return wareDocumentPathURL;
	}

	public void setWareDocumentPathURL(URL wareDocumentPathURL) {
		this.wareDocumentPathURL = wareDocumentPathURL;
	}

	/**
	 * 
	 */
	public AbstractWareDocumentPathInfo(URL wareDocumentPathURL) {
		setWareDocumentPathURL(wareDocumentPathURL);
	}

}
