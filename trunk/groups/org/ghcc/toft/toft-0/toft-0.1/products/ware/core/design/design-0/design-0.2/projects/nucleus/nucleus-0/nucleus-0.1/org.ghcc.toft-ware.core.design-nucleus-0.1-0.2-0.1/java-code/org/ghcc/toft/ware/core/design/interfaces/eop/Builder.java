package org.ghcc.toft.ware.core.design.interfaces.eop;

import org.ghcc.toft.ware.core.design.interfaces.eop.exception.BuildException;

/**
 * 构建实体
 * @author yanchangyou
 *
 */
public interface Builder extends EOP {

	/**
	 * 构建
	 * @param resorce
	 * @throws Exception
	 */
	public void build(Resource resource) throws BuildException;
	
}
