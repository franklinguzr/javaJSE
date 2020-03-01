/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Inventory;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author FRANKLIN
 */
@Local
public interface InventoryFacadeLocal {

    void create(Inventory inventory);

    void edit(Inventory inventory);

    void remove(Inventory inventory);

    Inventory find(Object id);

    List<Inventory> findAll();

    List<Inventory> findRange(int[] range);

    int count();
    
}
