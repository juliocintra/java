/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_7;

/**
 *
 * @author 16320743
 */
public class Telefone {
    private String ddd;
    private String numero;
    
    public Telefone(String ddd, String numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getDados() {
        String st;
        
        st = "DDD: " + ddd + " Numero: " + numero;
        return st;
    }
    
}
