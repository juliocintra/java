/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

/**
 *
 * @author 16320743
 */
public class ExemploDefault implements MinhaInterface{
    //IMPLEMENTAR O METODO ABSTRATO
    public void existenteMetodo() {
        System.out.println("Método implementado");
    }
    
    public static void main(String args[]) {
        ExemploDefault obj = new ExemploDefault();
        //chamando o metodo default;
        obj.novoMetodo();
        //chamando o metodo abstrato da interface
        obj.existenteMetodo();
    }
}
