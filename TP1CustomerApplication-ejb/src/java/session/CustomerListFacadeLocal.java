/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.CustomerList;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author FRANKLIN
 */
@Local
public interface CustomerListFacadeLocal {

    void create(CustomerList customerList);

    void edit(CustomerList customerList);

    void remove(CustomerList customerList);

    CustomerList find(Object id);

    List<CustomerList> findAll();

    List<CustomerList> findRange(int[] range);

    int count();
    
}
