/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.online.apache.ant.jar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.ghcc.online.apache.ant.property.Property;
import org.ghcc.online.apache.ant.util.ParamUtil;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.exception.FunctionDriveException;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.define.EtherFunctionContext;
import org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.function.AbstractEtherFunctionEntity;

/**
 * Jar
 * 
 * @author yanchangyou
 * @date 2010-11-21 下午03:35:57
 * @version 0.1-1-1
 * 
 */

public class Jar extends AbstractEtherFunctionEntity {

	protected String jarfile;

	protected String basedir;

	/**
	 * @param context
	 * @throws FunctionDriveException
	 */
	public void drive(EtherFunctionContext context)
			throws FunctionDriveException {

		basedir = ParamUtil.getRealValueByParam(basedir, Property.propertyMap);
		System.out.println(basedir);
		jarfile = ParamUtil.getRealValueByParam(jarfile, Property.propertyMap);
		System.out.println(jarfile);

		String manifest = Property.propertyMap.get("project-path")
				+ "/depend/MANIFEST.MF";
		String javaCommand = Property.propertyMap.get("java-bin-path")
				+ "jar -cvfm " + jarfile + " " + manifest + " -C " + basedir
				+ " .";
		System.out.println(javaCommand);
		try {
			final Process process = Runtime.getRuntime().exec(
					"cmd /c " + javaCommand);

			new Thread() {
				public void run() {
					try {
						String msg = null;
						BufferedReader errorReader = new BufferedReader(
								new InputStreamReader(process.getErrorStream()));
						while ((msg = errorReader.readLine()) != null) {
							System.err.println(msg);
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}.start();

			new Thread() {
				public void run() {
					try {
						String msg = null;
						BufferedReader reader = new BufferedReader(
								new InputStreamReader(process.getInputStream()));
						while ((msg = reader.readLine()) != null) {
							System.out.println(msg);
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}.start();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
