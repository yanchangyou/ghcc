/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.launch;

import java.net.URL;

import org.ghcc.toft.ware.norm.interfaces.cop.exception.COPException;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.EtherMachineEntity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define.EtherMachineID;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define.EtherMachinePathInfo;
import org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.machine.define.DefaultEtherMachineID;
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
			launcher.launch();
		} catch (COPException e) {
			e.getJavaException().printStackTrace();
		}
	}
	
	public void launch() throws COPException, Exception {
		URL url = new URL("file://L:/ghcc/ghcc/GHCC-1/svn/org/ghcc/toft/ware/0/5/road/org.ghcc.toft.ware-0.5-road/java-code/");
		EtherMachinePathInfo pathInfo = new DefaultEtherMachinePathInfo(url);
		DefaultEtherMachineLoader loader = new DefaultEtherMachineLoader(pathInfo);
		EtherMachineID id = new DefaultEtherMachineID("org.ghcc.toft.ware.vendor.ether.launch.Helloworld");
		EtherMachineEntity machine = loader.load(id);
		
		machine.build(null);
		machine.drive(null);
		
	}
}
