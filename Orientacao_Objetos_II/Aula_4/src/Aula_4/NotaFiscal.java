/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_4;

/**
 *
 * @author 16320743
 */
public class NotaFiscal implements Pagavel{
    
    private int numeroPeca;
    private String descricao;
    private double qtdePecas;
    private double valorPeca;
    
    public NotaFiscal(int numeroPeca, String descricao, double qtdePecas, double valorPeca) {
        this.numeroPeca = numeroPeca;
        this.descricao = descricao;
        this.qtdePecas = qtdePecas;
        this.valorPeca = valorPeca;
    }

    public int getNumeroPeca() {
        return numeroPeca;
    }

    public void setNumeroPeca(int numeroPeca) {
        this.numeroPeca = numeroPeca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getQtdePecas() {
        return qtdePecas;
    }

    public void setQtdePecas(double qtdePecas) {
        this.qtdePecas = qtdePecas;
    }

    public double getValorPeca() {
        return valorPeca;
    }

    public void setValorPeca(double valorPeca) {
        this.valorPeca = valorPeca;
    }
    
    public double getValorAPagar() {
        double valor;
        valor = getValorPeca() * getQtdePecas();
        return valor;
    }
}
