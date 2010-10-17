package org.ghcc.toft.ware.core.impl.ether.abstracts.matrix;

import java.net.URL;

import org.ghcc.toft.ware.core.impl.ether.boot.ActiveURLClassLoader;
import org.ghcc.toft.ware.core.impl.ether.interfaces.cop.EtherNode;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherFunctionEntity;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherFunctionNode;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherWareEntity;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherWareNode;

/**
 * EtherAbstractWareEntity
 * 
 * @author yanchangyou
 * @date 2010-10-17 16:49:53
 * @version 0.1
 *
 */
public abstract class EtherAbstractWareEntity implements EtherWareEntity {
	
	/**
	 * 驱动执行, 交给子类实现, 只做类型检查
	 */
	public void drive(EtherNode node) throws Exception {
		if(node instanceof EtherWareNode) {
			drive((EtherWareNode)node);
		} else {
			throw new Exception("类型不匹配, 必须传递[EtherWareNode]类型");
		}
	}
	
	public void dealException(Exception e) throws Exception {
		throw e;
	}
	/**
	 * 使用异常处理
	 */
	public void driveWithDealException(EtherNode node) throws Exception {
		try {
			this.drive(node);
		} catch (Exception e) {
			this.dealException(e);
		}
	}
	
	/**
	 * 加载功能
	 * @param functionNode
	 * @return
	 * @throws Exception
	 */
	public EtherFunctionEntity loadFunctionEntity(EtherFunctionNode functionNode) throws Exception {
		String functionClassName = functionNode.getFunctionClassName();
		ActiveURLClassLoader loader = (ActiveURLClassLoader) this.getClass().getClassLoader();
		URL[] urls = this.configClassPathURLs();
		if (urls != null) {
			for (int i = 0; i < urls.length; i++) {
				loader.addURL(urls[i]);
			}
		}
		
		EtherFunctionEntity functionEntity = (EtherFunctionEntity) loader.loadClass(functionClassName).newInstance();
		
		return functionEntity;
	}
	
}