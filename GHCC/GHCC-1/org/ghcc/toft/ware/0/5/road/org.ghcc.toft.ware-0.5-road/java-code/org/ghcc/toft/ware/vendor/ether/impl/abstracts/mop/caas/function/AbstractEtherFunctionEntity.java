/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.function;

import org.dom4j.Element;
import org.ghcc.toft.ware.norm.interfaces.cop.define.Context;
import org.ghcc.toft.ware.norm.interfaces.cop.define.Resource;
import org.ghcc.toft.ware.norm.interfaces.cop.exception.BuildException;
import org.ghcc.toft.ware.norm.interfaces.cop.exception.COPException;
import org.ghcc.toft.ware.norm.interfaces.cop.exception.DriveException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.define.FunctionContext;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.define.FunctionResource;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.exception.FunctionBuildException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.exception.FunctionDriveException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.exception.FunctionLoadException;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.EtherFunctionEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.define.EtherFunctionContext;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.define.EtherFunctionResource;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define.EtherWareContext;
import org.ghcc.toft.ware.vendor.ether.util.dom4j.Dom4jUtil;


/**
 * AbstractEtherFunctionEntity
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 01:24:18
 * @version 0.5
 *
 */


public abstract class AbstractEtherFunctionEntity implements EtherFunctionEntity {

	protected EtherFunctionResource functionResource;

	/**
	 * @param resource
	 * @throws BuildException
	 */
	public void build(Resource resource) throws BuildException {
		build((FunctionResource)resource);
	}

	/**
	 * @param context
	 * @throws DriveException
	 */
	public void drive(Context context) throws FunctionDriveException, COPException {
		drive((FunctionContext)context);
	}

	/**
	 * @param resource
	 * @throws FunctionBuildException
	 */
	public void build(FunctionResource resource) throws FunctionBuildException {
		build((EtherFunctionResource)resource);
	}

	/**
	 * @param context
	 * @throws FunctionDriveException
	 */
	public void drive(FunctionContext context) throws FunctionDriveException, COPException {
		drive((EtherFunctionContext)context);
	}

	public EtherFunctionResource getFunctionResource() {
		return functionResource;
	}

	public void setFunctionResource(EtherFunctionResource functionResource) {
		this.functionResource = functionResource;
	}

	/**
	 * @param resource
	 * @throws FunctionBuildException
	 */
	public void build(EtherFunctionResource resource) throws FunctionBuildException {
		setFunctionResource(resource);
		try {
			setFunctionProperties();
		} catch (Exception e) {
			throw new FunctionBuildException(e);
		}
	}
	
	public Element getFunctionElement() {
		return this.getFunctionResource().getFunctionElement();
	}

	/**
	 * 顺序执行子节点
	 * @param context
	 * @throws COPException 
	 * @throws FunctionLoadException 
	 */
	public void driveChildrenBySequence(EtherFunctionContext context) throws FunctionLoadException, COPException {
		for (Element functionElement : getFunctionElement().elements()) {
			EtherWareContext wareContext = context.getWareContext();
			EtherFunctionContext functionContext = wareContext.getFunctionContext(functionElement);
			EtherFunctionEntity functionEntity = functionContext.loadFunctionEntity(functionElement);
			functionEntity.drive(functionContext);
		}
	}

	/**
	 * @param element
	 * @throws Exception 
	 */
	public void setFunctionProperties() throws Exception {
		Element element = this.getFunctionElement();
		Dom4jUtil.putElementAttributeToObjectField(element, this);
	}
}
