/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Statica;

/**
 *
 * @author Julio
 */
public class TesteCalculadora {
    
    public static void main(String[] args) {
        
        
        Calculadora c = new Calculadora();
        
        Calculadora c2;
        
        System.out.println(c.soma(1, 3));
        System.out.println(Calculadora.soma(1, 5));
    }
}
