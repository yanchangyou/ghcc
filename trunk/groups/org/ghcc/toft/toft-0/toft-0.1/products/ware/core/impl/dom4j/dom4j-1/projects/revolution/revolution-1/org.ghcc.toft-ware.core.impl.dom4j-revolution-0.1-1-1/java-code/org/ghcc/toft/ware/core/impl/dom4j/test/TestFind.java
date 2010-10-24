/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.impl.dom4j.test;

import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.function.AbstractFunctionEntity;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.function.define.AbstractFunctionContext;

/**
 * TestFind
 * 
 * @author yanchangyou
 * @date 2010-10-24 下午10:04:48
 * @version 0.1-1-1
 *
 */

public class TestFind extends AbstractFunctionEntity {

	public void drive(AbstractFunctionContext functionContext) {
//		System.out.println("TestFind is driving...");
		System.out.println(functionContext.getFunctionElement().getText().trim());
	}
}
