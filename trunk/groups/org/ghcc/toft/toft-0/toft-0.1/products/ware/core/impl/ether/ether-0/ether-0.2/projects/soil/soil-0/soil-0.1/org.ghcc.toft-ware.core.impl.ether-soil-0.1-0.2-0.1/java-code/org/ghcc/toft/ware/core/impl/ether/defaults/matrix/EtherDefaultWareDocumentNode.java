package org.ghcc.toft.ware.core.impl.ether.defaults.matrix;

import org.dom4j.Document;
import org.dom4j.Node;
import org.ghcc.toft.ware.core.impl.ether.abstracts.matrix.EtherAbstractWareDocumentNode;

/**
 * EtherDefaultWareDocumentNode
 * 
 * @author yanchangyou
 * @date 2010-10-17 00:08:58
 * @version 0.1
 * 
 */
public class EtherDefaultWareDocumentNode extends EtherAbstractWareDocumentNode {

	public EtherDefaultWareDocumentNode(Document dom4jDocument) {
		setDom4jDocument(dom4jDocument);
	}
	private Document dom4jDocument;

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