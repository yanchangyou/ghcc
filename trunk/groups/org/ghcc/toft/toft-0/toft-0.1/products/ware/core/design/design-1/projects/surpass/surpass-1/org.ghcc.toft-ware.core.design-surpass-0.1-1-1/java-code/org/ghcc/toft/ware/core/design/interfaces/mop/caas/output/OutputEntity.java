/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.design.interfaces.mop.caas.output;

import org.ghcc.toft.ware.core.design.interfaces.concept.caas.Output;
import org.ghcc.toft.ware.core.design.interfaces.cop.Entity;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.output.lifecycle.OutputBuilder;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.output.lifecycle.OutputDriver;


/**
 * OutputEntity
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 21:10:15
 * @version 0.1-1-1
 *
 */


public interface OutputEntity extends Output, Entity, OutputCOP, OutputConcept, OutputBuilder, OutputDriver {
}
