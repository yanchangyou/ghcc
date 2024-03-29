/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.lifecycle;

import org.ghcc.toft.ware.core.design.interfaces.concept.caas.WareDocument;
import org.ghcc.toft.ware.core.design.interfaces.cop.lifecycle.Driver;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.define.WareDocumentContext;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.exception.WareDocumentDriveException;


/**
 * WareDocumentDriver
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 21:10:15
 * @version 0.1-1-1
 *
 */


public interface WareDocumentDriver extends WareDocument, Driver, WareDocumentCOPLifeCycle {

	public void drive(WareDocumentContext context) throws WareDocumentDriveException;

}
