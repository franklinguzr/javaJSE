/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.FilmText;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author FRANKLIN
 */
@Local
public interface FilmTextFacadeLocal {

    void create(FilmText filmText);

    void edit(FilmText filmText);

    void remove(FilmText filmText);

    FilmText find(Object id);

    List<FilmText> findAll();

    List<FilmText> findRange(int[] range);

    int count();
    
}
