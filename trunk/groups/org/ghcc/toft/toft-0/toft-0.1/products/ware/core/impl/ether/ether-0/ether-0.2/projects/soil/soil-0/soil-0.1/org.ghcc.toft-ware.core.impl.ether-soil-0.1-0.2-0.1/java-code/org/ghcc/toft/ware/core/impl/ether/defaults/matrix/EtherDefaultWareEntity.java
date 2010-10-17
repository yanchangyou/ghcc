package org.ghcc.toft.ware.core.impl.ether.defaults.matrix;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.dom4j.Namespace;
import org.ghcc.toft.ware.core.impl.ether.abstracts.matrix.EtherAbstractWareEntity;
import org.ghcc.toft.ware.core.impl.ether.bean.WareID;
import org.ghcc.toft.ware.core.impl.ether.boot.ActiveURLClassLoader;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherFunctionEntity;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherFunctionNode;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherWareEntity;

/**
 * EtherDefaultWareEntity
 * 
 * @author yanchangyou
 * @date 2010-10-17 16:49:53
 * @version 0.1
 * 
 */
public class EtherDefaultWareEntity extends EtherAbstractWareEntity {

	protected static EtherWareEntity singleEtherWareEntity;
	static {
		singleEtherWareEntity = new EtherDefaultWareEntity();
	}
	
	private EtherDefaultWareEntity() {
		
	}

	public static EtherWareEntity getSingleEthertWareEntity() {
		return singleEtherWareEntity;
	}

	public void dealException(Exception e) throws Exception {
		throw e;
	}

	public void drive(EtherFunctionNode functionNode) throws Exception {
		EtherWareEntity wareEntity = loadWareEntity(functionNode.getDom4jElement().getNamespace());
		wareEntity.drive(functionNode);
	}

	private Map<Namespace, EtherWareEntity> wareEntityMap;
	{
		wareEntityMap = new HashMap<Namespace, EtherWareEntity>();
	}

	/**
	 * 加载 wareEntity
	 * @param dom4jNamespace
	 * @return
	 * @throws MalformedURLException
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public EtherWareEntity loadWareEntity(Namespace dom4jNamespace) throws MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException {

		EtherWareEntity wareEntity = wareEntityMap.get(dom4jNamespace);

		if (wareEntity == null) {
			WareID wareID = new WareID(dom4jNamespace);
			ActiveURLClassLoader activeURLClassLoader = new ActiveURLClassLoader(wareID);
			wareEntity = (EtherWareEntity) activeURLClassLoader.loadClass(wareID.getWareClassName()).newInstance();
			wareEntityMap.put(dom4jNamespace, wareEntity); //buffer it
		}

		return wareEntity;
	}

	/**
	 * 加载功能, 此功能是核心的, 不予实现
	 */
	public EtherFunctionEntity loadFunctionEntity(EtherFunctionNode functionNode) {
		throw new RuntimeException("核心的类, 不能调用");
	}

	public URL[] configClassPathURLs() throws MalformedURLException {
		return null;
	}
}