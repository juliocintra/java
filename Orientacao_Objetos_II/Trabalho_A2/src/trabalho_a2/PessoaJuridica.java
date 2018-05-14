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
public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private String inscricaoEstadual;
    
    public PessoaJuridica(int codigo, String nome, String endereco, String telefone, String cnpj, String inscricaoEstadual) {
        super(codigo, nome, endereco, telefone);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    
}
