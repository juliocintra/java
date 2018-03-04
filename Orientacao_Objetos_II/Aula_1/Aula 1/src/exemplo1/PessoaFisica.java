/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo1;

/**
 *
 * @author 16320743
 */
public class PessoaFisica extends Pessoa{
    
    private String cpf;
    private String profissao;
    
    public PessoaFisica(String nome, String endereco, String telefone, String cpf, String profissao) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.profissao = profissao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
