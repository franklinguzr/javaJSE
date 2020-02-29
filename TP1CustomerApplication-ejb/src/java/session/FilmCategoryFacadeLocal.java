/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.FilmCategory;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author FRANKLIN
 */
@Local
public interface FilmCategoryFacadeLocal {

    void create(FilmCategory filmCategory);

    void edit(FilmCategory filmCategory);

    void remove(FilmCategory filmCategory);

    FilmCategory find(Object id);

    List<FilmCategory> findAll();

    List<FilmCategory> findRange(int[] range);

    int count();
    
}
