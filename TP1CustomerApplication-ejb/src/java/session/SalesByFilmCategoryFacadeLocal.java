/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.SalesByFilmCategory;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author FRANKLIN
 */
@Local
public interface SalesByFilmCategoryFacadeLocal {

    void create(SalesByFilmCategory salesByFilmCategory);

    void edit(SalesByFilmCategory salesByFilmCategory);

    void remove(SalesByFilmCategory salesByFilmCategory);

    SalesByFilmCategory find(Object id);

    List<SalesByFilmCategory> findAll();

    List<SalesByFilmCategory> findRange(int[] range);

    int count();
    
}
