/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.CustomerList;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author FRANKLIN
 */
@Stateless
public class CustomerListFacade extends AbstractFacade<CustomerList> implements CustomerListFacadeLocal {

    @PersistenceContext(unitName = "TP1CustomerApplication-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CustomerListFacade() {
        super(CustomerList.class);
    }
    
}
