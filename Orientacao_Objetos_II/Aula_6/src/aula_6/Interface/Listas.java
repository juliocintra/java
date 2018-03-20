/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_6.Interface;

/**
 *
 * @author 16320743
 */
import java.util.*;

public class Listas {
    public static void metodoAdd() {
        // o método add adicona um elemento na lista;
        // static é variavel de classe e sem statica é variavel de objeto;
        
        List <String> nomes = new ArrayList<>();
        nomes.add("Julio");
        nomes.add("Murilo");
        nomes.add("Punk");
        nomes.add("Gustavo");
        System.out.println("Listas de nomes: " + nomes);      
    }
    
    public static void metodoIsEmpty() {
        // o método isEmpty verifica se a lista está vazia;
        List <String> letras = new ArrayList<>();
        letras.add("A");
        letras.add("B");
        letras.add("C");
        letras.add("D");
        letras.add("E");
        
        if (letras.isEmpty())
            System.out.println("Lista Vaiza");
        else
            System.out.println("Lista não vazia. Valores " + letras);
    }
    
    public static void percorreLista() {
        
        //metodo size - retorna a quantidade de elementos de lista;
        //metodo get() - retorna o elemento na posição i. COmeça do zero;
        
        List <String> frutas = new ArrayList();
        frutas.add("maça");
        frutas.add("pera");
        frutas.add("abacaxi");
        frutas.add("uva");
        frutas.add("laranja");
        
        for (int i = 0; i < frutas.size(); i++) {
            System.out.println("Elementos nas posição " + i + " : " + frutas.get(i));
        }
    }
    
    public static void metodoRemove() {
        //metodo remove um elemento da lista
        List <Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        
        System.out.println("Valores em numeros: " + numeros);
        numeros.remove(new Integer(30));
        System.out.println("Valores em numeros: " + numeros);
        numeros.remove(0);
        System.out.println("Valores em numeros: " + numeros);
    }
    
    public static void metodoRemoveModos() {
        // metodo clear(); remove todos os elementos de lista;
        List <String> livros = new ArrayList<>();
        livros.add("POO");
        livros.add("C");
        livros.add("JavaScript");
        livros.add("Java");
        livros.add("POO");
        System.out.println("Lista dos livros: " + livros);
        livros.clear();
        System.out.println("Lista de livros apos: " + livros);
    }
    
    public static void metodoAdicionaLista() {
        List <String> letras = new ArrayList<>();
        letras.add("A");
        letras.add("S");
        letras.add("A");
        
        List <String> letras2 = new ArrayList<>();
        letras.add("A");
        letras.add("K");
        letras.add("I");
        letras.add("R");
        letras.add("A");
        
        letras.addAll(letras2);
        
        System.out.println("Lista de letras: " + letras);
    }
    
    public static void main(String args[]) {
        metodoAdd();
        metodoIsEmpty();
        percorreLista();
        metodoRemove();
        metodoRemoveModos();
        metodoAdicionaLista();
    }
}
