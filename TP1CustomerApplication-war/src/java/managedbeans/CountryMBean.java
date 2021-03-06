/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import entities.Country;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import session.CountryFacadeLocal;

/**
 *
 * @author FRANKLIN
 */
@Named(value = "countryMBean")
@SessionScoped
public class CountryMBean implements Serializable {

    @EJB
    private CountryFacadeLocal countryFacade;

    /**
     * Creates a new instance of CountryMBean
     */
    public CountryMBean() {
    }
    private Country film;
    private List<Country> films;
    
    
    public List<Country>getFilms(){
        if (((films)==(null))||(films.isEmpty())) refresh();
        return films;
    }

    private void refresh() {
        films = countryFacade.findAll();
     }
    public Country getDetails(){
    return film;
    }
    
    public String showDetails(Country film){
        this.film=film;
        return "FilmDetails";
    }
    
    public String update(){
        System.out.println("##UPDATE##");
        countryFacade.edit(film);
        film=countryFacade.find(film.getCountryId());
        return "FilmList";
    }
    public String list(){
        System.out.println("##LIST##");
        return "FilmList";
    }
    
}
