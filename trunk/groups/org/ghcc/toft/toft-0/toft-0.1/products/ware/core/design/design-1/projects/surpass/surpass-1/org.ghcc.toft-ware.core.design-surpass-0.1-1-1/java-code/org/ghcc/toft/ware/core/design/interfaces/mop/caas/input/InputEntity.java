/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.design.interfaces.mop.caas.input;

import org.ghcc.toft.ware.core.design.interfaces.concept.caas.Input;
import org.ghcc.toft.ware.core.design.interfaces.cop.Entity;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.input.lifecycle.InputBuilder;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.input.lifecycle.InputDriver;


/**
 * InputEntity
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 21:10:15
 * @version 0.1-1-1
 *
 */


public interface InputEntity extends Input, Entity, InputCOP, InputConcept, InputBuilder, InputDriver {
}
