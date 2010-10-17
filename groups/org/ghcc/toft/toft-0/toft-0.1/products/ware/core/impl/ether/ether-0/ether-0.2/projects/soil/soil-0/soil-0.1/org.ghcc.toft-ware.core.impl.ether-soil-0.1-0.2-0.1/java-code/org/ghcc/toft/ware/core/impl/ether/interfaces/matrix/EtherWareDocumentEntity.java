package org.ghcc.toft.ware.core.impl.ether.interfaces.matrix;

/**
 * EtherWareDocumentEntity
 * 
 * @author yanchangyou
 * @date 2010-10-17 11:35:32
 * @version 0.1
 *
 */
import org.ghcc.toft.ware.core.design.matrix.WareDocumentEntity;
import org.ghcc.toft.ware.core.impl.ether.interfaces.caas.EtherWareDocument;
import org.ghcc.toft.ware.core.impl.ether.interfaces.cop.EtherEntity;

public interface EtherWareDocumentEntity extends WareDocumentEntity, EtherWareDocument, EtherEntity, EtherWareDocumentConcept, EtherWareDocumentDriver {

}