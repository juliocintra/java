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
public class EmpregadoComissaoAssalariado extends EmpregadoComissao{
    
    private double salarioBase;
    
    public EmpregadoComissaoAssalariado(String nome, String endereco, long cpf, double qtdeHorasTrabalhadas, double totalVendas, double percentualComissao) {
        super(nome, endereco, cpf, totalVendas, percentualComissao);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public double getValorAPagar() {
        double salario;
        salario = super.getValorAPagar() + this.salarioBase;
        return salario;
    }
}
