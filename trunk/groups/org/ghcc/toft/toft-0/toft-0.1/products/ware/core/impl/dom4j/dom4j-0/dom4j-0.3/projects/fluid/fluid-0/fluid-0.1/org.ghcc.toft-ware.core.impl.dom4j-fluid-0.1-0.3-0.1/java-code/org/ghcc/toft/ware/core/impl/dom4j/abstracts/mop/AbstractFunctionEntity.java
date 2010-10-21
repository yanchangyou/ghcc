package org.ghcc.toft.ware.core.impl.dom4j.abstracts.mop;

/**
 * AbstractFunctionEntity
 * 
 * @author yanchangyou
 * @date 2010-10-21 23:31:20
 * @version 0.1
 * @since 0.3
 *
 */
import org.ghcc.toft.ware.core.design.interfaces.eop.define.Context;
import org.ghcc.toft.ware.core.design.interfaces.eop.define.Resource;
import org.ghcc.toft.ware.core.design.interfaces.eop.exception.BuildException;
import org.ghcc.toft.ware.core.design.interfaces.eop.exception.DriveException;
import org.ghcc.toft.ware.core.design.interfaces.eop.exception.EOPException;
import org.ghcc.toft.ware.core.design.interfaces.mop.FunctionEntity;
import org.ghcc.toft.ware.core.design.interfaces.mop.define.FunctionContext;
import org.ghcc.toft.ware.core.design.interfaces.mop.define.FunctionResource;

public abstract class AbstractFunctionEntity implements FunctionEntity {

	public void build(Resource resource) throws BuildException {
		build((FunctionResource)resource);
	}

	public void drive(Context context) throws DriveException {
		drive((FunctionContext)context);
	}

	public void driveWithDealException(Context context) throws EOPException {
		driveWithDealException((FunctionContext)context);
	}

}