/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesadoraalimentos;

import com.procesadora.alimento.Yuca;
import com.procesadora.alimento.extras.Hervida;
import com.procesadora.alimento.extras.Trocitos;

/**
 *
 * @author Mario
 */
public class ProcesadoraAlimentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Yuca yuca = new Yuca();
        Yuca yuca2 = new Yuca();
        
        Hervida yucaHervida = new Hervida(yuca);
        Trocitos yucaTrocitos = new Trocitos(yucaHervida);
        System.out.println("Tenemos una " + yuca.getNombre() + " que vale " + yuca.costo());
        System.out.println("Tenemos una " + yucaHervida.getNombre() + " que vale " + yucaHervida.costo());
        System.out.println("Tenemos una " + yucaTrocitos.getNombre() + " que vale " + yucaTrocitos.costo());
    }
    
}
