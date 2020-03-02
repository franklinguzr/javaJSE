/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import entities.FilmText;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import session.FilmTextFacadeLocal;

/**
 *
 * @author FRANKLIN
 */
@Named(value = "filmTextManagedBean")
@SessionScoped
public class FilmTextManagedBean implements Serializable {

    @EJB
    private FilmTextFacadeLocal filmTextFacade;

    /**
     * Creates a new instance of FilmTextManagedBean
     */
    public FilmTextManagedBean() {
    }
     private FilmText film;
    private List<FilmText> films;
    
    
    public List<FilmText>getFilms(){
        if (((films)==(null))||(films.isEmpty())) refresh();
        return films;
    }

    private void refresh() {
        films = filmTextFacade.findAll();
     }
    public FilmText getDetails(){
    return film;
    }
    
    public String showDetails(FilmText film){
        this.film=film;
        return "FilmDetails";
    }
    
    public String update(){
        System.out.println("##UPDATE##");
        filmTextFacade.edit(film);
        film=filmTextFacade.find(film.getFilmId());
        return "FilmList";
    }
    public String list(){
        System.out.println("##LIST##");
        return "FilmList";
    }
}
