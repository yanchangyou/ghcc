package org.ghcc.toft.ware.core.design.interfaces.eop;

/**
 * 加载实体类
 * @author yanchangyou
 *
 */
public interface Loader extends EOP {

	/**
	 * 加载实体
	 * @param id
	 * @return
	 */
	public Entity load(ID id);
	
	/**
	 * 在指定路径信息下面加载实体
	 * @param pathInfo
	 * @param id
	 * @return
	 */
	public Entity load(PathInfo pathInfo, ID id);
	
}
