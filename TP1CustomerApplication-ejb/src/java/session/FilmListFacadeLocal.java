/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.FilmList;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author FRANKLIN
 */
@Local
public interface FilmListFacadeLocal {

    void create(FilmList filmList);

    void edit(FilmList filmList);

    void remove(FilmList filmList);

    FilmList find(Object id);

    List<FilmList> findAll();

    List<FilmList> findRange(int[] range);

    int count();
    
}
