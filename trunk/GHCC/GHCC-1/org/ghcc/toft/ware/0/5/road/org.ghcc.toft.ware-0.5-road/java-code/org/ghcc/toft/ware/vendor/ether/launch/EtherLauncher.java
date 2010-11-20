/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.launch;

import org.ghcc.toft.ware.norm.interfaces.cop.exception.COPException;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.EtherMachineEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define.EtherMachinePathInfo;
import org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.machine.define.DefaultEtherMachineContext;
import org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.machine.define.DefaultEtherMachinePathInfo;
import org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.machine.lifecycle.DefaultEtherMachineLoader;

/**
 * Launcher
 * 
 * @author yanchangyou
 * @date 2010-11-20 上午11:26:59
 * @version 0.1-1-1
 *
 */

public class EtherLauncher {

	public static void main(String[] args) throws Exception {
		EtherLauncher launcher = new EtherLauncher();
		try {
			launcher.launch(args);
		} catch (COPException e) {
			e.getJavaException().printStackTrace();
		}
	}
	
	public void launch(String[] args) throws COPException, Exception {
		
		String wareMachineURL = System.getProperty(EtherMachinePathInfo.WARE_MACHINE_URL);
		
		String id = args[0];
		
		DefaultEtherMachineLoader loader = new DefaultEtherMachineLoader(new DefaultEtherMachinePathInfo(wareMachineURL));
		
		EtherMachineEntity machine = loader.load(id);
		
		machine.build(null);
		machine.drive(new DefaultEtherMachineContext());
	}
}
