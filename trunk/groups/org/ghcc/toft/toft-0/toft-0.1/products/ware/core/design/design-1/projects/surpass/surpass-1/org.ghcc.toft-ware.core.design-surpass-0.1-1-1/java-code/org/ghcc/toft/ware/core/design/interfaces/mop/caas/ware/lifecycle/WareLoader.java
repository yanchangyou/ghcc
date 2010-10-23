/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.lifecycle;

import org.ghcc.toft.ware.core.design.interfaces.concept.caas.Ware;
import org.ghcc.toft.ware.core.design.interfaces.cop.define.ID;
import org.ghcc.toft.ware.core.design.interfaces.cop.lifecycle.Loader;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.WareEntity;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.define.WareID;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.define.WarePathInfo;
import org.ghcc.toft.ware.core.design.interfaces.mop.caas.ware.exception.WareLoadException;


/**
 * WareLoader
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-10-23 21:10:15
 * @version 0.1-1-1
 *
 */


public interface WareLoader extends Ware, Loader, WareCOPLifeCycle {

	public WareEntity load(WareID id) throws WareLoadException;

	public WareEntity load(WarePathInfo pathInfo, ID id) throws WareLoadException;

}
