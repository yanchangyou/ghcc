/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.waredocument.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.concept.caas.WareDocument;
import org.ghcc.toft.ware.norm.interfaces.cop.lifecycle.Loader;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.waredocument.WareDocumentEntity;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.waredocument.define.WareDocumentID;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.waredocument.define.WareDocumentPathInfo;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.waredocument.exception.WareDocumentLoadException;


/**
 * WareDocumentLoader
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 21:10:15
 * @version 0.1-0.1-1
 *
 */


public interface WareDocumentLoader extends WareDocument, Loader, WareDocumentCOPLifeCycle {

	public WareDocumentEntity load(WareDocumentID id) throws WareDocumentLoadException;

	public WareDocumentEntity load(WareDocumentPathInfo pathInfo, WareDocumentID id) throws WareDocumentLoadException;

}
