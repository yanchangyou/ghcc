/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware;

import java.net.URL;

import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.WareEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.EtherEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define.EtherWareID;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.lifecycle.EtherWareBuilder;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.lifecycle.EtherWareDriver;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.lifecycle.EtherWareLoader;


/**
 * EtherWareEntity
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-20 00:17:21
 * @version 0.5
 *
 */


public interface EtherWareEntity extends WareEntity, EtherEntity, EtherWareCOP, EtherWareConcept, EtherWareBuilder, EtherWareDriver {
	
	public void setWareID(EtherWareID wareID);
	
	public EtherWareID getWareID();

	public EtherWareLoader getWareLoader();
	
	public void setWareLoader(EtherWareLoader wareLoader);
	
	/**
	 * 添加后期需要的class path, 这样可以使function里面的类加载第三方类
	 * @param url
	 */
	public URL[] configClassPath();
	
}
