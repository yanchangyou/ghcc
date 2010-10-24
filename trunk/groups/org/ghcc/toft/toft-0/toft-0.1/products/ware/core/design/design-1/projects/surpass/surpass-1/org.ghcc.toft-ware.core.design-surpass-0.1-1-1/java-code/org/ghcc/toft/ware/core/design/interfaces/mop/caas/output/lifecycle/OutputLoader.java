/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.design.interfaces.mop.caas.output.lifecycle;

import org.ghcc.toft.ware.core.design.interfaces.concept.caas.Output;
import org.ghcc.toft.ware.core.design.interfaces.cop.lifecycle.Loader;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.output.OutputEntity;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.output.define.OutputID;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.output.define.OutputPathInfo;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.output.exception.OutputLoadException;


/**
 * OutputLoader
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 21:10:15
 * @version 0.1-1-1
 *
 */


public interface OutputLoader extends Output, Loader, OutputCOPLifeCycle {

	public OutputEntity load(OutputID id) throws OutputLoadException;

	public OutputEntity load(OutputPathInfo pathInfo, OutputID id) throws OutputLoadException;

}
