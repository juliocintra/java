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
public class Contato extends ContatoBasico{
    
    public String getDados() {
        String st;
        st = super.getDados();
        st = st + " Data Nascimento" + dataNascimento;
        return st;
    }
}
