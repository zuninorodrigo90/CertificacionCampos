/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.campos.dao;

import poo.campos.entity.Estado;

/**
 *
 * @author Rodrigo
 */
public interface EstadoCampoDao {

    public Estado buscarPorNombre(String nombre);

}
