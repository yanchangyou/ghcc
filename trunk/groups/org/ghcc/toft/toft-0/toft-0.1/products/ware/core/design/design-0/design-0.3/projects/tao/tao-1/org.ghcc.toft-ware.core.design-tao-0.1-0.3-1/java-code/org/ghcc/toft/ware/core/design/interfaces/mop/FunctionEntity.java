package org.ghcc.toft.ware.core.design.interfaces.mop;

/**
 * FunctionEntity
 * 
 * @author yanchangyou
 * @date 2010-10-20 23:53:17
 * @version 0.1
 * @since 0.3
 *
 */
import org.ghcc.toft.ware.core.design.interfaces.caas.Function;
import org.ghcc.toft.ware.core.design.interfaces.eop.Entity;
import org.ghcc.toft.ware.core.design.interfaces.mop.lifecycle.FunctionBuilder;
import org.ghcc.toft.ware.core.design.interfaces.mop.lifecycle.FunctionDriver;

public interface FunctionEntity extends Function, Entity, FunctionConcept, FunctionBuilder, FunctionDriver {

}