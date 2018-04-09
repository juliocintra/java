/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

/**
 *
 * @author Julio
 */
import java.util.*;
public class ContatoBasico {
    private String nome;
    private List <Telefone> telefones = new ArrayList<>();
    
    public ContatoBasico(String nome) {
        this.nome = nome;
    }
    
    public void adicionarTelefone(Telefone tel) {
        if (telefones.contains(tel)) {
            System.out.println("Telefone já existente");
        }
    }
}
