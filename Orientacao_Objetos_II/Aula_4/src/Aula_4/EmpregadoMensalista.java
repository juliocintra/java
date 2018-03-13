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
public class EmpregadoMensalista extends Empregado{
    
    private double salarioMensal;
    
    public EmpregadoMensalista(String nome, String endereco, long cpf, double salarioMensal) {
        super(nome, endereco, cpf);
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    
    @Override
    public double getValorAPagar() {
        return salarioMensal;
    }
}
