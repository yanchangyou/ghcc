package org.ghcc.toft.ware.core;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


/**
 * WareDocument的简单封装
 * @author yanchangyou
 *
 */
public class WareDocument {

	private Document wareDocument;
	private String encoding;
	private String version;
	
	public WareDocument(WareParam wareParam) throws DocumentException, IOException {
		String wareXMLPath = wareParam.getWarePath();

		SAXReader saxReader = new SAXReader();
		File wareFile = new File(wareXMLPath);
		if (wareFile.exists()) {
			wareDocument = saxReader.read(wareFile);
		} else {
			URL url = new URL(wareXMLPath);
			wareDocument = saxReader.read(new InputStreamReader(url.openStream()));
		}
		encoding = wareDocument.getXMLEncoding();
		version = Common.getXMLVersion(wareDocument);
	}

	public Document getWareDocument() {
		return wareDocument;
	}

	public void setWareDocument(Document wareDocument) {
		this.wareDocument = wareDocument;
	}


	public Element getRootElement() {
		return this.wareDocument.getRootElement();
	}

	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
}
