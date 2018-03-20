/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_6;

/**
 *
 * @author 16320743
 */
public class Pilha <T>{
    
    private int topo;
    private T info[] = (T[]) new Object[100];
    
    public void inicializa() {
        topo = -1;
    }
    
    public boolean vazia() {
        if (topo == -1)
            return true;
        else
            return false;
    }
    
    public boolean cheia() {
        if (topo == info.length -1)
            return true;
        else
            return false;
    }
    
    public void push(T x) {
        if (cheia()) {
            System.out.println("Vetor cheio");
        }
        else {
            topo = topo + 1;
            info[topo] = x;
        }
    }
    
    public T pop() {
        T x;
        
        if (vazia()) {
            System.out.println("Vetor vazio");
            return null;
        }
        
        x = info[topo];
        topo = topo -1;
        return x;
    }
}
