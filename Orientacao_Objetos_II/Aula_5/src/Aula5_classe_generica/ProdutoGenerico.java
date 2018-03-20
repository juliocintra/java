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
public class ProdutoGenerico <T>{
    
    private T codigo;
    private String descricao;
    private double preco;
    
    public ProdutoGenerico(T codigo, String descricao, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    public void setCodigo(T codigo) {
        this.codigo = codigo;
    }
    
    public T getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public String toString() {
        String resultado;
        resultado = "Codigo: " + getCodigo() + " Descricao: " + getDescricao() + " Preco: " + getPreco();
        return resultado;
    }
}
