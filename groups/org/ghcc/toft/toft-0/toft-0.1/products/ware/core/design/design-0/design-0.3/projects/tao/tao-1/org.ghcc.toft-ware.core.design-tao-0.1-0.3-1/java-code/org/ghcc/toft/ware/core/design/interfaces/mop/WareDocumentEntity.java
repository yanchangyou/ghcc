package org.ghcc.toft.ware.core.design.interfaces.mop;

/**
 * WareDocumentEntity
 * 
 * @author yanchangyou
 * @date 2010-10-20 23:53:17
 * @version 0.1
 * @since 0.3
 *
 */
import org.ghcc.toft.ware.core.design.interfaces.caas.WareDocument;
import org.ghcc.toft.ware.core.design.interfaces.eop.Entity;
import org.ghcc.toft.ware.core.design.interfaces.mop.lifecycle.WareDocumentBuilder;
import org.ghcc.toft.ware.core.design.interfaces.mop.lifecycle.WareDocumentDriver;

public interface WareDocumentEntity extends WareDocument, Entity, WareDocumentConcept, WareDocumentBuilder, WareDocumentDriver {

}