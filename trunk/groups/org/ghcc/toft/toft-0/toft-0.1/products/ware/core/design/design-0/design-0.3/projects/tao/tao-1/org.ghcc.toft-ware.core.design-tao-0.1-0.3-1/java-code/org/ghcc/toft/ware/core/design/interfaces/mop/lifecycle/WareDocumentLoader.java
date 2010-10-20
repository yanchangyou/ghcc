package org.ghcc.toft.ware.core.design.interfaces.mop.lifecycle;

/**
 * WareDocumentLoader
 * 
 * @author yanchangyou
 * @date 2010-10-20 23:53:17
 * @version 0.1
 * @since 0.3
 *
 */
import org.ghcc.toft.ware.core.design.interfaces.caas.WareDocument;
import org.ghcc.toft.ware.core.design.interfaces.eop.Entity;
import org.ghcc.toft.ware.core.design.interfaces.eop.lifecycle.Loader;
import org.ghcc.toft.ware.core.design.interfaces.mop.define.WareDocumentID;
import org.ghcc.toft.ware.core.design.interfaces.mop.define.WareDocumentPathInfo;
import org.ghcc.toft.ware.core.design.interfaces.mop.exception.WareDocumentLoadException;

public interface WareDocumentLoader extends WareDocument, Loader {

	/**
	 * 加载实体
	 * @param id
	 * @return
	 */
	public Entity load(WareDocumentID WareDocumentID) throws WareDocumentLoadException;
	
	/**
	 * 在指定路径信息下面加载实体
	 * @param pathInfo
	 * @param id
	 * @return
	 */
	public Entity load(WareDocumentPathInfo WareDocumentPathInfo, WareDocumentID WareDocumentID) throws WareDocumentLoadException;
	


}