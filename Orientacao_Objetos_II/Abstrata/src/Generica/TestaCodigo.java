/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generica;

/**
 *
 * @author Julios
 */
public class TestaCodigo {
    
    public static void main(String[] args) {
        
        codigo <String> cod = new codigo("123", "financeiro");
        
        Aluno <codigo> aluno1 = new Aluno("Julio", cod);
        
        System.out.println(aluno1.toString());
    }
}
