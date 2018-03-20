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
public class TestaCodigo2 {
     public static void main(String[] args){
        
        Codigo2 <String, Integer> codigo = new Codigo2<>("Comercial", 123); 
        ProdutoGenerico <Codigo2> produto = new ProdutoGenerico<>(codigo, "teste", 20.8);
        
        ProdutoGenerico <Codigo2> produto2 = new ProdutoGenerico<>(new Codigo2<Integer, String>(12, "aa"), "ai pai", 20.8);
        
        System.out.println(produto.toString());
        System.out.println(produto2.toString());
    }
}
