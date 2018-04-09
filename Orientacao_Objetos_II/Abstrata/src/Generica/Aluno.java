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
public class Aluno <T> {
    private String nome;
    private T codigo;
    
    public Aluno(String nome, T codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public T getCodigo() {
        return codigo;
    }

    public void setCodigo(T codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public String toString(){
        String resultado;
        resultado = "Nome: " + getNome() + " Codigo: " + getCodigo();
        return resultado;
    }
}
