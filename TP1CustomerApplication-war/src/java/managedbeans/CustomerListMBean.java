/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import entities.CustomerList;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import session.CustomerListFacadeLocal;

/**
 *
 * @author FRANKLIN
 */
@Named(value = "customerListMBean")
@SessionScoped
public class CustomerListMBean implements Serializable {

    @EJB
    private CustomerListFacadeLocal customerListFacade;

    /**
     * Creates a new instance of CustomerListMBean
     */
    public CustomerListMBean() {
    }
    
   
    private CustomerList film;
    private List<CustomerList> films;
    
    
    public List<CustomerList>getFilms(){
        if (((films)==(null))||(films.isEmpty())) refresh();
        return films;
    }

    private void refresh() {
      //  tousLesComptes = compteBancaireFacade.findAll();
     }
    public CustomerList getDetails(){
    return film;
    }
    
    public String showDetails(CustomerList film){
        this.film=film;
        return "FilmDetails";
    }
    
    public String update(){
        System.out.println("##UPDATE##");
        customerListFacade.edit(film);
        film=customerListFacade.find(film.getId());
        return "FilmList";
    }
    public String list(){
        System.out.println("##LIST##");
        return "FilmList";
    }
}
