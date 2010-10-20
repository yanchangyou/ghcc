package org.ghcc.toft.ware.core.design.interfaces.eop.lifecycle;

import org.ghcc.toft.ware.core.design.interfaces.eop.define.Resource;
import org.ghcc.toft.ware.core.design.interfaces.eop.exception.BuildException;

/**
 * 
 * 构建实体
 * 
 * @author yanchangyou
 * @version 0.2
 * @since 0.2
 *
 */
public interface Builder extends LifeCycle {

	/**
	 * 构建
	 * @param resorce
	 * @throws Exception
	 */
	public void build(Resource resource) throws BuildException;
	
}
