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
public class EmpregadoHorista extends Empregado{
    private double qtdeHorasTrabalhadas;
    private double valorHora;
    
    public EmpregadoHorista(String nome, String endereco, long cpf, double qtdeHorasTrabalhadas, double valorHora) {
        super(nome, endereco, cpf);
        this.qtdeHorasTrabalhadas = qtdeHorasTrabalhadas;
        this.valorHora = valorHora;
    }

    public double getQtdeHorasTrabalhadas() {
        return qtdeHorasTrabalhadas;
    }

    public void setQtdeHorasTrabalhadas(double qtdeHorasTrabalhadas) {
        this.qtdeHorasTrabalhadas = qtdeHorasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    @Override
    public double getValorAPagar() {
        double salario;
        salario = getQtdeHorasTrabalhadas() + getValorHora();
        return salario;
    }
}
