package org.ghcc.toft.ware.core.impl.ether.boot;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.ghcc.toft.ware.core.impl.ether.defaults.matrix.EtherDefaultWareDocumentEntity;
import org.ghcc.toft.ware.core.impl.ether.defaults.matrix.EtherDefaultWareDocumentNode;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherWareDocumentEntity;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherWareDocumentNode;

public class EtherBoot {

	public static void main(String[] args) throws Exception {
		String warePath = "L:/ghcc/svn/groups/org/ghcc/demo/demo-0/demo-0.1/products/app/helloworld/helloworld-0/helloworld-0.1/projects/hellokitty/hellokitty-0/hellokitty-0.1/org.ghcc.demo-app.helloworld-hellokitty-0.1-0.1-0.1/ware-code/org/ghcc/demo/app/helloworld/Helloworld.ware.xml";

		String xml = readXML(warePath);
//		System.out.println(xml);
		
		EtherWareDocumentNode etherWareDocumentNode = new EtherDefaultWareDocumentNode(xml);
		
		EtherWareDocumentEntity etherWareDocumentEntity = new EtherDefaultWareDocumentEntity();
		etherWareDocumentEntity.drive(etherWareDocumentNode);
	}

	public static String readXML(String path) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(
				new File(path)));
		StringBuffer buf = new StringBuffer();
		String str = null;
		try {
			while ((str = reader.readLine()) != null) {
				buf.append(str);
				buf.append("\r\n");
			}
		} finally {
			reader.close();
		}
		return buf.toString();
	}
}
