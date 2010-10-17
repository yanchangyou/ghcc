package org.ghcc.toft.ware.core.impl.ether.abstracts.matrix;

import java.net.MalformedURLException;

import org.dom4j.Element;
import org.dom4j.Node;
import org.ghcc.toft.ware.core.impl.ether.bean.WareID;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherFunctionNode;

/**
 * EtherAbstractFunctionNode
 * 
 * @author yanchangyou
 * @date 2010-10-17 18:06:00
 * @version 0.1
 *
 */
public abstract class EtherAbstractFunctionNode implements EtherFunctionNode {
	
	protected Element dom4jElement;
	
	protected void setDom4jElement(Element dom4jElement) {
		this.dom4jElement = dom4jElement;
	}

	public Element getDom4jElement() {
		return dom4jElement;
	}

	public Node getEtherNode() {
		return getDom4jElement();
	}
	
	public String getFunctionClassName() throws MalformedURLException {
		WareID wareID = new WareID(dom4jElement.getNamespace());
		String packageName = wareID.getWarePackageName();
		String name = dom4jElement.getName();
		
		String className = packageName + "." + converToClassStyle(name);
		return className;
	}
	
	/**
	 * 把xml的节点命名转换为 java风格的<br>
	 * 如: speak-words  -> SpeakWords
	 * @param name
	 * @return
	 */
	public static String converToClassStyle(String name) {
		StringBuffer classNamePart = new StringBuffer();
		StringBuffer packageBuf = new StringBuffer();
		String[] parts = name.split("-");
		for (int i = 0; i < parts.length; i++) {
			if (parts.length > 1) {
				packageBuf.append(parts[i]);
				packageBuf.append(".");
			}
			classNamePart.append(parts[i].substring(0, 1).toUpperCase() + parts[i].substring(1));
		}
		return packageBuf.toString() + classNamePart;
	}
}