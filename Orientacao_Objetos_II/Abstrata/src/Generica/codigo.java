/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generica;

/**
 *
 * @author Julio
 */
public class codigo<T> {
    private T numero;
    private String departamento;
    
    public codigo(T numero, String departamento) {
        this.numero = numero;
        this.departamento = departamento;
    }

    public T getNumero() {
        return numero;
    }

    public void setNumero(T numero) {
        this.numero = numero;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public String toString() {
        String resultado;
        
        resultado = "Numero : " + getNumero() + "Departamento: " + getDepartamento();
        return resultado;
    }
}
