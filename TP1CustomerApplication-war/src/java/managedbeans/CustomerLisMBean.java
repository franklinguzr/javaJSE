/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;


import entities.CustomerList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import session.CustomerListFacadeLocal;


/**
 *
 * @author wizz
 */
@Named("customerLisMBean")
@SessionScoped
public class CustomerLisMBean {

    @EJB
    private CustomerListFacadeLocal customerListFacadeLocal;
    private CustomerList customerList;
    private List<CustomerList> customerLists;
    public CustomerLisMBean() {
    }
    
    public List<CustomerList> getFilmLists() {
        if ((customerLists == null) || (customerLists.isEmpty())) {
            refresh();
        }
        return customerLists;
    }

    public void refresh() {
        customerLists = customerListFacadeLocal.findAll();
    }
}
