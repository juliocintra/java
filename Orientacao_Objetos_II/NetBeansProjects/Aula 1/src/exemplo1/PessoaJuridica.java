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
public class PessoaJuridica extends Pessoa{
    
    String cnpj;
    String atividade;
    
    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String atividade) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.atividade = atividade;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }
    
    
}
