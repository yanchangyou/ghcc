/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.design.interfaces.mop.caas.output.lifecycle;

import org.ghcc.toft.ware.core.design.interfaces.concept.caas.Output;
import org.ghcc.toft.ware.core.design.interfaces.cop.lifecycle.Recycler;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.output.OutputEntity;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.output.exception.OutputRecycleException;


/**
 * OutputRecycler
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 21:10:15
 * @version 0.1-1-1
 *
 */


public interface OutputRecycler extends Output, Recycler, OutputCOPLifeCycle {

	public void recycly(OutputEntity entity) throws OutputRecycleException;

}
