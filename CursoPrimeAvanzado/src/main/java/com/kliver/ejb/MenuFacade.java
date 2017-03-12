/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kliver.ejb;

import com.kliver.model.Menu;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author cocotin
 */
@Stateless
public class MenuFacade extends AbstractFacade<Menu> implements MenuFacadeLocal {

    @PersistenceContext(unitName = "primePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MenuFacade() {
        super(Menu.class);
    }
    
}
