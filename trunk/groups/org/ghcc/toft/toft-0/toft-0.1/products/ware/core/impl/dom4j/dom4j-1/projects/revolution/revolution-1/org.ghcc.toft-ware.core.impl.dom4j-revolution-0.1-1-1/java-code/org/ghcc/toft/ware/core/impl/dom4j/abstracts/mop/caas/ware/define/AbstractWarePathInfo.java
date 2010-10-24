/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.ware.define;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Namespace;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.define.WarePathInfo;


/**
 * AbstractWarePathInfo
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 23:38:13
 * @version 0.1-1-1
 *
 */


public class AbstractWarePathInfo extends AbstractWareCOPDefine implements WarePathInfo {
	
	protected List<URL> pathURLList;

	public AbstractWarePathInfo(List<URL> pathURLList) {
		setPathURLList(pathURLList);
	}
	
	public AbstractWarePathInfo(Namespace namespace) throws MalformedURLException {
		String wareURI = namespace.getURI();
		String warePath = wareURI.substring(0, wareURI.lastIndexOf('/'));
		AbstractWareID wareID = new AbstractWareID(namespace);
		String projectPath = wareID.getWareProjectPath();
		pathURLList = new ArrayList<URL>();
		pathURLList.add(new URL(warePath + "/" + projectPath + "/product/java-lib/" + wareID.getID() + ".jar"));
		pathURLList.add(new URL(warePath + "/" + projectPath + "/product/java-classes/"));
	}
	
	public List<URL> getPathURLList() {
		return pathURLList;
	}

	protected void setPathURLList(List<URL> pathURLList) {
		this.pathURLList = pathURLList;
	}
	
	
}
