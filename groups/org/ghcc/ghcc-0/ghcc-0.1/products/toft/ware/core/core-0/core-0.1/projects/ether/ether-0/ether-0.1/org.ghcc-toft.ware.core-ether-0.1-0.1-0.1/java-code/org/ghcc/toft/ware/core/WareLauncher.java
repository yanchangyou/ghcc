package org.ghcc.toft.ware.core;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class WareLauncher {
	
	public static void main(String[] args) throws Exception {
		new WareLauncher().launch(args);
	}
	
	public void launch(String[] args) throws Exception {
		if (args == null || args.length == 0) {
			throw new NullPointerException("param can't be null");
		}
		
		WareParam wareParam = new WareParam(args[0]);
		
		WareDocument wareDocument = new WareDocument(wareParam);
		URI uri = new URI(wareDocument.getRootElement().getNamespaceURI());
		WareEntity ware = new WareEntity(uri);
		
		Map<String,Object> context = new HashMap<String,Object>();
//		ClassLoader currentClassLoader = ware.getClassLoader();
		
//		context.put("this-class-loader", currentClassLoader);
		context.put("ware-uri", ware.getUri());
		
//		Thread.currentThread().setContextClassLoader(currentClassLoader);
		ware.getWare().execute(wareDocument.getRootElement().asXML(), context);
	}
}