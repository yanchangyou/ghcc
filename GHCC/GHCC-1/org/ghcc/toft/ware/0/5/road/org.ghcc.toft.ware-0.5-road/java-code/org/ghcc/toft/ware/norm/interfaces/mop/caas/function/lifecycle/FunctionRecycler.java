/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.function.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.concept.caas.Function;
import org.ghcc.toft.ware.norm.interfaces.cop.lifecycle.Recycler;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.FunctionEntity;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.exception.FunctionRecycleException;


/**
 * FunctionRecycler
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public interface FunctionRecycler extends Function, Recycler, FunctionCOPLifeCycle {

	public void recycly(FunctionEntity entity) throws FunctionRecycleException;

}
