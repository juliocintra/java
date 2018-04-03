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
public class ContatoBasico {
    private String nome;
    private List <Telefone> telefones = new ArrayList<>();
    
    public ContatoBasico(String nome) {
        this.nome = nome;
    }
    
    public void adicionarTelefone(Telefone tel) {
        if (telefones.contains(tel)) {
            System.out.println("Telefone já existe");
        }
        else {
            telefones.add(tel);
        }
    }
    
    public void percorreListaTelefone() {
        for (int i = 0; i < telefones.size(); i++) {
            System.out.println("Numero: " + telefones.get(i).getNumero() + " DDD: " + telefones.get(i).getDdd());
        }
    }
    
    public void removeTelefone(Telefone tel) {
        if (telefones.contains(tel)) {
            telefones.remove(tel);
            System.out.println("Telefone removido");
        }
        else {
            System.out.println("Telefone não encontrado");
        }
        
    }
    
    public String getDados() {
        String st;
        
        st = "nome: " + nome;
        for (int i = 0; i < telefones.size(); i++) {
            st = st + " Telefone: " + telefones.get(i).getDados();
        }
        
        return st;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }
}
