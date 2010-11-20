/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.function.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.cop.define.ID;
import org.ghcc.toft.ware.norm.interfaces.cop.exception.LoadException;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.FunctionEntity;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.define.FunctionID;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.exception.FunctionLoadException;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.define.EtherFunctionID;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.lifecycle.EtherFunctionLoader;


/**
 * AbstractEtherFunctionLoader
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 01:24:18
 * @version 0.5
 *
 */


public abstract class AbstractEtherFunctionLoader implements EtherFunctionLoader {

	/**
	 * @param id
	 * @return
	 * @throws FunctionLoadException
	 */
	public FunctionEntity load(FunctionID id) throws FunctionLoadException {
		return load((EtherFunctionID)id);
	}

	/**
	 * @param id
	 * @return
	 * @throws LoadException
	 */
	public FunctionEntity load(ID id) throws LoadException {
		return load((FunctionID)id);
	}
}
