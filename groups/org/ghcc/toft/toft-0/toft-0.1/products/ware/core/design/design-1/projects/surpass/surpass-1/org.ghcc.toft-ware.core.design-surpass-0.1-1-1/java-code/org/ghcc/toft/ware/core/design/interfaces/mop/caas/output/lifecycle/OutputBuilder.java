/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.design.interfaces.mop.caas.output.lifecycle;

import org.ghcc.toft.ware.core.design.interfaces.concept.caas.Output;
import org.ghcc.toft.ware.core.design.interfaces.cop.lifecycle.Builder;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.output.define.OutputResource;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.output.exception.OutputBuildException;


/**
 * OutputBuilder
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 21:10:15
 * @version 0.1-1-1
 *
 */


public interface OutputBuilder extends Output, Builder, OutputCOPLifeCycle {

	public void build(OutputResource resource) throws OutputBuildException;

}
