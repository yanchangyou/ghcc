package org.ghcc.toft.ware.core.impl.ether.interfaces.matrix;

/**
 * EtherFunctionEntity
 * 
 * @author yanchangyou
 * @date 2010-10-17 18:06:00
 * @version 0.1
 *
 */
import org.ghcc.toft.ware.core.design.matrix.FunctionEntity;
import org.ghcc.toft.ware.core.impl.ether.interfaces.caas.EtherFunction;
import org.ghcc.toft.ware.core.impl.ether.interfaces.cop.EtherEntity;

public interface EtherFunctionEntity extends FunctionEntity, EtherFunction, EtherEntity, EtherFunctionConcept, EtherFunctionDriver {

	/**
	 * 驱动子节点执行
	 * @param node
	 */
	public void driveChild(EtherFunctionNode functionNode) throws Exception ;
	
	/**
	 * 处理子节点和异常
	 * @param node
	 * @throws Exception
	 */
	public void driveWithChildWithDealException(EtherFunctionNode functionNode) throws Exception;
}