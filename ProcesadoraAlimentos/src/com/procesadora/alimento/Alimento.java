/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.procesadora.alimento;

/**
 *
 * @author Mario
 */
public abstract class Alimento {
    String nombre = "desconocido";
    
    public String getNombre(){
        return nombre;
    }
    
    public abstract double costo();
    
}
