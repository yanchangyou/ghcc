package org.ghcc.toft.ware.core.design.interfaces.eop.lifecycle;

import org.ghcc.toft.ware.core.design.interfaces.eop.Entity;
import org.ghcc.toft.ware.core.design.interfaces.eop.define.ID;
import org.ghcc.toft.ware.core.design.interfaces.eop.define.PathInfo;
import org.ghcc.toft.ware.core.design.interfaces.eop.exception.LoadException;

/**
 * 
 * 加载实体类
 * 
 * @author yanchangyou
 * @version 0.3
 * @since 0.1
 *
 */
public interface Loader extends LifeCycle {

	/**
	 * 加载实体
	 * @param id
	 * @return
	 */
	public Entity load(ID id) throws LoadException;
	
	/**
	 * 在指定路径信息下面加载实体
	 * @param pathInfo
	 * @param id
	 * @return
	 */
	public Entity load(PathInfo pathInfo, ID id) throws LoadException;
	
}
