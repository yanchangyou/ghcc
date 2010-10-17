package org.ghcc.toft.ware.core.impl.ether.interfaces.matrix;

/**
 * EtherFunctionDriver
 * 
 * @author yanchangyou
 * @date 2010-10-17 18:06:00
 * @version 0.1
 *
 */
import org.ghcc.toft.ware.core.design.matrix.FunctionDriver;
import org.ghcc.toft.ware.core.impl.ether.interfaces.caas.EtherFunction;
import org.ghcc.toft.ware.core.impl.ether.interfaces.cop.EtherDriver;

public interface EtherFunctionDriver extends FunctionDriver, EtherFunction, EtherDriver {
	/**
	 * 驱动执行
	 * @param node
	 * @throws Exception
	 */
	public void drive(EtherFunctionNode node) throws Exception;
	
}