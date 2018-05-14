/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_a2;

/**
 *
 * @author Julio
 */
public class PessoaFisica extends Pessoa{
    private String cpf;
    
    public PessoaFisica(int codigo, String nome, String endereco, String telefone, String cpf) {
        super(codigo, nome, endereco, telefone);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
