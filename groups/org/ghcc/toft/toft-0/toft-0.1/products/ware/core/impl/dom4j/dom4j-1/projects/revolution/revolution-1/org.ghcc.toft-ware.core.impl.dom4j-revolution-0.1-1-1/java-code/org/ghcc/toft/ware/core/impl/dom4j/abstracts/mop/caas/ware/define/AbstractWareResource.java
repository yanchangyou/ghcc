/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.ware.define;

import org.dom4j.Namespace;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.define.WareResource;


/**
 * AbstractWareResource
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 23:38:13
 * @version 0.1-1-1
 *
 */


public class AbstractWareResource extends AbstractWareCOPDefine implements WareResource {
	
	protected Namespace nameSpace;

	public AbstractWareResource(Namespace nameSpace) {
		setNameSpace(nameSpace);
	}
	
	public Namespace getNameSpace() {
		return nameSpace;
	}

	public void setNameSpace(Namespace nameSpace) {
		this.nameSpace = nameSpace;
	}
}
