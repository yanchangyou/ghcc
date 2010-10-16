package org.ghcc.toft.ware.core.impl.ether.interfaces.matrix;

/**
 * EtherWareDocumentDriver
 * 
 * @author yanchangyou
 * @date 2010-10-17 00:08:58
 * @version 0.1
 *
 */
import org.ghcc.toft.ware.core.impl.ether.interfaces.caas.EtherWareDocument;
import org.ghcc.toft.ware.core.impl.ether.interfaces.cop.EtherDriver;

public interface EtherWareDocumentDriver extends EtherWareDocument, EtherDriver {
	
	/**
	 * 驱动同类型节点执行
	 * @param node
	 * @throws Exception
	 */
	public abstract void drive(EtherWareDocumentNode node) throws Exception;
	
}