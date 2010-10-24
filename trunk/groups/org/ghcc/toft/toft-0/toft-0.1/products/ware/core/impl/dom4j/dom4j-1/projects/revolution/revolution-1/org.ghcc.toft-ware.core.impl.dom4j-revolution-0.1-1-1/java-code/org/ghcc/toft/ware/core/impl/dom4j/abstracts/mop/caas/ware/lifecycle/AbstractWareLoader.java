/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.ware.lifecycle;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Map;

import org.ghcc.toft.ware.core.design.interfaces.cop.define.ID;
import org.ghcc.toft.ware.core.design.interfaces.cop.define.PathInfo;
import org.ghcc.toft.ware.core.design.interfaces.cop.exception.LoadException;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.define.WareID;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.define.WarePathInfo;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.exception.WareLoadException;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.lifecycle.WareLoader;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.ware.AbstractWareEntity;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.ware.define.AbstractWareID;


/**
 * AbstractWareLoader
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 23:38:13
 * @version 0.1-1-1
 *
 */


public class AbstractWareLoader extends AbstractWareCOPLifeCycle implements WareLoader {

	protected static Map<String, AbstractWareEntity> wareEntityBufferMap = new HashMap<String, AbstractWareEntity>();
	
	protected URLClassLoader urlClassLoader;
	
	public AbstractWareEntity load(ID id) throws LoadException {
		return load((WareID)id);
	}

	public AbstractWareEntity load(PathInfo pathInfo, ID id) throws LoadException {
		return load((WarePathInfo)pathInfo, (WareID)id);
	}

	public AbstractWareEntity load(WareID id) throws WareLoadException {
		String wareClassName = ((AbstractWareID)id).getWareClassName();
		AbstractWareEntity entity = loadWareEntity(this.getClass().getClassLoader(), wareClassName);
		entity.setWareID(id);
		return entity;
	}

	private AbstractWareEntity loadWareEntity(ClassLoader loader, String wareClassName)
			throws WareLoadException {
		if (wareEntityBufferMap.containsKey(wareClassName)) {
			return wareEntityBufferMap.get(wareClassName);
		}
		AbstractWareEntity entity;
		try {
			entity = (AbstractWareEntity)loader.loadClass(wareClassName).newInstance();
		} catch (Exception e) {
			throw new WareLoadException(e);
		}
		return entity;
	}

	public AbstractWareEntity load(WarePathInfo pathInfo, WareID id)
			throws WareLoadException {
		URLClassLoader loader = new URLClassLoader(pathInfo.getPathURLList().toArray(new URL[0]));
		String wareClassName = ((AbstractWareID)id).getWareClassName();
		AbstractWareEntity entity = loadWareEntity(loader, wareClassName);
		entity.setWareID(id);
		entity.setWarePathInfo(pathInfo);
		return entity;
	}
}
