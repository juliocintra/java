/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Julio
 */
public class EmpregadoComissao extends Empregado{
    private double totalVenda;
    private double percentualComissao;
    
    public EmpregadoComissao(String nome, String endereco, long cpf, double totalVenda, double percentualComissao) {
        super(nome, endereco, cpf);
        this.totalVenda = totalVenda;
        this.percentualComissao = percentualComissao; 
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
    @Override
    public double getValorAPagar() {
        double salario;
        salario = (this.percentualComissao / 100) * totalVenda;
        return salario;
    }
}
