package org.ghcc.toft.ware.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.net.URLClassLoader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class Common {

	public static String getXMLVersion(Document document) {
		return getXMLAttribute(document, "version");
	}
	
	public static String getXMLAttribute(Document document, String attributeName) {
		String ATTRIBUTE_NAME_PATTERN = "[a-zA-Z_][-\\w]*";
		if (attributeName == null || !attributeName.matches(ATTRIBUTE_NAME_PATTERN)) {
			throw new IllegalArgumentException("attributeName must match[" + ATTRIBUTE_NAME_PATTERN +"], but \"" + attributeName + "\" is not");
		}
		String value = null;
		String patternString = "<\\?(xml|XML).*?\\s" + attributeName + "\\s*=\\s*[\"'](.*?)[\"']\\s*.*?\\?>.*";
		
		Pattern pattern = Pattern.compile(patternString);
		String xmlFirstLine = getFirstLine(document.asXML());
		Matcher matcher = pattern.matcher(xmlFirstLine);
		if (matcher.find()) {
			value = matcher.group(2);
		}
		return value;
	}
	
	public static String getFirstLine(String text) {
		String firstLine = null;
		try {
			BufferedReader  buf = new BufferedReader(new StringReader (text));
			firstLine = buf.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			//can't occure
		}
		return firstLine;
	}
	
	public static void printClassLoaderInfo(Object obj) {
		System.out.println("========" + obj + "==============");
		ClassLoader classLoader = obj.getClass().getClassLoader();
		if (classLoader instanceof URLClassLoader) {
			System.out.println("url : " + Arrays.asList(((URLClassLoader)classLoader).getURLs()).toString().replaceAll(", ", "\n"));
		}
		System.out.println(" loader : " + obj.getClass().getClassLoader());
		System.out.println(" parent : " + obj.getClass().getClassLoader().getParent());
		System.out.println(" thread : " + Thread.currentThread().getContextClassLoader());
	}
	
	public static void main(String[] args) throws DocumentException {
		
//		String attributeName = "version";
//		String patternString = "^.*<\\?(xml|XML).*?\\s" + attributeName  + "\\s*=\\s*[\"'](.*?)[\"']\\s*.*?\\?>.*$";
//		
//		String text = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
//		System.out.println(Pattern.compile(patternString).matcher(text));
//		if (1 == 1) {
//			return;
//		}
		String path = "E:/projects/dev/ware/GHCC-1.5/helloword-ware/ware-code/helloworld.ware.xml";
		Document wareDoc = null;
		SAXReader saxReader = new SAXReader();
		File wareFile = new File(path);
		wareDoc = saxReader.read(wareFile);
		
		String version = getXMLVersion(wareDoc);
		System.out.println("version=" + version);
	}
	
	
}
