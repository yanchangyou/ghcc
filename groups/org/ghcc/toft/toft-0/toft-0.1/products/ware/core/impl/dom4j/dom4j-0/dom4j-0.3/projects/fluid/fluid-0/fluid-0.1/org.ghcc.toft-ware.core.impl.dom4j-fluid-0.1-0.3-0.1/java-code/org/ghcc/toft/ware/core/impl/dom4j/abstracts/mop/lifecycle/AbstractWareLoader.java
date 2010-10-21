package org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop.lifecycle;

/**
 * AbstractWareLoader
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
import org.ghcc.toft.ware.core.design.interfaces.mop.define.WareID;
import org.ghcc.toft.ware.core.design.interfaces.mop.define.WarePathInfo;
import org.ghcc.toft.ware.core.design.interfaces.mop.lifecycle.WareLoader;

public abstract class AbstractWareLoader implements WareLoader {

	public Entity load(ID id) throws LoadException {
		return load((WareID)id);
	}

	public Entity load(PathInfo pathInfo, ID id) throws LoadException {
		return load((WarePathInfo)pathInfo, (WareID)id);
	}

}