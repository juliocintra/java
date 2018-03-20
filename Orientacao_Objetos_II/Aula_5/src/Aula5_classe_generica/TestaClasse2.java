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
public class TestaClasse2 {
    
    public static void main(String[] args){
        
        ProdutoGenerico2<String, String> produto = new ProdutoGenerico2<>("1232456", "FINTI", 210);
        
        System.out.println(produto.toString());
        
        
    }
    
    
}
