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
public class Compras {
    
    private Cliente clientes[];
    private int pos = 0;
    public Compras(int tam) {
        clientes = new Cliente[tam];
    }
    
    public void adicionarCliente(Cliente cliente){
        if (pos == clientes.length) {
            System.out.println("Vetor cheio");
        }
        else {
            clientes[pos] = cliente;
            pos++;
        }
    }
    
    public void quantidadeFisicoJuridico() {
        int qtdeJuridico = 0;
        int qtdeFisico = 0;
        
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] instanceof PessoaFisica){
                qtdeFisico++;
            }
        }
    }
}
