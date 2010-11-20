/*
 * CopyCenter 2010 GHCC.ORG, all rights freed.
 */

package org.ghcc.toft.ware.vendor.ether.design.interfaces.cop;

import org.ghcc.toft.ware.norm.interfaces.cop.Entity;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.lifecycle.EtherBuilder;
import org.ghcc.toft.ware.vendor.ether.design.interfaces.cop.lifecycle.EtherDriver;



/**
 * EtherEntity
 * 
 * @author code machine
 * @author yanchangyou
 * @date 2010-11-20 00:17:21
 * @version 0.5
 *
 */


public interface EtherEntity extends Entity, EtherCOP, EtherConcept, EtherBuilder, EtherDriver {
}
