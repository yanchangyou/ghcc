/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.function.define;

import java.net.URL;
import java.util.List;

import org.ghcc.toft.ware.core.design.interfaces.mop.caas.function.define.FunctionPathInfo;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.ware.define.AbstractWarePathInfo;


/**
 * AbstractFunctionPathInfo
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 23:38:13
 * @version 0.1-1-1
 *
 */


public class AbstractFunctionPathInfo extends AbstractFunctionCOPDefine implements FunctionPathInfo {
	
//	protected AbstractWarePathInfo warePathInfo;

	protected List<URL> pathURLList;
	
	public AbstractFunctionPathInfo(AbstractWarePathInfo warePathInfo, List<URL> pathURLList) {
		pathURLList.addAll(warePathInfo.getPathURLList());
		setPathURLList(pathURLList);
	}
	
	public List<URL> getPathURLList() {
		return pathURLList;
	}

	protected void setPathURLList(List<URL> pathURLList) {
		this.pathURLList = pathURLList;
	}
}
