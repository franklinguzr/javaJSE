/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Rental;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author FRANKLIN
 */
@Local
public interface RentalFacadeLocal {

    void create(Rental rental);

    void edit(Rental rental);

    void remove(Rental rental);

    Rental find(Object id);

    List<Rental> findAll();

    List<Rental> findRange(int[] range);

    int count();
    
}
