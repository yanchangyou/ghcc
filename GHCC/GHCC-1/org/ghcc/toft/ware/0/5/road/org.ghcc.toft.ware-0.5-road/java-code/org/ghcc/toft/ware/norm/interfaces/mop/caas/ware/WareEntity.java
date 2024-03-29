/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.norm.interfaces.mop.caas.ware;

import org.ghcc.toft.ware.norm.interfaces.cop.Entity;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.lifecycle.WareBuilder;
import org.ghcc.toft.ware.norm.interfaces.mop.caas.ware.lifecycle.WareDriver;


/**
 * WareEntity
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-16 21:20:59
 * @version 0.5
 *
 */


public interface WareEntity extends Entity, WareCOP, WareConcept, WareBuilder, WareDriver {
}
