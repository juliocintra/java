/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula5_classe_generica;

/**
 *
 * @author 16320743
 */
public class TestaClasse {
    public static void main(String args[]) {
        ProdutoGenerico <String> produto = new ProdutoGenerico<>("123321", "Ai sim", 250);
        ProdutoGenerico <Integer> produto2 = new ProdutoGenerico<>(121, "Ai sim", 250);
        ProdutoGenerico <Double> produto3 = new ProdutoGenerico<>(122.0, "Ai sim", 250);
        
        System.out.println(produto.toString());
        System.out.println(produto2.toString());
        System.out.println(produto3.toString());
    }
}
