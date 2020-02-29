/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.ActorInfo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author FRANKLIN
 */
@Local
public interface ActorInfoFacadeLocal {

    void create(ActorInfo actorInfo);

    void edit(ActorInfo actorInfo);

    void remove(ActorInfo actorInfo);

    ActorInfo find(Object id);

    List<ActorInfo> findAll();

    List<ActorInfo> findRange(int[] range);

    int count();
    
}
