package org.ghcc.demo.ware.helloworld;


import java.net.MalformedURLException;
import java.net.URL;

import org.ghcc.toft.ware.core.impl.ether.abstracts.matrix.EtherAbstractWareEntity;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherFunctionEntity;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherFunctionNode;

public class HelloworldWare extends EtherAbstractWareEntity {
	
	public void drive(EtherFunctionNode functionNode) throws Exception {
//		System.out.println("to drive(EtherFunctionNode functionNode) ");
//		System.out.println(functionNode.getDom4jElement().asXML());
		
		EtherFunctionEntity functionEntity= loadFunctionEntity(functionNode);
		functionEntity.drive(functionNode);
	}

	public URL[] configClassPathURLs() throws MalformedURLException {
		return new URL[]{new URL("https://ghcc.googlecode.com/svn/trunk/groups/org/ghcc/ghcc-0/ghcc-0.1/products/demo/ware/helloworld/helloworld-0/helloworld-0.1/projects/alpha/alpha-0/alpha-0.1/org.ghcc-demo.ware.helloworld-alpha-0.1-0.1-0.1/depend/java-lib/commons-lang-2.4.jar")};
	}
	
}