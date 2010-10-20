package org.ghcc.toft.ware.core.design.interfaces.mop.lifecycle;

/**
 * WareBuilder
 * 
 * @author yanchangyou
 * @date 2010-10-20 23:53:17
 * @version 0.1
 * @since 0.3
 *
 */
import org.ghcc.toft.ware.core.design.interfaces.caas.Ware;
import org.ghcc.toft.ware.core.design.interfaces.eop.lifecycle.Builder;
import org.ghcc.toft.ware.core.design.interfaces.mop.define.WareResource;
import org.ghcc.toft.ware.core.design.interfaces.mop.exception.WareBuildException;

public interface WareBuilder extends Ware, Builder {
	
	/**
	 * 构建
	 * @param resorce
	 * @throws Exception
	 */
	public void build(WareResource wareResource) throws WareBuildException;
}