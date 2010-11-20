/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.machine.define;

import org.ghcc.toft.ware.norm.interfaces.mop.caas.machine.define.MachineID;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.define.EtherID;


/**
 * EtherMachineID
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-20 00:17:21
 * @version 0.5
 *
 */


public interface EtherMachineID extends MachineID, EtherID, EtherMachineCOPDefine {
	public String getFileName();
}
