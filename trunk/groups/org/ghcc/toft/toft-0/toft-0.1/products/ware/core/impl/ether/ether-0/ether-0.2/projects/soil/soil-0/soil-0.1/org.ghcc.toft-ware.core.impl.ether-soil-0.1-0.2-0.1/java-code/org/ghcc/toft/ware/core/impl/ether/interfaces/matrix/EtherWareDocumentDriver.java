package org.ghcc.toft.ware.core.impl.ether.interfaces.matrix;

/**
 * EtherWareDocumentDriver
 * 
 * @author yanchangyou
 * @date 2010-10-17 11:35:32
 * @version 0.1
 *
 */
import org.ghcc.toft.ware.core.design.matrix.WareDocumentDriver;
import org.ghcc.toft.ware.core.impl.ether.interfaces.caas.EtherWareDocument;
import org.ghcc.toft.ware.core.impl.ether.interfaces.cop.EtherDriver;

public interface EtherWareDocumentDriver extends WareDocumentDriver, EtherWareDocument, EtherDriver {
	/**
	 * 驱动同类型节点执行
	 * @param node
	 * @throws Exception
	 */
	public abstract void drive(EtherWareDocumentNode node) throws Exception;
}