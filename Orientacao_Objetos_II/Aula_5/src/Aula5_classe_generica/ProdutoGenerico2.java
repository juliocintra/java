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
public class ProdutoGenerico2 <T, P>  {
    
    private T codigo;
    private P descricao;
    private double preco;
    
    
    public ProdutoGenerico2 (T codigo,P descricao,double preco){
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public T getCodigo() {
        return codigo;
    }

    public void setCodigo(T codigo) {
        this.codigo = codigo;
    }

    public P getDescricao() {
        return descricao;
    }

    public void setDescricao(P descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public String toString(){
    String resultado;
    resultado = "Codigo: " + getCodigo() + " Descricao: " + getDescricao() + " Preco: " + getPreco();
    return resultado;
        
    }
    
}
