package org.ghcc.toft.ware.core.impl.ether.defaults.matrix;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.dom4j.Namespace;
import org.ghcc.toft.ware.core.impl.ether.abstracts.matrix.EtherAbstractWareEntity;
import org.ghcc.toft.ware.core.impl.ether.bean.WareID;
import org.ghcc.toft.ware.core.impl.ether.boot.ActiveURLClassLoader;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherWareEntity;
import org.ghcc.toft.ware.core.impl.ether.interfaces.matrix.EtherWareNode;

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

	public static EtherWareEntity getSingleEthertWareEntity() {
		if (singleEtherWareEntity == null) {
			singleEtherWareEntity = new EtherDefaultWareEntity();
		}
		return singleEtherWareEntity;
	}

	public void dealException(Exception e) throws Exception {
		throw e;
	}

	public void drive(EtherWareNode node) throws Exception {
		EtherWareEntity wareEntity = load(node.getDom4jNamespace());
		wareEntity.drive(node);
	}

	private Map<Namespace, EtherWareEntity> wareEntityMap;
	{
		wareEntityMap = new HashMap<Namespace, EtherWareEntity>();
	}

	public EtherWareEntity load(Namespace dom4jNamespace) throws MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException {

		EtherWareEntity wareEntity = wareEntityMap.get(dom4jNamespace);

		if (wareEntity == null) {

			WareID wareID = new WareID(dom4jNamespace);
			ActiveURLClassLoader activeURLClassLoader = new ActiveURLClassLoader(new URL[]{wareID.getWarePathURL()});
			wareEntity = (EtherWareEntity) activeURLClassLoader.loadClass(wareID.getWareClassName()).newInstance();
//			 wareEntity = new EtherDefaultWareEntity(dom4jNamespace);
			
		}

		return wareEntity;
	}
}