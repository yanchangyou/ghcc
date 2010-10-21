package org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.lifecycle;

/**
 * AbstractWareDocumentLoader
 * 
 * @author yanchangyou
 * @date 2010-10-21 23:31:20
 * @version 0.1
 * @since 0.3
 *
 */
import org.ghcc.toft.ware.core.design.interfaces.eop.Entity;
import org.ghcc.toft.ware.core.design.interfaces.eop.define.ID;
import org.ghcc.toft.ware.core.design.interfaces.eop.define.PathInfo;
import org.ghcc.toft.ware.core.design.interfaces.eop.exception.LoadException;
import org.ghcc.toft.ware.core.design.interfaces.mop.define.WareDocumentID;
import org.ghcc.toft.ware.core.design.interfaces.mop.define.WareDocumentPathInfo;
import org.ghcc.toft.ware.core.design.interfaces.mop.lifecycle.WareDocumentLoader;

public abstract class AbstractWareDocumentLoader implements WareDocumentLoader {

	public Entity load(ID id) throws LoadException {
		return load((WareDocumentID)id);
	}

	public Entity load(PathInfo pathInfo, ID id) throws LoadException {
		return load((WareDocumentPathInfo)pathInfo, (WareDocumentID)id);
	}

}