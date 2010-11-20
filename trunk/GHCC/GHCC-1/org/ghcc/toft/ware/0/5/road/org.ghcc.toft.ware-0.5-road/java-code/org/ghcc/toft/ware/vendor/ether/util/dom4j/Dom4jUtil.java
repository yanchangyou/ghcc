/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.util.dom4j;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

/**
 * Dom4jUtil
 * 
 * @author yanchangyou
 * @date 2010-11-20 下午11:19:09
 * @version 0.1-1-1
 *
 */

public class Dom4jUtil {
	
	public static Document readDocument(String path) throws DocumentException, IOException {
		
		SAXReader saxReader = new SAXReader();
		Document document = null;
		File wareDocumentFile = new File(path.replaceAll("^file://", ""));
		if (wareDocumentFile.exists()) {
			document = saxReader.read(wareDocumentFile);
		} else {
			URL realURL = new URL(path);
			document = saxReader.read(new InputStreamReader(realURL.openStream()));
		}
		
		return document;
	}
	
	public static void main(String[] args) throws Exception {
		String path = "L:/ghcc/ghcc/GHCC-1/svn/org/ghcc/demo/app/helloworld/0/5/0/1/walk/org.ghcc.demo.app.helloworld-0.5.0.1-walk/ware-code/org/ghcc/demo/app/helloworld/Helloworld.ware.xml";
		Document document = Dom4jUtil.readDocument(path);
		System.out.println(document.asXML());
	}

}
