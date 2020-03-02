/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import entities.Customer;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import session.CustomerFacadeLocal;

/**
 *
 * @author FRANKLIN
 */
@Named(value = "customerMBean")
@SessionScoped
public class CustomerMBean implements Serializable {

    @EJB
    private CustomerFacadeLocal customerFacade;

    /**
     * Creates a new instance of CustomerMBean
     */
    public CustomerMBean() {
    }
   
    private Customer film;
    private List<Customer> films;
    
    
    public List<Customer>getFilms(){
        if (((films)==(null))||(films.isEmpty())) refresh();
        return films;
    }

    private void refresh() {
      //  tousLesComptes = compteBancaireFacade.findAll();
     }
    public Customer getDetails(){
    return film;
    }
    
    public String showDetails(Customer film){
        this.film=film;
        return "FilmDetails";
    }
    
    public String update(){
        System.out.println("##UPDATE##");
        customerFacade.edit(film);
        film=customerFacade.find(film.getCustomerId());
        return "FilmList";
    }
    public String list(){
        System.out.println("##LIST##");
        return "FilmList";
    }
}
