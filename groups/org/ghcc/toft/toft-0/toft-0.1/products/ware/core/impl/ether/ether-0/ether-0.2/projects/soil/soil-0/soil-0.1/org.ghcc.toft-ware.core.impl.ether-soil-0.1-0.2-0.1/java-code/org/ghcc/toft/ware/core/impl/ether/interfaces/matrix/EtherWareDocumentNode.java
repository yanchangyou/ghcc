package org.ghcc.toft.ware.core.impl.ether.interfaces.matrix;

/**
 * EtherWareDocumentNode
 * 
 * @author yanchangyou
 * @date 2010-10-17 11:35:32
 * @version 0.1
 *
 */
import org.dom4j.Document;
import org.ghcc.toft.ware.core.design.matrix.WareDocumentNode;
import org.ghcc.toft.ware.core.impl.ether.interfaces.caas.EtherWareDocument;
import org.ghcc.toft.ware.core.impl.ether.interfaces.cop.EtherNode;

public interface EtherWareDocumentNode extends WareDocumentNode, EtherWareDocument, EtherNode {

	/**
	 * 获取xxx.ware.xml对于的dom4j文档
	 * @return
	 */
	public Document getDom4jDocument();
}