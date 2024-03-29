/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.design.interfaces.mop.caas.input.lifecycle;

import org.ghcc.toft.ware.core.design.interfaces.concept.caas.Input;
import org.ghcc.toft.ware.core.design.interfaces.cop.lifecycle.Recycler;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.input.InputEntity;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.input.exception.InputRecycleException;


/**
 * InputRecycler
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 21:10:15
 * @version 0.1-1-1
 *
 */


public interface InputRecycler extends Input, Recycler, InputCOPLifeCycle {

	public void recycly(InputEntity entity) throws InputRecycleException;

}
