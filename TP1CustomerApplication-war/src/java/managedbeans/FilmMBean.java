/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import entities.Film;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import session.FilmFacadeLocal;

/**
 *
 * @author FRANKLIN
 */
@Named(value = "filmMBean")
@SessionScoped
public class FilmMBean implements Serializable {

    @EJB
    private FilmFacadeLocal filmFacade;

    private Film film;
    private List<Film> films;
    /**
     * Creates a new instance of FilmMBean
     */
    public FilmMBean() {  
    }
    
    public List<Film>getFilms(){
        if (((films)==(null))||(films.isEmpty())) refresh();
        return films;
    }

    private void refresh() {
        films = filmFacade.findAll();
     }
    public Film getDetails(){
    return film;
    }
    
    public String showDetails(Film film){
        this.film=film;
        return "FilmDetails";
    }
    
    public String update(){
        System.out.println("##UPDATE##");
        filmFacade.edit(film);
        film=filmFacade.find(film.getFilmId());
        return "FilmList";
    }
    public String list(){
        System.out.println("##LIST##");
        return "FilmList";
    }
}
