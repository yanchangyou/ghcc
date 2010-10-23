/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.design.interfaces.mop.caas.output.lifecycle;

import org.ghcc.toft.ware.core.design.interfaces.concept.caas.Output;
import org.ghcc.toft.ware.core.design.interfaces.cop.lifecycle.Driver;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.output.define.OutputContext;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.output.exception.OutputDriveException;


/**
 * OutputDriver
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 21:10:15
 * @version 0.1-1-1
 *
 */


public interface OutputDriver extends Output, Driver, OutputCOPLifeCycle {

	public void drive(OutputContext context) throws OutputDriveException;

}
