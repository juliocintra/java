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
public class TestaCodigo {
     public static void main(String[] args){
        
//        TAMBEM PODE SER FEITO DESSA FORMA
//        Codigo cod = new Codigo("teste", 123);
//        ProdutoGenerico <Codigo> produto = new ProdutoGenerico<>(cod, "teste", 20.8);

        ProdutoGenerico <Codigo> produto = new ProdutoGenerico<>(new Codigo("Financeiro", 1234), "teste", 20.8);
        
        System.out.println(produto.toString());
    }
}
