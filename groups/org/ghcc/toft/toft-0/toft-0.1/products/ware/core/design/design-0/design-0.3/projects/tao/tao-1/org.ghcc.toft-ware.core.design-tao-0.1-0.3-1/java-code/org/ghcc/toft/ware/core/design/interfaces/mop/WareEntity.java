package org.ghcc.toft.ware.core.design.interfaces.mop;

/**
 * WareEntity
 * 
 * @author yanchangyou
 * @date 2010-10-20 23:53:17
 * @version 0.1
 * @since 0.3
 *
 */
import org.ghcc.toft.ware.core.design.interfaces.caas.Ware;
import org.ghcc.toft.ware.core.design.interfaces.eop.Entity;
import org.ghcc.toft.ware.core.design.interfaces.mop.lifecycle.WareBuilder;
import org.ghcc.toft.ware.core.design.interfaces.mop.lifecycle.WareDriver;

public interface WareEntity extends Ware, Entity, WareConcept, WareBuilder, WareDriver {

}