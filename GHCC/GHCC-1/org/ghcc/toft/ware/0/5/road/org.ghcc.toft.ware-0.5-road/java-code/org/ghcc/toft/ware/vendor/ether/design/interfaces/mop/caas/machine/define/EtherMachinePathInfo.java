/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define;

import java.net.URL;

import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.define.MachinePathInfo;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.define.EtherPathInfo;


/**
 * EtherMachinePathInfo
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-20 00:17:21
 * @version 0.5
 *
 */


public interface EtherMachinePathInfo extends MachinePathInfo, EtherPathInfo, EtherMachineCOPDefine {
	
	public String WARE_MACHINE_URL = "ware.machine.url";
	
	public URL[] getPathURLs();
	
}
