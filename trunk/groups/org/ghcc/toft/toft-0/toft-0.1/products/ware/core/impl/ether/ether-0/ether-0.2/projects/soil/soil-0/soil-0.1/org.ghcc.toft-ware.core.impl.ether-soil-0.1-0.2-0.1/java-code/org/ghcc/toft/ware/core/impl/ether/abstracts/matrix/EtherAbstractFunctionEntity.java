package org.ghcc.toft.ware.core.impl.ether.abstracts.matrix;

import java.util.Iterator;

import org.dom4j.Element;
import org.ghcc.toft.ware.core.impl.ether.defaults.matrix.EtherDefaultFunctionNode;
import org.ghcc.toft.ware.core.impl.ether.defaults.matrix.EtherDefaultWareEntity;
import org.ghcc.toft.ware.core.impl.ether.interfaces.cop.EtherNode;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherFunctionEntity;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherFunctionNode;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherWareEntity;

/**
 * EtherAbstractFunctionEntity
 * 
 * @author yanchangyou
 * @date 2010-10-17 18:06:00
 * @version 0.1
 *
 */
public abstract class EtherAbstractFunctionEntity implements EtherFunctionEntity {
	/**
	 * 驱动执行, 交给子类实现, 只做类型检查
	 */
	public void drive(EtherNode node) throws Exception {
		if(node instanceof EtherFunctionNode) {
			drive((EtherFunctionNode)node);
		} else {
			throw new Exception("类型不匹配, 必须传递[EtherFunctionNode]类型");
		}
	}
	
	public void dealException(Exception e) throws Exception {
		throw e;
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
	
	/**
	 * 驱动子节点执行
	 * @param functionNode
	 * @throws Exception
	 */
	public void driveChild(EtherFunctionNode functionNode) throws Exception {
		for (Iterator<Element> it = functionNode.getDom4jElement().elementIterator(); it.hasNext();) {
			Element element = it.next();
			EtherWareEntity wareEntity = EtherDefaultWareEntity.getSingleEthertWareEntity();
			EtherFunctionNode childFunctionNode = new EtherDefaultFunctionNode(element);
			wareEntity.drive(childFunctionNode);
		}
	}
	
	/**
	 * 处理子节点和异常
	 * @param node
	 * @throws Exception
	 */
	public void driveWithChildWithDealException(EtherFunctionNode functionNode) throws Exception {
		try {
			this.drive(functionNode);
			driveChild(functionNode);
		} catch (Exception e) {
			this.dealException(e);
		}
	}
}