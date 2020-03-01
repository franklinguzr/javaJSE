/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import entities.FilmList;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import session.FilmListFacadeLocal;

/**
 *
 * @author wizz
 */
@Named(value = "filmListMBean")
@SessionScoped
public class FilmListMBean implements Serializable {

    @EJB
    private FilmListFacadeLocal filmListFacadeLocal;
    private FilmList filmList;
    private List<FilmList> filmLists;

    /**
     * Creates a new instance of FilmListMBean
     */
    public FilmListMBean() {
    }

    public List<FilmList> getFilmLists() {
        if ((filmLists == null) || (filmLists.isEmpty())) {
            refresh();
        }
        return filmLists;
    }

    public void refresh() {
        filmLists = filmListFacadeLocal.findAll();
    }
}
