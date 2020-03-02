/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import entities.Category;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import session.CategoryFacadeLocal;

/**
 *
 * @author FRANKLIN
 */
@Named(value = "categoryMBean")
@SessionScoped
public class CategoryMBean implements Serializable {

    /**
     * Creates a new instance of CategoryMBean
     */
    public CategoryMBean() {
    }
     @EJB
    private CategoryFacadeLocal categoryFacade;

    
     
    private Category film;
    private List<Category> films;
    
    
    public List<Category>getFilms(){
        if (((films)==(null))||(films.isEmpty())) refresh();
        return films;
    }

    private void refresh() {
        films = categoryFacade.findAll();
     }
    public Category getDetails(){
    return film;
    }
    
    public String showDetails(Category film){
        this.film=film;
        return "FilmDetails";
    }
    
    public String update(){
        System.out.println("##UPDATE##");
        categoryFacade.edit(film);
        film=categoryFacade.find(film.getCategoryId());
        return "FilmList";
    }
    public String list(){
        System.out.println("##LIST##");
        return "FilmList";
    }
}
