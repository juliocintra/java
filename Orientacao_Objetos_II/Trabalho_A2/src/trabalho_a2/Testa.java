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
public class Testa {
    
    public static void main(String[] args) {
        
        PessoaJuridica p = new PessoaJuridica(1, "julio", "aaa", "9999", "123", "aaa");
        
        
        System.out.println(p.getCodigo());
        System.out.println(p.getNome());
        System.out.println(p.getCnpj());
        System.out.println(p.getInscricaoEstadual());
    }
}
