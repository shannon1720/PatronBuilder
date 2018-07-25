/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.procesadora.alimento.extras;

import com.procesadora.alimento.Alimento;

/**
 *
 * @author Mario
 */
public class Trocitos extends DecoradorAlimento {
    Alimento alimento;
    
    public Trocitos(Alimento pAlimento){
        this.alimento = pAlimento;
    }
    
    @Override
    public String getNombre() {
        return this.alimento.getNombre() + ", en trocitos";
    }

    @Override
    public double costo() {
        return 1000 + this.alimento.costo();
    }
}
