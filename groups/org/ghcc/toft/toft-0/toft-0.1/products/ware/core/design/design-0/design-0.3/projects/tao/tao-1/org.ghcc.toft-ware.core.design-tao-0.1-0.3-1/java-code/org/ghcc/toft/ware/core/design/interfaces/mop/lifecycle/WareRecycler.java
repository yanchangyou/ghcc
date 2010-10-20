package org.ghcc.toft.ware.core.design.interfaces.mop.lifecycle;

/**
 * WareRecycler
 * 
 * @author yanchangyou
 * @date 2010-10-20 23:53:17
 * @version 0.1
 * @since 0.3
 *
 */
import org.ghcc.toft.ware.core.design.interfaces.caas.Ware;
import org.ghcc.toft.ware.core.design.interfaces.eop.lifecycle.Recycler;
import org.ghcc.toft.ware.core.design.interfaces.mop.WareEntity;
import org.ghcc.toft.ware.core.design.interfaces.mop.exception.WareRecycleException;

public interface WareRecycler extends Ware, Recycler {

	/**
	 * 回收
	 */
	public void recycle(WareEntity Wareentity) throws WareRecycleException;
}