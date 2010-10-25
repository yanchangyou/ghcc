/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.ware;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Element;
import org.ghcc.toft.ware.core.design.interfaces.cop.Entity;
import org.ghcc.toft.ware.core.design.interfaces.cop.define.Context;
import org.ghcc.toft.ware.core.design.interfaces.cop.define.Resource;
import org.ghcc.toft.ware.core.design.interfaces.cop.exception.BuildException;
import org.ghcc.toft.ware.core.design.interfaces.cop.exception.DriveException;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.function.define.FunctionID;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.function.define.FunctionPathInfo;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.function.exception.FunctionLoadException;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.WareEntity;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.define.WareContext;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.define.WareID;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.define.WarePathInfo;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.define.WareResource;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.exception.WareBuildException;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.exception.WareDriveException;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.exception.WareLoadException;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.function.define.AbstractFunctionContext;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.function.define.AbstractFunctionID;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.function.define.AbstractFunctionPathInfo;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.function.define.AbstractFunctionResource;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.function.lifecycle.AbstractFunctionLoader;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.ware.define.AbstractWareContext;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.ware.define.AbstractWareID;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.ware.define.AbstractWarePathInfo;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.ware.lifecycle.AbstractWareLoader;


/**
 * AbstractWareEntity
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 23:38:13
 * @version 0.1-1-1
 *
 */


public class AbstractWareEntity extends AbstractWareCOP implements WareEntity, AbstractWareConcept {

	protected WarePathInfo warePathInfo;
	
	protected WareID wareID;
	
	protected WareResource resource;
	
	
	public WarePathInfo getWarePathInfo() {
		return warePathInfo;
	}

	public void setWarePathInfo(WarePathInfo warePathInfo) {
		this.warePathInfo = warePathInfo;
	}

	public WareResource getResource() {
		return resource;
	}

	public void setResource(WareResource resource) {
		this.resource = resource;
	}

	public WareID getWareID() {
		return wareID;
	}

	public void setWareID(WareID wareID) {
		this.wareID = wareID;
	}

	public void build(Resource resource) throws BuildException {
		build((WareResource)resource);
	}

	public void drive(Context context) throws DriveException {
		drive((WareContext)context);
	}

	public void build(WareResource resource) throws WareBuildException {
		this.resource = resource;
	}

	/**
	 * TODO : drive部分尽量简洁, 后期单独一个方法抽象处理 ware转交到function的接口
	 */
	public void drive(WareContext context) throws WareDriveException {
//		System.out.println("entity is run");
		AbstractWareContext wareContext = (AbstractWareContext)context;
		Element functionElement = wareContext.getFunctionResource().getFunctionElement();

		AbstractFunctionLoader loader = new AbstractFunctionLoader();
		
		FunctionID functionID = new AbstractFunctionID((AbstractWareID) wareID, functionElement.getName());
		
		List<URL> functionPathURLList = new ArrayList<URL>();
		FunctionPathInfo functionPathInfo = new AbstractFunctionPathInfo((AbstractWarePathInfo) warePathInfo, functionPathURLList);
		Entity entity;
		try {
			entity = loader.load(functionPathInfo, functionID);
//			System.out.println(entity);
			AbstractFunctionContext functionContext = new AbstractFunctionContext(functionElement);
			entity.drive(functionContext);
			for (@SuppressWarnings("rawtypes")
			Iterator it = functionElement.elementIterator(); it.hasNext();) {
				AbstractFunctionResource functionResource = new AbstractFunctionResource((Element) it.next());
				AbstractWareContext subWareContext = new AbstractWareContext(functionResource);
				drive(subWareContext);
			}
		} catch (FunctionLoadException e) {
			e.getJavaException().printStackTrace();
		} catch (DriveException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		
		
		AbstractWareLoader loader = new AbstractWareLoader();
		
		WareID id = new AbstractWareID("org.ghcc.toft-ware.core.impl.dom4j-revolution-0.1-1-1");
		
		List<URL> pathURLList = new ArrayList<URL>();
		pathURLList.add(new URL("file://L:/ghcc/svn/groups/org/ghcc/toft/toft-0/toft-0.1/products/ware/core/impl/dom4j/dom4j-1/projects/revolution/revolution-1/org.ghcc.toft-ware.core.impl.dom4j-revolution-0.1-1-1/product/java-classes/"));
		WarePathInfo pathInfo = new AbstractWarePathInfo(pathURLList);
		Entity wareEntity;
		try {
			wareEntity = loader.load(pathInfo, id);
			System.out.println(wareEntity);
			wareEntity.drive(null);
		} catch (WareLoadException e) {
			e.getJavaException().printStackTrace();
		}
		
	}
	
}
