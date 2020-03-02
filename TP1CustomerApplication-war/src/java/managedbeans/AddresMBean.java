/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import entities.Address;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import session.AddressFacadeLocal;

/**
 *
 * @author FRANKLIN
 */
@Named(value = "addresMBean")
@Dependent
public class AddresMBean {

    @EJB
    private AddressFacadeLocal addressFacade;

    /**
     * Creates a new instance of AddresMBean
     */
    public AddresMBean() {
    }
    private Address film;
    private List<Address> films;
    
    
    public List<Address>getFilms(){
        if (((films)==(null))||(films.isEmpty())) refresh();
        return films;
    }

    private void refresh() {
      //  tousLesComptes = compteBancaireFacade.findAll();
     }
    public Address getDetails(){
    return film;
    }
    
    public String showDetails(Address film){
        this.film=film;
        return "FilmDetails";
    }
    
    public String update(){
        System.out.println("##UPDATE##");
        addressFacade.edit(film);
        film=addressFacade.find(film.getAddressId());
        return "FilmList";
    }
    public String list(){
        System.out.println("##LIST##");
        return "FilmList";
    }
}
