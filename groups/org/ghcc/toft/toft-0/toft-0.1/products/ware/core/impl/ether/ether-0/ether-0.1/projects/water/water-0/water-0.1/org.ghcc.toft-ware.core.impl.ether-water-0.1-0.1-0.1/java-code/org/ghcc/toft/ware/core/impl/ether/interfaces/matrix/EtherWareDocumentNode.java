package org.ghcc.toft.ware.core.impl.ether.interfaces.matrix;

/**
 * EtherWareDocumentNode
 * 
 * @author yanchangyou
 * @date 2010-10-17 00:08:58
 * @version 0.1
 *
 */
import org.ghcc.toft.ware.core.impl.ether.interfaces.caas.EtherWareDocument;
import org.ghcc.toft.ware.core.impl.ether.interfaces.cop.EtherNode;

public interface EtherWareDocumentNode extends EtherWareDocument, EtherNode {

	public String getEtherWareDocumentNodeXML();
}