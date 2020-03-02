/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import entities.FilmCategory;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import session.FilmCategoryFacadeLocal;

/**
 *
 * @author FRANKLIN
 */
@Named(value = "filmCategoryManagedBean")
@SessionScoped
public class FilmCategoryManagedBean implements Serializable {

    @EJB
    private FilmCategoryFacadeLocal filmCategoryFacade;

    /**
     * Creates a new instance of FilmCategoryManagedBean
     */
    public FilmCategoryManagedBean() {
    }
     private FilmCategory film;
    private List<FilmCategory> films;
    
    
    public List<FilmCategory>getFilms(){
        if (((films)==(null))||(films.isEmpty())) refresh();
        return films;
    }

    private void refresh() {
        films = filmCategoryFacade.findAll();
     }
    public FilmCategory getDetails(){
    return film;
    }
    
    public String showDetails(FilmCategory film){
        this.film=film;
        return "FilmDetails";
    }
    
    public String update(){
        System.out.println("##UPDATE##");
        filmCategoryFacade.edit(film);
        film=filmCategoryFacade.find(film.getFilmCategoryPK());
        return "FilmList";
    }
    public String list(){
        System.out.println("##LIST##");
        return "FilmList";
    }
}
