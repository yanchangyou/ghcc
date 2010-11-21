/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.machine.define;

import java.util.HashMap;
import java.util.Map;

import org.dom4j.Namespace;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.ware.define.EtherWareContext;
import org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.machine.define.AbstractEtherMachineContext;
import org.ghcc.toft.ware.vendor.ether.impl.defaults.mop.caas.ware.define.DefaultEtherWareContext;


/**
 * DefaultEtherMachineContext
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-19 23:55:27
 * @version 0.5
 *
 */


public class DefaultEtherMachineContext extends AbstractEtherMachineContext {

	protected Map<Namespace, EtherWareContext> wareContextMap;
	
	public DefaultEtherMachineContext() {
		wareContextMap = new HashMap<Namespace, EtherWareContext>();
	}
	/**
	 * @param wareNamespace
	 * @return
	 */
	public EtherWareContext getWareContext(Namespace wareNamespace) {
		EtherWareContext wareContext = wareContextMap.get(wareNamespace);
		if (wareContext == null) {
			wareContext = new DefaultEtherWareContext(this);
			wareContextMap.put(wareNamespace, wareContext);
		}
		return wareContext;
	}
}
