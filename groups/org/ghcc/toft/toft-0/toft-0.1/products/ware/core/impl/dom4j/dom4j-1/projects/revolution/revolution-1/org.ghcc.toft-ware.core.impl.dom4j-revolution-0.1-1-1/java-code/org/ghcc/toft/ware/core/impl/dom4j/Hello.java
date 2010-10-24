/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.impl.dom4j;

import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.function.AbstractFunctionEntity;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.function.define.AbstractFunctionContext;

/**
 * Hello
 * 
 * @author yanchangyou
 * @date 2010-10-24 下午10:55:28
 * @version 0.1-1-1
 *
 */

public class Hello extends AbstractFunctionEntity {

	public void drive(AbstractFunctionContext functionContext) {
//		System.out.println("first hello world is runing...");
		System.out.println(functionContext.getFunctionElement().getText().trim());
	}
}
