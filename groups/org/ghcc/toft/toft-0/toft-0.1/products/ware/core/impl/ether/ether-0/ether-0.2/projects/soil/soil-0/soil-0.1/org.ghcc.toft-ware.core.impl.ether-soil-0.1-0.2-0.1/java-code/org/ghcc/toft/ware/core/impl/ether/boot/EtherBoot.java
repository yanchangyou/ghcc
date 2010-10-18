package org.ghcc.toft.ware.core.impl.ether.boot;

import java.io.File;
import java.io.InputStreamReader;
import java.net.URL;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.ghcc.toft.ware.core.impl.ether.defaults.matrix.EtherDefaultWareDocumentEntity;
import org.ghcc.toft.ware.core.impl.ether.defaults.matrix.EtherDefaultWareDocumentNode;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherWareDocumentEntity;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherWareDocumentNode;

public class EtherBoot {

	public static void main(String[] args) throws Exception {
		String warePath = null;

		if (args != null && args.length > 0) {
			warePath = args[0];
		} else {
			throw new Exception("please input the ware.xml file!");
		}
//		System.out.println(warePath);
		Document wareDocument = null;
		SAXReader saxReader = new SAXReader();
		File wareFile = new File(warePath);
		if (wareFile.exists()) {
			wareDocument = saxReader.read(wareFile);
		} else {
			URL url = new URL(warePath);
			wareDocument = saxReader.read(new InputStreamReader(url.openStream()));
		}
		EtherWareDocumentNode etherWareDocumentNode = new EtherDefaultWareDocumentNode(wareDocument);
		
		EtherWareDocumentEntity etherWareDocumentEntity = new EtherDefaultWareDocumentEntity();
		
		etherWareDocumentEntity.drive(etherWareDocumentNode);
	}
}
