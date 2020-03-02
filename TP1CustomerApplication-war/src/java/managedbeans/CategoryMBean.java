/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import entities.Category;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import session.CategoryFacadeLocal;

/**
 *
 * @author FRANKLIN
 */
@Named(value = "categoryMBean")
@Dependent
public class CategoryMBean {

    @EJB
    private CategoryFacadeLocal categoryFacade;

    /**
     * Creates a new instance of CategoryMBean
     */
    public CategoryMBean() {
    }
    
    
    
    private Category film;
    private List<Category> films;
    
    
    public List<Category>getFilms(){
        if (((films)==(null))||(films.isEmpty())) refresh();
        return films;
    }

    private void refresh() {
      //  tousLesComptes = compteBancaireFacade.findAll();
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
