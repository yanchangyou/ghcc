package org.ghcc.demo.ware.helloworld;

import java.util.Map;

import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.ghcc.toft.ware.core.Driver;
import org.ghcc.toft.ware.core.KeywordsUtil;
import org.ghcc.toft.ware.core.Ware;


public class HelloworldWare implements Ware {
	{
		System.out.println("load [" + this.getClass() + "] ok!");
	}
	public static void main(String[] args) {
		System.out.println("begin helloworld!");
	}
	public void execute(String xmlElement, Map<String, Object> context)
			throws Exception {
		
		Element element = DocumentHelper.parseText(xmlElement).getRootElement(); 
		String className = KeywordsUtil.getKeyWordsClass(this.getClass(), element);
		System.out.println(className);
		Driver driver = (Driver) Class.forName(className).newInstance();
		driver.drive(context);
	}
	public void dealExecuteException(Exception wareException) throws Exception {
		throw wareException;
	}
	public void executeChildElement() throws Exception {
	}
}