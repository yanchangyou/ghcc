package org.ghcc.toft.ware.core.impl.ether.interfaces.matrix;

/**
 * EtherWareNode
 * 
 * @author yanchangyou
 * @date 2010-10-17 16:49:53
 * @version 0.1
 *
 */
import org.dom4j.Namespace;
import org.ghcc.toft.ware.core.design.matrix.WareNode;
import org.ghcc.toft.ware.core.impl.ether.interfaces.caas.EtherWare;
import org.ghcc.toft.ware.core.impl.ether.interfaces.cop.EtherNode;

public interface EtherWareNode extends WareNode, EtherWare, EtherNode {

	/**
	 * 获取dom4j的命名空间节点
	 * @return
	 */
	public Namespace getDom4jNamespace();
	
}