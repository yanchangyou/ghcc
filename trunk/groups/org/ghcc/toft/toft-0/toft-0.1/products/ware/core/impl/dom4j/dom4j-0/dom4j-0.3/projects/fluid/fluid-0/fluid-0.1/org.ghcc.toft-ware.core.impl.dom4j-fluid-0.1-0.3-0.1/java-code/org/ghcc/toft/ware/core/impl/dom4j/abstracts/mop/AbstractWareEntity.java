package org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop;

/**
 * AbstractWareEntity
 * 
 * @author yanchangyou
 * @date 2010-10-21 23:31:20
 * @version 0.1
 * @since 0.3
 *
 */
import org.ghcc.toft.ware.core.design.interfaces.eop.define.Context;
import org.ghcc.toft.ware.core.design.interfaces.eop.exception.DriveException;
import org.ghcc.toft.ware.core.design.interfaces.eop.exception.EOPException;
import org.ghcc.toft.ware.core.design.interfaces.mop.WareEntity;
import org.ghcc.toft.ware.core.design.interfaces.mop.define.WareContext;

public abstract class AbstractWareEntity implements WareEntity {
	
	public void drive(Context context) throws DriveException {
		drive((WareContext)context);
	}

	public void driveWithDealException(Context context) throws EOPException {
		driveWithDealException((WareContext)context);
	}
}