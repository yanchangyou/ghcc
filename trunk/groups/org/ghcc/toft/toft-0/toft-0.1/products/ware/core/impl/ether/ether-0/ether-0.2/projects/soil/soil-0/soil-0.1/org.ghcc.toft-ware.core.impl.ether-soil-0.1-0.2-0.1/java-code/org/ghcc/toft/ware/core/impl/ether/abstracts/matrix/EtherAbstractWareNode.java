package org.ghcc.toft.ware.core.impl.ether.abstracts.matrix;

import org.dom4j.Namespace;
import org.dom4j.Node;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherWareNode;

/**
 * EtherAbstractWareNode
 * 
 * @author yanchangyou
 * @date 2010-10-17 16:49:53
 * @version 0.1
 *
 */
public abstract class EtherAbstractWareNode implements EtherWareNode {
	
	protected Namespace dom4jNamespace;
	
	protected void setDom4jNamespace(Namespace dom4jNamespace) {
		this.dom4jNamespace = dom4jNamespace;
	}

	public Namespace getDom4jNamespace() {
		return dom4jNamespace;
	}

	public Node getEtherNode() {
		return getDom4jNamespace();
	}
}