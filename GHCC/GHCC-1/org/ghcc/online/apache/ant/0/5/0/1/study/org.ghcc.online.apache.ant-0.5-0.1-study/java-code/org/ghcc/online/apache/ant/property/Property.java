/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.online.apache.ant.property;

import java.util.HashMap;
import java.util.Map;

import org.ghcc.online.apache.ant.util.ParamUtil;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.exception.FunctionDriveException;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.define.EtherFunctionContext;
import org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.function.AbstractEtherFunctionEntity;

/**
 * Property
 * 
 * @author yanchangyou
 * @date 2010-11-21 下午03:31:56
 * @version 0.1-1-1
 *
 */

public class Property extends AbstractEtherFunctionEntity {

	public static Map<String, String> propertyMap = new HashMap<String, String>();

	protected String name;

	protected String value;
	
	/**
	 * @param context
	 * @throws FunctionDriveException
	 */
	public void drive(EtherFunctionContext context)
			throws FunctionDriveException {
		propertyMap.put(name, ParamUtil.getRealValueByParam(value, Property.propertyMap));
	}

}
