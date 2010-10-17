package org.ghcc.toft.ware.core.impl.ether.abstracts.matrix;

import org.dom4j.Document;
import org.dom4j.Node;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherWareDocumentNode;

/**
 * EtherAbstractWareDocumentNode
 * 
 * @author yanchangyou
 * @date 2010-10-17 00:08:58
 * @version 0.1
 *
 */
public abstract class EtherAbstractWareDocumentNode implements EtherWareDocumentNode {
	protected Document dom4jDocument;

	protected void setDom4jDocument(Document dom4jDocument) {
		this.dom4jDocument = dom4jDocument;
	}

	public Document getDom4jDocument() {
		return dom4jDocument;
	}

	public Node getEtherNode() {
		return getDom4jDocument();
	}
}