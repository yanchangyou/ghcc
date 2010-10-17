package org.ghcc.demo.ware.helloworld.speak.words;

import org.apache.commons.lang.StringUtils;
import org.ghcc.toft.ware.core.impl.ether.abstracts.matrix.EtherAbstractFunctionEntity;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherFunctionNode;

public class SpeakWords extends EtherAbstractFunctionEntity {

	public void drive(EtherFunctionNode node) throws Exception {
//		System.out.println("to SpeakWords ");
		System.out.println(node.getDom4jElement().getText());
		System.out.println(StringUtils.capitalize("abc"));
	}

}
