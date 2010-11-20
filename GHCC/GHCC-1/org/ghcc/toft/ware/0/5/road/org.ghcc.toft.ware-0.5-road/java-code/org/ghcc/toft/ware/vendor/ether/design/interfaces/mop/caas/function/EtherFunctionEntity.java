/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function;

import org.dom4j.Element;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.FunctionEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.EtherEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.lifecycle.EtherFunctionBuilder;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.lifecycle.EtherFunctionDriver;


/**
 * EtherFunctionEntity
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-20 00:17:21
 * @version 0.5
 *
 */


public interface EtherFunctionEntity extends FunctionEntity, EtherEntity, EtherFunctionCOP, EtherFunctionConcept, EtherFunctionBuilder, EtherFunctionDriver {
	
	public Element getFunctionElement();
	
}
