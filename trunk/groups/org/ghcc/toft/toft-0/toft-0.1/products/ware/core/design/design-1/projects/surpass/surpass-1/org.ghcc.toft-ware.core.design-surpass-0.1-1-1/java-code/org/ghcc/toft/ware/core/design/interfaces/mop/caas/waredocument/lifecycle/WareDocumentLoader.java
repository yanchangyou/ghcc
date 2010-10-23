/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.lifecycle;

import org.ghcc.toft.ware.core.design.interfaces.concept.caas.WareDocument;
import org.ghcc.toft.ware.core.design.interfaces.cop.define.ID;
import org.ghcc.toft.ware.core.design.interfaces.cop.lifecycle.Loader;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.WareEntity;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.define.WareDocumentID;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.define.WareDocumentPathInfo;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.exception.WareDocumentLoadException;


/**
 * WareDocumentLoader
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 21:10:15
 * @version 0.1-1-1
 *
 */


public interface WareDocumentLoader extends WareDocument, Loader, WareDocumentCOPLifeCycle {

	public WareEntity load(WareDocumentID id) throws WareDocumentLoadException;

	public WareEntity load(WareDocumentPathInfo pathInfo, ID id) throws WareDocumentLoadException;

}
