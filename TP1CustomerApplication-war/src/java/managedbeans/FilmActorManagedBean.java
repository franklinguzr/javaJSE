/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import entities.FilmActor;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import session.FilmActorFacadeLocal;

/**
 *
 * @author FRANKLIN
 */
@Named(value = "filmActorManagedBean")
@SessionScoped
public class FilmActorManagedBean implements Serializable {

    @EJB
    private FilmActorFacadeLocal filmActorFacade;

    /**
     * Creates a new instance of FilmActorManagedBean
     */
    public FilmActorManagedBean() {
    }
    

   
    private FilmActor film;
    private List<FilmActor> films;
    
    
    public List<FilmActor>getFilms(){
        if (((films)==(null))||(films.isEmpty())) refresh();
        return films;
    }

    private void refresh() {
        films = filmActorFacade.findAll();
     }
    public FilmActor getDetails(){
    return film;
    }
    
    public String showDetails(FilmActor film){
        this.film=film;
        return "FilmDetails";
    }
    
    public String update(){
        System.out.println("##UPDATE##");
        filmActorFacade.edit(film);
        film=filmActorFacade.find(film.getFilmActorPK());
        return "FilmList";
    }
    public String list(){
        System.out.println("##LIST##");
        return "FilmList";
    }
}
