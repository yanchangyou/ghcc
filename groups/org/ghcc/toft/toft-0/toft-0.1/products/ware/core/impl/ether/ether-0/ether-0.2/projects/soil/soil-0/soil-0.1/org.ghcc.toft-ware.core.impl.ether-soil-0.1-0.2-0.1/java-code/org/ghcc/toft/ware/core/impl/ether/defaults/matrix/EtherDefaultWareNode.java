package org.ghcc.toft.ware.core.impl.ether.defaults.matrix;

import org.dom4j.Namespace;
import org.dom4j.Node;
import org.ghcc.toft.ware.core.impl.ether.abstracts.matrix.EtherAbstractWareNode;

/**
 * EtherDefaultWareNode
 * 
 * @author yanchangyou
 * @date 2010-10-17 16:49:53
 * @version 0.1
 *
 */
public class EtherDefaultWareNode extends EtherAbstractWareNode {

	private Namespace dom4jNamespace;
	
	public EtherDefaultWareNode(Namespace dom4jNamespace) {
		setDom4jNamespace(dom4jNamespace);
	}
	
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