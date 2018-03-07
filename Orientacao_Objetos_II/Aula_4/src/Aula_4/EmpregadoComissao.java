/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

/**
 *
 * @author 16320743
 */
public class EmpregadoComissao extends Empregado{
    
    private double totalVendas;
    private double percentutalComissao;
    
    public EmpregadoComissao(String nome, String endereco, long cpf, double totalVendas, double percentualComissao) {
        super(nome, endereco, cpf);
        this.totalVendas = totalVendas;
        this.percentutalComissao = percentualComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getPercentutalComissao() {
        return percentutalComissao;
    }

    public void setPercentutalComissao(double percentutalComissao) {
        this.percentutalComissao = percentutalComissao;
    }
    
    public double getValorAPagar() {
        double salario;
        salario = (getPercentutalComissao() / 100) * this.totalVendas;
        return salario;
    };
    
}
