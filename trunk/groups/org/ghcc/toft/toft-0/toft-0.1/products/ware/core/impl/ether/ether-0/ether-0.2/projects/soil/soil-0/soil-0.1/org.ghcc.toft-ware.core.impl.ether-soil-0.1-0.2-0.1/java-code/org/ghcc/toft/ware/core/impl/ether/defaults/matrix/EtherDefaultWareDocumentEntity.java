package org.ghcc.toft.ware.core.impl.ether.defaults.matrix;

import org.dom4j.Element;
import org.ghcc.toft.ware.core.impl.ether.abstracts.matrix.EtherAbstractWareDocumentEntity;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherFunctionNode;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherWareDocumentNode;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherWareEntity;

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
//		System.out.println(etherWareDocumentNode.getEtherNode().asXML());
		
		Element root = etherWareDocumentNode.getDom4jDocument().getRootElement();
		
		EtherWareEntity wareEntity = EtherDefaultWareEntity.getSingleEthertWareEntity();
		EtherFunctionNode functionNode = new EtherDefaultFunctionNode(root);
		wareEntity.drive(functionNode);
		
	}

}