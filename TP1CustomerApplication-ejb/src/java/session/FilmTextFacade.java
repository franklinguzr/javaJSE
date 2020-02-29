/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entities.FilmText;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author FRANKLIN
 */
@Stateless
public class FilmTextFacade extends AbstractFacade<FilmText> implements FilmTextFacadeLocal {

    @PersistenceContext(unitName = "TP1CustomerApplication-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FilmTextFacade() {
        super(FilmText.class);
    }
    
}
