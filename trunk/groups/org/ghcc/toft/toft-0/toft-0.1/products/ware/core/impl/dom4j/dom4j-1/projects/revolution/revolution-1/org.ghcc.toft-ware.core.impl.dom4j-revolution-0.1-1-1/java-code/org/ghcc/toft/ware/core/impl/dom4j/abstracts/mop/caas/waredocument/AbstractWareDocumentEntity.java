/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.waredocument;

import java.net.URL;

import org.dom4j.Document;
import org.dom4j.Element;
import org.ghcc.toft.ware.core.design.interfaces.cop.Entity;
import org.ghcc.toft.ware.core.design.interfaces.cop.define.Context;
import org.ghcc.toft.ware.core.design.interfaces.cop.define.ID;
import org.ghcc.toft.ware.core.design.interfaces.cop.define.PathInfo;
import org.ghcc.toft.ware.core.design.interfaces.cop.define.Resource;
import org.ghcc.toft.ware.core.design.interfaces.cop.exception.BuildException;
import org.ghcc.toft.ware.core.design.interfaces.cop.exception.DriveException;
import org.ghcc.toft.ware.core.design.interfaces.cop.exception.LoadException;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.define.WareID;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.define.WarePathInfo;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.exception.WareLoadException;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.WareDocumentEntity;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.define.WareDocumentContext;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.define.WareDocumentResource;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.exception.WareDocumentBuildException;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.exception.WareDocumentDriveException;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.function.define.AbstractFunctionResource;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.ware.define.AbstractWareContext;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.ware.define.AbstractWareID;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.ware.define.AbstractWarePathInfo;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.ware.lifecycle.AbstractWareLoader;
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

	public void build(Resource resource) throws BuildException {
		build((WareDocumentResource)resource);
	}

	public void drive(Context context) throws DriveException {
		drive((WareDocumentContext)context);
	}

	public void build(WareDocumentResource resource)
			throws WareDocumentBuildException {
		System.out.println("ware document is building...");
		
	}

	public void drive(WareDocumentContext context)
			throws WareDocumentDriveException {
//		System.out.println("ware document is driving...");
		try {
			Element functionElement = wareDocumentDom4j.getRootElement();
			
			AbstractWareLoader loader = new AbstractWareLoader();
			
			WareID id = new AbstractWareID(functionElement.getNamespace());
			
			WarePathInfo pathInfo = new AbstractWarePathInfo(functionElement.getNamespace());
			Entity wareEntity;
			try {
				wareEntity = loader.load(pathInfo, id);
				AbstractFunctionResource functionResource = new AbstractFunctionResource(functionElement);
				AbstractWareContext wareContext = new AbstractWareContext(functionResource);
				wareEntity.drive(wareContext);
			} catch (WareLoadException e) {
				e.getJavaException().printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) throws Exception {
		
		ID id = new AbstractWareDocumentID("Helloworld.ware.xml"); 
		
		URL wareDocumentPath = new URL("https://ghcc.googlecode.com/svn/trunk/groups/org/ghcc/toft/toft-0/toft-0.1/products/ware/core/impl/dom4j/dom4j-1/projects/revolution/revolution-1/org.ghcc.toft-ware.core.impl.dom4j-revolution-0.1-1-1/java-code/org/ghcc/toft/ware/core/impl/dom4j/test/");
		PathInfo pathInfo = new AbstractWareDocumentPathInfo(wareDocumentPath);
		
		AbstractWareDocumentLoader wareDocumentLoader = new AbstractWareDocumentLoader();
		
		AbstractWareDocumentEntity entity = null;
		try {
			entity = wareDocumentLoader.load(pathInfo, id);
//			System.out.println(entity.getWareDocumentDom4j().asXML());
			entity.drive(null);
		} catch (LoadException e) {
			e.getJavaException().printStackTrace();
		}
		
	}
}
