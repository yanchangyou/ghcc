/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.input.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.concept.caas.Input;
import org.ghcc.toft.ware.norm.interfaces.cop.lifecycle.Builder;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.input.define.InputResource;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.input.exception.InputBuildException;


/**
 * InputBuilder
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 21:10:15
 * @version 0.1-0.1-1
 *
 */


public interface InputBuilder extends Input, Builder, InputCOPLifeCycle {

	public void build(InputResource resource) throws InputBuildException;

}
