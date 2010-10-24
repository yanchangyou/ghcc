/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.waredocument.lifecycle;

import java.io.File;
import java.io.InputStreamReader;
import java.net.URL;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.ghcc.toft.ware.core.design.interfaces.cop.define.ID;
import org.ghcc.toft.ware.core.design.interfaces.cop.define.PathInfo;
import org.ghcc.toft.ware.core.design.interfaces.cop.exception.LoadException;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.define.WareDocumentID;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.define.WareDocumentPathInfo;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.exception.WareDocumentLoadException;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.lifecycle.WareDocumentLoader;
import org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.caas.waredocument.AbstractWareDocumentEntity;


/**
 * AbstractWareDocumentLoader
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 23:38:13
 * @version 0.1-1-1
 *
 */


public class AbstractWareDocumentLoader extends AbstractWareDocumentCOPLifeCycle implements WareDocumentLoader {

	/* (non-Javadoc)
	 * @see org.ghcc.toft.ware.core.design.interfaces.cop.lifecycle.Loader#load(org.ghcc.toft.ware.core.design.interfaces.cop.define.ID)
	 */
	public AbstractWareDocumentEntity load(ID id) throws LoadException {
		return load((WareDocumentID)id);
	}

	/* (non-Javadoc)
	 * @see org.ghcc.toft.ware.core.design.interfaces.cop.lifecycle.Loader#load(org.ghcc.toft.ware.core.design.interfaces.cop.define.PathInfo, org.ghcc.toft.ware.core.design.interfaces.cop.define.ID)
	 */
	public AbstractWareDocumentEntity load(PathInfo pathInfo, ID id) throws LoadException {
		return load((WareDocumentPathInfo)pathInfo, (WareDocumentID)id);
	}

	/* (non-Javadoc)
	 * @see org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.lifecycle.WareDocumentLoader#load(org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.define.WareDocumentID)
	 */
	public AbstractWareDocumentEntity load(WareDocumentID id) throws WareDocumentLoadException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.lifecycle.WareDocumentLoader#load(org.ghcc.toft.ware.core.design.interfaces.mop.caas.waredocument.define.WareDocumentPathInfo, org.ghcc.toft.ware.core.design.interfaces.cop.define.ID)
	 */
	public AbstractWareDocumentEntity load(WareDocumentPathInfo pathInfo, WareDocumentID id)
			throws WareDocumentLoadException {
		AbstractWareDocumentEntity wareDocumentEntity = null;
		URL url = pathInfo.getWareDocumentPathURL();
		try {
			URL realURL = new URL(url, id.getID());
			SAXReader saxReader = new SAXReader();
			Document document = null;
			File wareDocumentFile = new File(realURL.getPath());
			if (wareDocumentFile.exists()) {
				document = saxReader.read(wareDocumentFile);
			} else {
				document = saxReader.read(new InputStreamReader(realURL.openStream()));
			}
			wareDocumentEntity = new AbstractWareDocumentEntity(document);
			
		} catch (Exception e) {
			WareDocumentLoadException wareDocumentLoadException = new WareDocumentLoadException();
			wareDocumentLoadException.setJavaException(e);
			throw wareDocumentLoadException;
		}
		
		return wareDocumentEntity;
	}
	
	public static void main(String[] args) throws Exception {
		URL parent = new URL("http://i:9999/");
		URL url = new URL(parent, "text.ware.xml");
		System.out.println(url);
	}
}
