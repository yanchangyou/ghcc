/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.lifecycle;

import org.ghcc.toft.ware.norm.interfaces.concept.caas.Ware;
import org.ghcc.toft.ware.norm.interfaces.cop.lifecycle.Loader;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.WareEntity;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.define.WareID;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.define.WarePathInfo;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.exception.WareLoadException;


/**
 * WareLoader
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public interface WareLoader extends Ware, Loader, WareCOPLifeCycle {

	public WareEntity load(WareID id) throws WareLoadException;

	public WareEntity load(WarePathInfo pathInfo, WareID id) throws WareLoadException;

}
