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
import java.util.*;
public class MapaProduto {
    
    public static void incluirProdutos(HashMap<String, Float> produtos, String nome, float preco) {
            if (produtos.containsKey(nome)) {
                System.out.println("Produto " + nome + " pertence ao mapa. Inclusao nao permitida");
            }
            else {
                produtos.put(nome, preco);
                System.out.println("Produto Incluido");
            }
    }
    
    public static void modificaPreco(HashMap<String, Float> produtos, String nome, float preco) {
        if (produtos.containsKey(nome)) {
            produtos.put(nome, preco);
            System.out.println("Produto alterado com sucesso");
        }
        else {
            System.out.println("Impossivel alterar. Chave nao encontrada");
        }
    }
    
    public static void mostrarPreco(HashMap<String, Float> produtos) {
//        System.out.println("Produto: " + produtos.keySet());
        Iterator <String> chaveNomes = produtos.keySet().iterator(); // cria um ponteiro pra percorrer o conjunto
        String chave;
        while(chaveNomes.hasNext()) {
            chave = chaveNomes.next();
            System.out.println("Valor para a chave: " + chave + ": " + produtos.get(chave));
        }
        
    }
    
    public static void excluiProduto(HashMap<String, Float> produtos, String nome) {
        if (produtos.containsKey(nome)) {
            produtos.remove(nome);
            System.out.println("Produto removido com sucesso");
        }
        else {
            System.out.println("Impossivel remover, produto não encontrado");
        }
    }
    
    public static void main(String[] args) {
        HashMap <String, Float> produtos = new HashMap<String, Float>();
        incluirProdutos(produtos, "cenoura", new Float(1.5));
        incluirProdutos(produtos, "pao", new Float(3.5));
        incluirProdutos(produtos, "macarrao", new Float(2.5));
        
        modificaPreco(produtos, "pao", new Float(2.2));;
       
        mostrarPreco(produtos);
       
        excluiProduto(produtos, "pao");
        
        mostrarPreco(produtos);
    }
}
