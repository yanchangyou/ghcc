package org.ghcc.toft.ware.core.impl.ether.interfaces.matrix;

/**
 * EtherWareEntity
 * 
 * @author yanchangyou
 * @date 2010-10-17 16:49:53
 * @version 0.1
 *
 */
import org.ghcc.toft.ware.core.design.matrix.WareEntity;
import org.ghcc.toft.ware.core.impl.ether.interfaces.caas.EtherWare;
import org.ghcc.toft.ware.core.impl.ether.interfaces.cop.EtherEntity;

public interface EtherWareEntity extends WareEntity, EtherWare, EtherEntity, EtherWareConcept, EtherWareDriver {

}