package org.ghcc.toft.ware.core.impl.ether.defaults.matrix;

import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.ghcc.toft.ware.core.impl.ether.abstracts.matrix.EtherAbstractWareDocumentEntity;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherWareDocumentNode;

/**
 * EtherDefaultWareDocumentEntity
 * 
 * @author yanchangyou
 * @date 2010-10-17 00:08:58
 * @version 0.1
 *
 */
public class EtherDefaultWareDocumentEntity extends EtherAbstractWareDocumentEntity {

	public void dealException(Exception e) throws Exception {
		throw e;
	}

	/**
	 * 驱动执行
	 */
	public void drive(EtherWareDocumentNode etherWareDocumentNode) throws Exception {
		System.out.println(etherWareDocumentNode.getEtherNode().asXML());
		
		String xml = etherWareDocumentNode.getEtherNode().asXML();
		Element element = DocumentHelper.parseText(xml).getRootElement(); 
		
//		System.out.println(element.asXML());
		Node node = element.createXPath("/helloworld/speak-words/text()").selectSingleNode(element);
		System.out.println(node.asXML());
	}

}