/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.online.apache.ant.ware.function.mkdir;

import java.io.File;

import org.ghcc.online.apache.ant.util.ParamUtil;
import org.ghcc.online.apache.ant.ware.function.property.Property;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.exception.FunctionDriveException;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.define.EtherFunctionContext;
import org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.function.AbstractEtherFunctionEntity;

/**
 * Mkdir
 * 
 * @author yanchangyou
 * @date 2010-11-21 下午03:35:29
 * @version 0.1-1-1
 *
 */

public class Mkdir extends AbstractEtherFunctionEntity {

	protected String dir;
	/**
	 * @param context
	 * @throws FunctionDriveException
	 */
	public void drive(EtherFunctionContext context)
			throws FunctionDriveException {
		String realValue = ParamUtil.getRealValueByParam(dir, Property.propertyMap);
		
		File file = new File(realValue);
		if (!file.exists()) {
			file.mkdirs();
			System.out.println("make file : " + file.getAbsolutePath());
		}
	}

}
