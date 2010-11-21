/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.function.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.exception.FunctionLoadException;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.EtherFunctionEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.define.EtherFunctionID;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.lifecycle.EtherWareLoader;
import org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.function.lifecycle.AbstractEtherFunctionLoader;


/**
 * DefaultEtherFunctionLoader
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 23:55:27
 * @version 0.5
 *
 */


public class DefaultEtherFunctionLoader extends AbstractEtherFunctionLoader {
	
	protected EtherWareLoader etherWareLoader;
	
	public DefaultEtherFunctionLoader(EtherWareLoader etherWareLoader) {
		this.etherWareLoader = etherWareLoader;
	}
	/**
	 * @param id
	 * @return
	 * @throws FunctionLoadException
	 */
	public EtherFunctionEntity load(EtherFunctionID id) throws FunctionLoadException {
		ClassLoader loader = etherWareLoader.getWareClassLoader();
		String className = id.getFunctionClassName();
		EtherFunctionEntity entity = null;
		try {
			entity = (EtherFunctionEntity) loader.loadClass(className).newInstance();
		} catch (Exception e) {
			throw new FunctionLoadException(e);
		}
		return entity;
	}
}
