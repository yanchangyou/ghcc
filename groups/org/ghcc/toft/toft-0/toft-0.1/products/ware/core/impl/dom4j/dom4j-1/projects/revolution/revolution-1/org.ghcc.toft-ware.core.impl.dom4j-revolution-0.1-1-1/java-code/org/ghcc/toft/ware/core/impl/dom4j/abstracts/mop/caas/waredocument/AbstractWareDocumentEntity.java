/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.waredocument;

import java.net.URL;

import org.dom4j.Document;
import org.ghcc.toft.ware.core.design.interfaces.cop.define.Context;
import org.ghcc.toft.ware.core.design.interfaces.cop.define.ID;
import org.ghcc.toft.ware.core.design.interfaces.cop.define.PathInfo;
import org.ghcc.toft.ware.core.design.interfaces.cop.define.Resource;
import org.ghcc.toft.ware.core.design.interfaces.cop.exception.BuildException;
import org.ghcc.toft.ware.core.design.interfaces.cop.exception.DriveException;
import org.ghcc.toft.ware.core.design.interfaces.cop.exception.LoadException;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.WareDocumentEntity;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.define.WareDocumentContext;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.define.WareDocumentResource;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.exception.WareDocumentBuildException;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.exception.WareDocumentDriveException;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.waredocument.define.AbstractWareDocumentID;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.waredocument.define.AbstractWareDocumentPathInfo;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.waredocument.lifecycle.AbstractWareDocumentLoader;


/**
 * AbstractWareDocumentEntity
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 23:38:13
 * @version 0.1-1-1
 *
 */


public class AbstractWareDocumentEntity extends AbstractWareDocumentCOP implements WareDocumentEntity {

	
	public AbstractWareDocumentEntity(Document wareDocumentDom4j) {
		setWareDocumentDom4j(wareDocumentDom4j);
	}
	
	protected Document wareDocumentDom4j;
	
	public Document getWareDocumentDom4j() {
		return wareDocumentDom4j;
	}

	protected void setWareDocumentDom4j(Document wareDocumentDom4j) {
		this.wareDocumentDom4j = wareDocumentDom4j;
	}

	/* (non-Javadoc)
	 * @see org.ghcc.toft.ware.core.design.interfaces.cop.lifecycle.Builder#build(org.ghcc.toft.ware.core.design.interfaces.cop.define.Resource)
	 */
	public void build(Resource resource) throws BuildException {
		build((WareDocumentResource)resource);
	}

	/* (non-Javadoc)
	 * @see org.ghcc.toft.ware.core.design.interfaces.cop.lifecycle.Driver#drive(org.ghcc.toft.ware.core.design.interfaces.cop.define.Context)
	 */
	public void drive(Context context) throws DriveException {
		drive((WareDocumentContext)context);
	}

	/* (non-Javadoc)
	 * @see org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.lifecycle.WareDocumentBuilder#build(org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.define.WareDocumentResource)
	 */
	public void build(WareDocumentResource resource)
			throws WareDocumentBuildException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.lifecycle.WareDocumentDriver#drive(org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.define.WareDocumentContext)
	 */
	public void drive(WareDocumentContext context)
			throws WareDocumentDriveException {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) throws Exception {
		
		ID id = new AbstractWareDocumentID("Helloworld.ware.xml"); 
		
		URL wareDocumentPath = new URL("file://L:/ghcc/svn/groups/org/ghcc/demo/demo-0/demo-0.1/products/app/helloworld/helloworld-0/helloworld-0.1/projects/hellokitty/hellokitty-0/hellokitty-0.1/org.ghcc.demo-app.helloworld-hellokitty-0.1-0.1-0.1/ware-code/org/ghcc/demo/app/helloworld/");
		PathInfo pathInfo = new AbstractWareDocumentPathInfo(wareDocumentPath);
		
		AbstractWareDocumentLoader wareDocumentLoader = new AbstractWareDocumentLoader();
		
		AbstractWareDocumentEntity entity = null;
		try {
			entity = wareDocumentLoader.load(pathInfo, id);
			System.out.println(entity.getWareDocumentDom4j().asXML());
		} catch (LoadException e) {
			e.getJavaException().printStackTrace();
		}
		
	}
}
