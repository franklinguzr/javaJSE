/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.FilmActor;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author FRANKLIN
 */
@Local
public interface FilmActorFacadeLocal {

    void create(FilmActor filmActor);

    void edit(FilmActor filmActor);

    void remove(FilmActor filmActor);

    FilmActor find(Object id);

    List<FilmActor> findAll();

    List<FilmActor> findRange(int[] range);

    int count();
    
}
