/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import entities.City;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import session.CityFacadeLocal;

/**
 *
 * @author FRANKLIN
 */
@Named(value = "cityMBean")
@SessionScoped
public class CityMBean implements Serializable {

    /**
     * Creates a new instance of CityMBean
     */
    public CityMBean() {
    }
    @EJB
    private CityFacadeLocal cityFacade;

   
    private City film;
    private List<City> films;
    
    
    public List<City>getFilms(){
        if (((films)==(null))||(films.isEmpty())) refresh();
        return films;
    }

    private void refresh() {
        films = cityFacade.findAll();
     }
    public City getDetails(){
    return film;
    }
    
    public String showDetails(City film){
        this.film=film;
        return "FilmDetails";
    }
    
    public String update(){
        System.out.println("##UPDATE##");
        cityFacade.edit(film);
        film=cityFacade.find(film.getCityId());
        return "FilmList";
    }
    public String list(){
        System.out.println("##LIST##");
        return "FilmList";
    }
}
