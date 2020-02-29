/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author FRANKLIN
 */
@Named(value = "filmMBean")
@SessionScoped
public class FilmMBean implements Serializable {

    /**
     * Creates a new instance of FilmMBean
     */
    public FilmMBean() {
    }
    
}
