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
public class Cliente{
    
    private double credito;
    private double debito;
    private String dataPagamento; 
    private Pessoa pessoa;
    
   public Cliente(Pessoa pessoa, double credito, double debito, String dataPagamento){
       this.pessoa = pessoa;
       this.credito = credito;
       this.debito = debito;
       this.dataPagamento = dataPagamento;
   }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        if (credito >= 0)
            this.credito = credito;
        else
            this.credito = 0;
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        if (debito >= 0)
            this.debito = debito;
        else
            this.debito = 0;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    
    public void mostraDadosCliente() {
        PessoaFisica pf;
        PessoaJuridica pj;
        
        if (pessoa instanceof PessoaFisica) {
            pf = (PessoaFisica) pessoa;
            System.out.println("Cliente Fisico");
            System.out.println("Nome: " + pf.getNome());
            System.out.println("Enderecp: " + pf.getEndereco());
            System.out.println("Telefone: " + pf.getTelefone());
            System.out.println("Cpf: " + pf.getCpf());
            System.out.println("Profissao: " + pf.getProfissao());
            System.out.println("Debito: " + getDebito());
            System.out.println("Credito: " + getCredito());
            System.out.println("Data Pagamento: " + getDataPagamento());
        } else {
            pj = (PessoaJuridica) pessoa;
            System.out.println("Cliente Fisico");
            System.out.println("Nome: " + pj.getNome());
            System.out.println("Enderecp: " + pj.getEndereco());
            System.out.println("Telefone: " + pj.getTelefone());
            System.out.println("Cpj: " + pj.getCnpj());
            System.out.println("Atividade: " + pj.getAtividade());
            System.out.println("Debito: " + getDebito());
            System.out.println("Credito: " + getCredito());
            System.out.println("Data Pagamento: " + getDataPagamento());
        }
    } 
}
