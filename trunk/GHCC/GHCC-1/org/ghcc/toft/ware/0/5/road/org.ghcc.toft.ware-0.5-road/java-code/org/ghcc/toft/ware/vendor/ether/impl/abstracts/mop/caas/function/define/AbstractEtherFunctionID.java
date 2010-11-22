/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.function.define;

import org.dom4j.Element;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.define.EtherFunctionID;
import org.ghcc.toft.ware.vendor.ether.util.entity.WareUtil;


/**
 * AbstractEtherFunctionID
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 01:24:18
 * @version 0.5
 *
 */


public abstract class AbstractEtherFunctionID implements EtherFunctionID {

	private Element functionElement;
	
	public AbstractEtherFunctionID(Element functionElement) {
		setFunctionElement(functionElement);
	}

	/**
	 * @param functionElement the functionElement to set
	 */
	public void setFunctionElement(Element functionElement) {
		this.functionElement = functionElement;
	}
	/**
	 * @return the functionElement
	 */
	public Element getFunctionElement() {
		return functionElement;
	}
	
	public String getID() {
		return functionElement.getName();
	}
	
	/**
	 * 获取function的类名
	 * @return
	 */
	public String getFunctionClassName() {
		String warePackageName = WareUtil.getWarePackageName(functionElement.getNamespace());
		StringBuffer nameBuf = new StringBuffer();
		String id = this.getID();
		String[] parts = id .split("-");
		for (int i = 0; i < parts.length; i++) {
			nameBuf.append(parts[i].substring(0, 1).toUpperCase());
			nameBuf.append(parts[i].substring(1));
		}
		String packageName = id.replace('-', '.');
		return warePackageName + ".ware.function." + packageName + "." + nameBuf;
	}
}
