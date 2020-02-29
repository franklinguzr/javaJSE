/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.Actor;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author FRANKLIN
 */
@Local
public interface ActorFacadeLocal {

    void create(Actor actor);

    void edit(Actor actor);

    void remove(Actor actor);

    Actor find(Object id);

    List<Actor> findAll();

    List<Actor> findRange(int[] range);

    int count();
    
}
