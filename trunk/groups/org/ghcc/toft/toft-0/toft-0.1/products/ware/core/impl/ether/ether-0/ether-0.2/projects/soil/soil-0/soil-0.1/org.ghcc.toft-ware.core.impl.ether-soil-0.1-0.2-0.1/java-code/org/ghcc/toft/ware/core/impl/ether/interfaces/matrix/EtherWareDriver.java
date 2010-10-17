package org.ghcc.toft.ware.core.impl.ether.interfaces.matrix;

/**
 * EtherWareDriver
 * 
 * @author yanchangyou
 * @date 2010-10-17 16:49:53
 * @version 0.1
 *
 */
import org.ghcc.toft.ware.core.design.matrix.WareDriver;
import org.ghcc.toft.ware.core.impl.ether.interfaces.caas.EtherWare;
import org.ghcc.toft.ware.core.impl.ether.interfaces.cop.EtherDriver;

public interface EtherWareDriver extends WareDriver, EtherWare, EtherDriver {

	/**
	 * 驱动执行
	 * @param node
	 * @throws Exception
	 */
	public void drive(EtherWareNode node) throws Exception;
}