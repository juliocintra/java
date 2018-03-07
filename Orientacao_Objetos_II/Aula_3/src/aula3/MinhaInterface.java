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
public interface MinhaInterface {
    default void novoMetodo() {
        System.out.println("Novo método adicionado a Interface");
    }
    
    void existenteMetodo();
}
