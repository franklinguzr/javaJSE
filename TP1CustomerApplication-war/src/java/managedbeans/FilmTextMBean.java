/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author wizz
 */ 
@Named(value = "filmTextMBean")
@SessionScoped
public class FilmTextMBean implements Serializable{

    /**
     * Creates a new instance of FilmTextMBean
     */
    public FilmTextMBean() {
    }
    
}
