/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.function.lifecycle;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Map;

import org.ghcc.toft.ware.core.design.interfaces.cop.define.ID;
import org.ghcc.toft.ware.core.design.interfaces.cop.define.PathInfo;
import org.ghcc.toft.ware.core.design.interfaces.cop.exception.LoadException;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.function.define.FunctionID;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.function.define.FunctionPathInfo;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.function.exception.FunctionLoadException;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.function.lifecycle.FunctionLoader;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.function.AbstractFunctionEntity;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.function.define.AbstractFunctionID;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.function.define.AbstractFunctionPathInfo;

/**
 * AbstractFunctionLoader
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 23:38:13
 * @version 0.1-1-1
 * 
 */

public class AbstractFunctionLoader extends AbstractFunctionCOPLifeCycle
		implements FunctionLoader {

	protected static Map<String, AbstractFunctionEntity> functionEntityBufferMap = new HashMap<String, AbstractFunctionEntity>();
	
	
	public AbstractFunctionEntity load(ID id) throws LoadException {
		return load((FunctionID) id);
	}

	public AbstractFunctionEntity load(PathInfo pathInfo, ID id)
			throws LoadException {
		return load((FunctionPathInfo) pathInfo, (FunctionID) id);
	}

	public AbstractFunctionEntity load(FunctionID id)
			throws FunctionLoadException {
		AbstractFunctionID functionID = (AbstractFunctionID) id;

		String functionClassName = functionID.getFunctionClassName();
		return laodFunctionEntity(this.getClass().getClassLoader(), functionClassName);
	}

	private AbstractFunctionEntity laodFunctionEntity(ClassLoader loader,
			String functionClassName) throws FunctionLoadException {
		if (functionEntityBufferMap.containsKey(functionClassName)) {
			return functionEntityBufferMap.get(functionClassName);
		}
		AbstractFunctionEntity entity;
		try {
			entity = (AbstractFunctionEntity) loader.loadClass(functionClassName)
					.newInstance();
		} catch (Exception e) {
			throw new FunctionLoadException(e);
		}
		return entity;
	}

	public AbstractFunctionEntity load(FunctionPathInfo pathInfo, FunctionID id)
			throws FunctionLoadException {
		URLClassLoader loader = new URLClassLoader(((AbstractFunctionPathInfo)pathInfo).getPathURLList().toArray(new URL[0]));
		return laodFunctionEntity(loader, ((AbstractFunctionID) id).getFunctionClassName());
	}
}
