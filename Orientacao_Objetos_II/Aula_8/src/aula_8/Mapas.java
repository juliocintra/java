/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_8;

/**
 *
 * @author 16320743
 */
import java.awt.BorderLayout;
import java.util.*;
public class Mapas {
    
    public static void main(String[] args) {
        // criar um mapa para o par inteiro e String
        Map <Integer, String> mnomes = new HashMap<Integer, String>();

        // o método put (Object, object) recebe a chave e o valor de uma associação
        mnomes.put(1, "Joao");
        mnomes.put(2, "Ana");
        mnomes.put(3, "Paulo");
        
        // o metodo size retorna a quantidade de pares chave-valor do mapa
        System.out.println("Quantidade de pares chave-valor no mapa: " + mnomes.size());
        
        // o metodo keyset retorna as chaves do mapa
        System.out.println("Chaves do mapa: " + mnomes.keySet());
        
        // o metodo values retorna os valores do mapa
        System.out.println("Valores do mapa: " + mnomes.values());
        
        // o metodo get retorna o valor associado a uma chave
        System.out.println("Valor do elemento associado a chave 1: " + mnomes.get(new Integer(1)));
        
        // o metodo contaisKey verifica se uma chave existe
        if (mnomes.containsKey(1))
            System.out.println("O mapa contem a chave 1");
        else 
            System.out.println("O mapa nao contem a chave 1");
        
        // o metodo contem values verifica se um valor existe 
        if (mnomes.containsValue("Joao"))
            System.out.println("O mapa contem o valor Joao");
        else 
            System.out.println("O mapa não contem o valor Joao");
        
        Iterator <Integer> chaveNomes = mnomes.keySet().iterator(); // cria um ponteiro pra percorrer o conjunto
        Integer chave;                                              // Iterator é uum ponteiro e é colocado no antes do inicio
                                                                    // | [1][2][3] -> | é o iterator
        while(chaveNomes.hasNext()) {
            chave = chaveNomes.next();
            System.out.println("Valor para a chave: " + chave + ": " + mnomes.get(chave));
        }
    }
}
