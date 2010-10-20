package org.ghcc.toft.ware.core.design.interfaces.eop.lifecycle;

import org.ghcc.toft.ware.core.design.interfaces.eop.Entity;
import org.ghcc.toft.ware.core.design.interfaces.eop.exception.RecycleException;
/**
 * 
 * 实体回收者
 * 
 * @author yanchangyou
 * @version 0.1
 * @since 0.3
 *
 */
public interface Recycler extends LifeCycle {

	/**
	 * 回收
	 */
	public void recycle(Entity entity) throws RecycleException;
}
