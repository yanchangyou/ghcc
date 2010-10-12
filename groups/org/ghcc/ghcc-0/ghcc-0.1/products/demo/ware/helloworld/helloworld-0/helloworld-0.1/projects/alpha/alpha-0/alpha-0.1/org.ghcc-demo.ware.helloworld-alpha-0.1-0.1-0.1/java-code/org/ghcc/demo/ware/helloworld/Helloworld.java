package org.ghcc.demo.ware.helloworld;

import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.ghcc.toft.ware.core.Common;
import org.ghcc.toft.ware.core.Driver;


public class Helloworld implements Driver {

	public void drive(Map<String, Object> context) throws Exception {
		System.out.println("hello world!");
		Common.printClassLoaderInfo(this);
		System.out.println(StringUtils.capitalize("abc"));

	}

	public void dealWareException(Exception WareException) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
}
