/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.SalesByStore;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author FRANKLIN
 */
@Local
public interface SalesByStoreFacadeLocal {

    void create(SalesByStore salesByStore);

    void edit(SalesByStore salesByStore);

    void remove(SalesByStore salesByStore);

    SalesByStore find(Object id);

    List<SalesByStore> findAll();

    List<SalesByStore> findRange(int[] range);

    int count();
    
}
