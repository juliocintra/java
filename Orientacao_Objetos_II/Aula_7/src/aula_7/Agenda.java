/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_7;

/**
 *
 * @author 16320743
 */
import java.util.*;
public class Agenda {
    private List <ContatoBasico> contatos = new ArrayList<>();
    
    public void AdicionaContato(ContatoBasico contato) {
        if (contatos.contains(contato)) {
            System.out.println("Ja existe");
            return;
        }
        contatos.add(contato);
    }
}
