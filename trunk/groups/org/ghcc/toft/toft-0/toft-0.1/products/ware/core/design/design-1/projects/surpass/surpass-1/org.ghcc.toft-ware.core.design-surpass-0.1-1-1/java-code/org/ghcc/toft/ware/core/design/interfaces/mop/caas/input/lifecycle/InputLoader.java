/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.design.interfaces.mop.caas.input.lifecycle;

import org.ghcc.toft.ware.core.design.interfaces.concept.caas.Input;
import org.ghcc.toft.ware.core.design.interfaces.cop.define.ID;
import org.ghcc.toft.ware.core.design.interfaces.cop.lifecycle.Loader;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.input.InputEntity;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.input.define.InputID;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.input.define.InputPathInfo;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.input.exception.InputLoadException;


/**
 * InputLoader
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 21:10:15
 * @version 0.1-1-1
 *
 */


public interface InputLoader extends Input, Loader, InputCOPLifeCycle {

	public InputEntity load(InputID id) throws InputLoadException;

	public InputEntity load(InputPathInfo pathInfo, ID id) throws InputLoadException;

}
