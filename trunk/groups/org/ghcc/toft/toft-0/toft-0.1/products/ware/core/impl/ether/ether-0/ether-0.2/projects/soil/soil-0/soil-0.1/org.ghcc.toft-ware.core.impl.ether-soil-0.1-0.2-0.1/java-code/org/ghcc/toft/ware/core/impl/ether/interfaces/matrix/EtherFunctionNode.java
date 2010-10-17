package org.ghcc.toft.ware.core.impl.ether.interfaces.matrix;

/**
 * EtherFunctionNode
 * 
 * @author yanchangyou
 * @date 2010-10-17 18:06:00
 * @version 0.1
 *
 */
import org.dom4j.Element;
import org.ghcc.toft.ware.core.design.matrix.FunctionNode;
import org.ghcc.toft.ware.core.impl.ether.interfaces.caas.EtherFunction;
import org.ghcc.toft.ware.core.impl.ether.interfaces.cop.EtherNode;

public interface EtherFunctionNode extends FunctionNode, EtherFunction, EtherNode {
	/**
	 * 获取dom4j的元素
	 * @return
	 */
	public Element getDom4jElement();
	
	public String getFunctionClassName() throws Exception;
	
}