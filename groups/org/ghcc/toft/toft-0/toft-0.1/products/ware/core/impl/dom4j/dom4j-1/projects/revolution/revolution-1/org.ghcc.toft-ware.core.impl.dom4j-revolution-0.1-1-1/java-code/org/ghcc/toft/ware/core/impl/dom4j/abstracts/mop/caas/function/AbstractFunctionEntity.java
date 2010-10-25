/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.function;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.ghcc.toft.ware.core.design.interfaces.cop.Entity;
import org.ghcc.toft.ware.core.design.interfaces.cop.define.Context;
import org.ghcc.toft.ware.core.design.interfaces.cop.define.Resource;
import org.ghcc.toft.ware.core.design.interfaces.cop.exception.BuildException;
import org.ghcc.toft.ware.core.design.interfaces.cop.exception.DriveException;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.function.FunctionEntity;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.function.define.FunctionContext;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.function.define.FunctionID;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.function.define.FunctionPathInfo;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.function.define.FunctionResource;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.function.exception.FunctionBuildException;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.function.exception.FunctionDriveException;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.function.exception.FunctionLoadException;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.function.define.AbstractFunctionContext;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.function.define.AbstractFunctionID;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.function.define.AbstractFunctionPathInfo;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.function.lifecycle.AbstractFunctionLoader;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.ware.define.AbstractWareID;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.ware.define.AbstractWarePathInfo;


/**
 * AbstractFunctionEntity
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 23:38:13
 * @version 0.1-1-1
 *
 */


public class AbstractFunctionEntity extends AbstractFunctionCOP implements FunctionEntity {

	public void build(Resource resource) throws BuildException {
		build((FunctionResource)resource);
	}

	public void drive(Context context) throws DriveException {
		drive((FunctionContext)context);
	}

	public void build(FunctionResource resource) throws FunctionBuildException {
//		System.out.println("function entity building...");
	}

	/* (non-Javadoc)
	 * @see org.ghcc.toft.ware.core.design.interfaces.mop.caas.function.lifecycle.FunctionDriver#drive(org.ghcc.toft.ware.core.design.interfaces.mop.caas.function.define.FunctionContext)
	 */
	public void drive(FunctionContext context) throws FunctionDriveException {
		drive((AbstractFunctionContext)context);
	}
	
	public void drive(AbstractFunctionContext functionContext) {
		
	}
	
	public static void main(String[] args) throws Exception {
		
		AbstractWareID wareID = new AbstractWareID("org.ghcc.toft-ware.core.impl.dom4j-revolution-0.1-1-1");
		
		List<URL> pathURLList = new ArrayList<URL>();
		pathURLList.add(new URL("file://L:/ghcc/svn/groups/org/ghcc/toft/toft-0/toft-0.1/products/ware/core/impl/dom4j/dom4j-1/projects/revolution/revolution-1/org.ghcc.toft-ware.core.impl.dom4j-revolution-0.1-1-1/product/java-classes/"));
		AbstractWarePathInfo warePathInfo = new AbstractWarePathInfo(pathURLList);
		
		AbstractFunctionLoader loader = new AbstractFunctionLoader();
		
//		Thread.currentThread().getContextClassLoader().
		
		FunctionID id = new AbstractFunctionID(wareID, "test-find");
		
		List<URL> functionPathURLList = new ArrayList<URL>();
		FunctionPathInfo pathInfo = new AbstractFunctionPathInfo(warePathInfo, functionPathURLList);
		Entity entity;
		try {
			entity = loader.load(pathInfo, id);
			System.out.println(entity);
			entity.drive(null);
		} catch (FunctionLoadException e) {
			e.getJavaException().printStackTrace();
		}
	}
}
