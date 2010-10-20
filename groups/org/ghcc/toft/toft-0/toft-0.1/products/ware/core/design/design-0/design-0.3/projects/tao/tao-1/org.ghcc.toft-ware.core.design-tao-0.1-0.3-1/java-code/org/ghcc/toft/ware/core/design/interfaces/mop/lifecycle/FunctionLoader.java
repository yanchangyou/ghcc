package org.ghcc.toft.ware.core.design.interfaces.mop.lifecycle;

/**
 * FunctionLoader
 * 
 * @author yanchangyou
 * @date 2010-10-20 23:53:17
 * @version 0.1
 * @since 0.3
 *
 */
import org.ghcc.toft.ware.core.design.interfaces.caas.Function;
import org.ghcc.toft.ware.core.design.interfaces.eop.Entity;
import org.ghcc.toft.ware.core.design.interfaces.eop.lifecycle.Loader;
import org.ghcc.toft.ware.core.design.interfaces.mop.define.FunctionID;
import org.ghcc.toft.ware.core.design.interfaces.mop.define.FunctionPathInfo;
import org.ghcc.toft.ware.core.design.interfaces.mop.exception.FunctionLoadException;

public interface FunctionLoader extends Function, Loader {

	/**
	 * 加载实体
	 * @param id
	 * @return
	 */
	public Entity load(FunctionID functionID) throws FunctionLoadException;
	
	/**
	 * 在指定路径信息下面加载实体
	 * @param pathInfo
	 * @param id
	 * @return
	 */
	public Entity load(FunctionPathInfo functionPathInfo, FunctionID functionID) throws FunctionLoadException;
	

}