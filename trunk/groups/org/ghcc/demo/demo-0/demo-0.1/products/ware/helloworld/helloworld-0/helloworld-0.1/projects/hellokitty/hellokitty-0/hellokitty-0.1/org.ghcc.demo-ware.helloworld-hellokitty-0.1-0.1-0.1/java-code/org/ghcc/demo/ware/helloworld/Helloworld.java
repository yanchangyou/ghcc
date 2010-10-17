package org.ghcc.demo.ware.helloworld;


import org.ghcc.toft.ware.core.impl.ether.abstracts.matrix.EtherAbstractFunctionEntity;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherFunctionNode;

public class Helloworld extends EtherAbstractFunctionEntity {

	public void drive(EtherFunctionNode functionNode) throws Exception {
//		System.out.println("to Helloworld function");
		driveChild(functionNode);
	}
}