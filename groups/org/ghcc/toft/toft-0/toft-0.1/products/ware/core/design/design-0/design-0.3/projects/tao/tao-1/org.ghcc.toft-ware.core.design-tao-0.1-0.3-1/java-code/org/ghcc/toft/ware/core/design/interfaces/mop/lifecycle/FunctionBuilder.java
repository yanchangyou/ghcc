package org.ghcc.toft.ware.core.design.interfaces.mop.lifecycle;

/**
 * FunctionBuilder
 * 
 * @author yanchangyou
 * @date 2010-10-20 23:53:17
 * @version 0.1
 * @since 0.3
 *
 */
import org.ghcc.toft.ware.core.design.interfaces.caas.Function;
import org.ghcc.toft.ware.core.design.interfaces.eop.lifecycle.Builder;
import org.ghcc.toft.ware.core.design.interfaces.mop.define.FunctionResource;
import org.ghcc.toft.ware.core.design.interfaces.mop.exception.FunctionBuildException;

public interface FunctionBuilder extends Function, Builder {

	/**
	 * 构建
	 * @param resorce
	 * @throws Exception
	 */
	public void build(FunctionResource functionResource) throws FunctionBuildException;
}