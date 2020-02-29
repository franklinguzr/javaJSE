/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.NicerButSlowerFilmList;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author FRANKLIN
 */
@Local
public interface NicerButSlowerFilmListFacadeLocal {

    void create(NicerButSlowerFilmList nicerButSlowerFilmList);

    void edit(NicerButSlowerFilmList nicerButSlowerFilmList);

    void remove(NicerButSlowerFilmList nicerButSlowerFilmList);

    NicerButSlowerFilmList find(Object id);

    List<NicerButSlowerFilmList> findAll();

    List<NicerButSlowerFilmList> findRange(int[] range);

    int count();
    
}
