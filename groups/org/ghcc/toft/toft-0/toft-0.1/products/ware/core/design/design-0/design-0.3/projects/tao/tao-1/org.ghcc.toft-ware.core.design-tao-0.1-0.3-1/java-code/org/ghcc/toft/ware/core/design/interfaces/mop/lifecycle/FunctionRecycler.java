package org.ghcc.toft.ware.core.design.interfaces.mop.lifecycle;

/**
 * FunctionRecycler
 * 
 * @author yanchangyou
 * @date 2010-10-20 23:53:17
 * @version 0.1
 * @since 0.3
 *
 */
import org.ghcc.toft.ware.core.design.interfaces.caas.Function;
import org.ghcc.toft.ware.core.design.interfaces.eop.lifecycle.Recycler;
import org.ghcc.toft.ware.core.design.interfaces.mop.FunctionEntity;
import org.ghcc.toft.ware.core.design.interfaces.mop.exception.FunctionRecycleException;

public interface FunctionRecycler extends Function, Recycler {

	/**
	 * 回收
	 */
	public void recycle(FunctionEntity functionentity) throws FunctionRecycleException;
}