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
		String warePath = "L:/ghcc/svn/groups/org/ghcc/demo/demo-0/demo-0.1/products/app/helloworld/helloworld-0/helloworld-0.1/projects/hellokitty/hellokitty-0/hellokitty-0.1/org.ghcc.demo-app.helloworld-hellokitty-0.1-0.1-0.1/ware-code/org/ghcc/demo/app/helloworld/Helloworld.ware.xml";

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
