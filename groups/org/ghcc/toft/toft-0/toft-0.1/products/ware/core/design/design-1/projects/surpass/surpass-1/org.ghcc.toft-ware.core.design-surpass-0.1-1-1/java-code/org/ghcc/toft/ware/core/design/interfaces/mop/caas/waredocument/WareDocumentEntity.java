/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument;

import org.ghcc.toft.ware.core.design.interfaces.concept.caas.WareDocument;
import org.ghcc.toft.ware.core.design.interfaces.cop.Entity;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.lifecycle.WareDocumentBuilder;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.lifecycle.WareDocumentDriver;


/**
 * WareDocumentEntity
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 21:10:15
 * @version 0.1-1-1
 *
 */


public interface WareDocumentEntity extends WareDocument, Entity, WareDocumentCOP, WareDocumentConcept, WareDocumentBuilder, WareDocumentDriver {
}
