/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.lifecycle.FunctionRecycler;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.lifecycle.EtherRecycler;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.EtherFunctionEntity;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.exception.FunctionRecycleException;


/**
 * EtherFunctionRecycler
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-20 00:17:21
 * @version 0.5
 *
 */


public interface EtherFunctionRecycler extends FunctionRecycler, EtherRecycler, EtherFunctionCOPLifeCycle {

	public void recycly(EtherFunctionEntity entity) throws FunctionRecycleException;

}
