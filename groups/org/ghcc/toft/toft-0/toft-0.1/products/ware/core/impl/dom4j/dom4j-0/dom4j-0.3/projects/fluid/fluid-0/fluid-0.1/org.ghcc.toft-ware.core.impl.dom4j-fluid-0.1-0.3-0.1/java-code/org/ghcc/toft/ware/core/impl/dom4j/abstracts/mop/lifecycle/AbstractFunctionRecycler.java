package org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.lifecycle;

/**
 * AbstractFunctionRecycler
 * 
 * @author yanchangyou
 * @date 2010-10-21 23:31:20
 * @version 0.1
 * @since 0.3
 *
 */
import org.ghcc.toft.ware.core.design.interfaces.eop.Entity;
import org.ghcc.toft.ware.core.design.interfaces.eop.exception.RecycleException;
import org.ghcc.toft.ware.core.design.interfaces.mop.FunctionEntity;
import org.ghcc.toft.ware.core.design.interfaces.mop.lifecycle.FunctionRecycler;

public abstract class AbstractFunctionRecycler implements FunctionRecycler {

	public void recycle(Entity entity) throws RecycleException {
		recycle((FunctionEntity)entity);
	}

}