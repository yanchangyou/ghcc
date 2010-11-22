/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.online.apache.ant.ware.function.project;

import java.io.File;

import org.ghcc.toft.ware.norm.interfaces.cop.exception.COPException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.exception.FunctionLoadException;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.define.EtherFunctionContext;
import org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.function.AbstractEtherFunctionEntity;

/**
 * Project
 * 
 * @author yanchangyou
 * @date 2010-11-21 下午03:32:22
 * @version 0.1-1-1
 *
 */

public class Project extends AbstractEtherFunctionEntity {

	protected String name;
	
	protected String base;
	
	/**
	 * @param context
	 * @throws COPException 
	 * @throws FunctionLoadException 
	 */
	public void drive(EtherFunctionContext context) throws FunctionLoadException, COPException {
		super.driveChildrenBySequence(context);
		System.out.println("project name : " + name);
		System.out.println("project base : " + base);
		
		System.out.println(new File(base).getAbsolutePath());
		
	}

}
