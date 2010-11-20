/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.machine.lifecycle;

import java.net.URL;
import java.net.URLClassLoader;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.exception.MachineLoadException;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.EtherMachineEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define.EtherMachineID;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define.EtherMachinePathInfo;
import org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.machine.lifecycle.AbstractEtherMachineLoader;
import org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.machine.DefaultEtherMachineEntity;

/**
 * DefaultEtherMachineLoader
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 23:55:27
 * @version 0.5
 * 
 */

public class DefaultEtherMachineLoader extends AbstractEtherMachineLoader {

	protected ClassLoader loader;
	protected EtherMachinePathInfo pathInfo;
	
	public DefaultEtherMachineLoader(EtherMachinePathInfo pathInfo) {
		this.pathInfo = pathInfo;
		loader = new URLClassLoader(new URL[]{pathInfo.getPathURL()});
	}
	
	/**
	 * @param pathInfo
	 * @param id
	 * @return
	 * @throws MachineLoadException
	 */
	public EtherMachineEntity load(EtherMachineID id) throws MachineLoadException {

		Document document = null;
		try {
			document = new SAXReader().read(loader.getResourceAsStream(id.getFileName()));;
		} catch (Exception e) {
			throw new MachineLoadException(e);
		}
		DefaultEtherMachineEntity wareDocumentEntity = new DefaultEtherMachineEntity(document);

		return wareDocumentEntity;
	}
}
