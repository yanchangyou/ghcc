/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.online.apache.ant.javac;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

import org.ghcc.online.apache.ant.property.Property;
import org.ghcc.online.apache.ant.util.ParamUtil;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.function.exception.FunctionDriveException;
import org.ghcc.toft.ware.util.FileDealer;
import org.ghcc.toft.ware.util.FileTraver;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.mop.caas.function.define.EtherFunctionContext;
import org.ghcc.toft.ware.vendor.ether.impl.abstracts.mop.caas.function.AbstractEtherFunctionEntity;

/**
 * Javac
 * 
 * @author yanchangyou
 * @date 2010-11-21 下午03:35:45
 * @version 0.1-1-1
 *
 */

public class Javac extends AbstractEtherFunctionEntity {

	protected String srcdir;
	
	protected String destdir;
	
	/**
	 * @param context
	 * @throws FunctionDriveException
	 */
	public void drive(EtherFunctionContext context)
			throws FunctionDriveException {
		srcdir = ParamUtil.getRealValueByParam(srcdir, Property.propertyMap);
		destdir = ParamUtil.getRealValueByParam(destdir, Property.propertyMap);

		System.out.println("srcdir : " + srcdir);
		System.out.println("destdir : " + destdir);
		
		try {
			String FILE_PATH = new File(srcdir).getAbsolutePath(); 
			FileTraver.trave(new File(FILE_PATH), new FileDealer() {

				public void deal(File file) throws Exception {
					if (!file.getAbsolutePath().endsWith(".java")) {
						return;
					}
					String javaCommand = Property.propertyMap.get("java-bin-path") + "javac.exe -encoding utf-8 -d " + destdir + " -sourcepath " + srcdir + " -classpath " + Property.propertyMap.get("class-path") + " " + file.getAbsolutePath();
					System.out.println(javaCommand);
					Process process = Runtime.getRuntime().exec("cmd /c " + javaCommand);
//					process.
					String msg = null;
					BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
					while ((msg = errorReader.readLine()) != null) {
//						msg = new String(msg.getBytes("utf-8"));
						System.err.println(msg);
					}
					
//					PrintWriter print = new PrintWriter(process.getOutputStream());
//					print.p
					BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
					while ((msg = reader.readLine()) != null) {
						System.out.println(msg);
					}
				}
			});
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}

}
