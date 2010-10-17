package org.ghcc.toft.ware.core.impl.ether.abstracts.matrix;

import org.ghcc.toft.ware.core.impl.ether.interfaces.cop.EtherNode;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherWareEntity;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherWareNode;

/**
 * EtherAbstractWareEntity
 * 
 * @author yanchangyou
 * @date 2010-10-17 16:49:53
 * @version 0.1
 *
 */
public abstract class EtherAbstractWareEntity implements EtherWareEntity {
	/**
	 * 驱动执行, 交给子类实现, 只做类型检查
	 */
	public void drive(EtherNode node) throws Exception {
		if(node instanceof EtherWareNode) {
			drive((EtherWareNode)node);
		} else {
			throw new Exception("类型不匹配, 必须传递[EtherWareDocumentNode]类型");
		}
	}
	
	
}