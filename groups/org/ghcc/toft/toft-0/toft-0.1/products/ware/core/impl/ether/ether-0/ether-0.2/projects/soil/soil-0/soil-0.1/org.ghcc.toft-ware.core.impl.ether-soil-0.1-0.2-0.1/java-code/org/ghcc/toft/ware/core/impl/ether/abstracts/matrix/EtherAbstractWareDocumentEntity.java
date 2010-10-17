package org.ghcc.toft.ware.core.impl.ether.abstracts.matrix;

import org.ghcc.toft.ware.core.impl.ether.interfaces.cop.EtherNode;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherWareDocumentEntity;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherWareDocumentNode;

/**
 * EtherAbstractWareDocumentEntity
 * 
 * @author yanchangyou
 * @date 2010-10-17 00:08:58
 * @version 0.1
 *
 */
public abstract class EtherAbstractWareDocumentEntity implements EtherWareDocumentEntity {

	/**
	 * 驱动执行, 交给子类实现, 只做类型检查
	 */
	public void drive(EtherNode node) throws Exception {
		if(node instanceof EtherWareDocumentNode) {
			drive((EtherWareDocumentNode)node);
		} else {
			throw new Exception("类型不匹配, 必须传递[EtherWareDocumentNode]类型");
		}
	}
	
	/**
	 * 使用异常处理
	 */
	public void driveWithDealException(EtherNode node) throws Exception {
		try {
			this.drive(node);
		} catch (Exception e) {
			this.dealException(e);
		}
	}
}