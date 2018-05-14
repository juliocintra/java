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
public class Fornecedor extends PessoaJuridica{
    private String contato;
    
    public Fornecedor (int codigo, String nome, String endereco, String telefone, String cnpj, String inscricaoEstadual, String contato) {
        super(codigo, nome, endereco, telefone, cnpj, inscricaoEstadual);
        this.contato = contato;
    } 

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
    
    
}
