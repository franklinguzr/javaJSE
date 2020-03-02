/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import entities.Actor;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import session.ActorFacadeLocal;

/**
 *
 * @author FRANKLIN
 */
@Named(value = "actorMBean")
@SessionScoped
public class ActorMBean implements Serializable {

    /**
     * Creates a new instance of ActorMBean
     */
    public ActorMBean() {
    }
    @EJB
    private ActorFacadeLocal filmFacade;

    private Actor film;
    private List<Actor> films;
    
    
    public List<Actor>getFilms(){
        if (((films)==(null))||(films.isEmpty())) refresh();
        return films;
    }

    private void refresh() {
        films = filmFacade.findAll();
     }
    public Actor getDetails(){
    return film;
    }
    
    public String showDetails(Actor film){
        this.film=film;
        return "FilmDetails";
    }
    
    public String update(){
        System.out.println("##UPDATE##");
        filmFacade.edit(film);
        film=filmFacade.find(film.getActorId());
        return "FilmList";
    }
    public String list(){
        System.out.println("##LIST##");
        return "FilmList";
    }
}
