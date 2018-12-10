/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.campos.controller;

import org.hibernate.SessionFactory;
import poo.campos.dao.EstadoCampoDao;
import poo.campos.dao.EstadoCampoDaoHibernateImpl;
import poo.campos.entity.Estado;
import poo.campos.ui.RegistrarCampo;

/**
 *
 * @author Rodrigo
 */
public class GestorRegistrarCampo {

    private final SessionFactory sessionFactory;

    private final EstadoCampoDao estadoCampoDao;

    /**
     * Constructor por defecto.
     *
     * @param sessionFactory
     */
    public GestorRegistrarCampo(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        this.estadoCampoDao = new EstadoCampoDaoHibernateImpl(sessionFactory);
    } 
    
      public void run () {
        new RegistrarCampo(this).setVisible(true);
    }
    
    public void buscarEstado() {
        Estado creado = estadoCampoDao.buscarPorNombre("Creado");
        System.out.println("Creado");
    }

}
