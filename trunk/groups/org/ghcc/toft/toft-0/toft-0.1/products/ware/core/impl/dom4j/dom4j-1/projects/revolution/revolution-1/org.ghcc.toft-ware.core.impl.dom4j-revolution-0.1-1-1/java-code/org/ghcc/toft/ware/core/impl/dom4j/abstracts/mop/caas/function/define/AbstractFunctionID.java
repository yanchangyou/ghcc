/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.function.define;

import org.ghcc.toft.ware.core.design.interfaces.mop.caas.function.define.FunctionID;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.ware.define.AbstractWareID;

/**
 * AbstractFunctionID
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 23:38:13
 * @version 0.1-1-1
 * 
 */

public class AbstractFunctionID extends AbstractFunctionCOPDefine implements
		FunctionID {

	protected String tagName;

	protected AbstractWareID wareID;

	public AbstractFunctionID(AbstractWareID wareID, String tagName) {
		setWareID(wareID);
		setTagName(tagName);
	}

	public AbstractWareID getWareID() {
		return wareID;
	}

	protected void setWareID(AbstractWareID wareID) {
		this.wareID = wareID;
	}

	public String getTagName() {
		return tagName;
	}

	protected void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getID() {
		return getTagName();
	}
	
	public String getFunctionClassName() {
		String[] namePart = tagName.split("-");
		StringBuffer packageBuf = new StringBuffer();
		StringBuffer classNameBuf = new StringBuffer();
		for (int i = 0; i < namePart.length; i++) {
			if(i < namePart.length -1) {
				packageBuf.append(namePart[i]);
				packageBuf.append(".");
			}
			classNameBuf.append(namePart[i].substring(0, 1).toUpperCase() + namePart[i].substring(1));
		}
		String warePackage = wareID.getWarePackageName();
		if (warePackage .length() > 0) {
			warePackage += ".";
		}
		return warePackage + packageBuf + classNameBuf;
	}
}
