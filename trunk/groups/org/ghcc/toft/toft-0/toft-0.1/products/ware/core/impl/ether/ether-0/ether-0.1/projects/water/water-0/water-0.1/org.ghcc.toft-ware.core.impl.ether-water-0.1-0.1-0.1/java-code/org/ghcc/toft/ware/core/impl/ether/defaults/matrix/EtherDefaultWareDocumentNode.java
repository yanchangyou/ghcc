package org.ghcc.toft.ware.core.impl.ether.defaults.matrix;

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

	private String etherWareDocumentNodeXML;
	
	public EtherDefaultWareDocumentNode(String etherWareDocumentNodeXML) {
		setEtherWareDocumentNodeXML(etherWareDocumentNodeXML);
	}
	public void setEtherWareDocumentNodeXML(String etherWareDocumentNodeXML) {
		this.etherWareDocumentNodeXML = etherWareDocumentNodeXML;
	}

	public String getEtherWareDocumentNodeXML() {
		return etherWareDocumentNodeXML;
	}

}