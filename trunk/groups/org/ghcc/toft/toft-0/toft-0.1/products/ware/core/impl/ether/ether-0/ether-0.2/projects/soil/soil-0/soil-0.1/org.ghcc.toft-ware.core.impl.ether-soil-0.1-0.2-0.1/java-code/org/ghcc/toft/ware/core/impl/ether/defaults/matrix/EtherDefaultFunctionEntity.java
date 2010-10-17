package org.ghcc.toft.ware.core.impl.ether.defaults.matrix;

import org.ghcc.toft.ware.core.impl.ether.abstracts.matrix.EtherAbstractFunctionEntity;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherFunctionNode;

/**
 * EtherDefaultFunctionEntity
 * 
 * @author yanchangyou
 * @date 2010-10-17 18:06:01
 * @version 0.1
 *
 */
public class EtherDefaultFunctionEntity extends EtherAbstractFunctionEntity {

	public void dealException(Exception e) throws Exception {
		throw e;
	}

	public void drive(EtherFunctionNode node) throws Exception {
		System.out.println(node.getDom4jElement().asXML());
	}
}