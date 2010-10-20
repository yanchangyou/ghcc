package org.ghcc.toft.ware.core.design.interfaces.mop.lifecycle;

/**
 * WareLoader
 * 
 * @author yanchangyou
 * @date 2010-10-20 23:53:17
 * @version 0.1
 * @since 0.3
 *
 */
import org.ghcc.toft.ware.core.design.interfaces.caas.Ware;
import org.ghcc.toft.ware.core.design.interfaces.eop.Entity;
import org.ghcc.toft.ware.core.design.interfaces.eop.lifecycle.Loader;
import org.ghcc.toft.ware.core.design.interfaces.mop.define.WareID;
import org.ghcc.toft.ware.core.design.interfaces.mop.define.WarePathInfo;
import org.ghcc.toft.ware.core.design.interfaces.mop.exception.WareLoadException;

public interface WareLoader extends Ware, Loader {

	/**
	 * 加载实体
	 * @param id
	 * @return
	 */
	public Entity load(WareID WareID) throws WareLoadException;
	
	/**
	 * 在指定路径信息下面加载实体
	 * @param pathInfo
	 * @param id
	 * @return
	 */
	public Entity load(WarePathInfo WarePathInfo, WareID WareID) throws WareLoadException;
	



}