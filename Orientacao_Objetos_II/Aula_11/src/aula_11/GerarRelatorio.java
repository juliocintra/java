/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_11;

/**
 *
 * @author 16320743
 */
import java.io.*;
public class GerarRelatorio {
    
    public static void main(String[] args) {
        try {
            // utilizaa classe PrintStream para gerar relatorios de texto
            PrintStream ps = new PrintStream("C:\\Users\\16320743.CDI\\Desktop\\exercicio.txt");
            ps.println("Exemplo de inclusão de dados");
            
            int a = 10;
            ps.println(a);
            ps.flush(); // força os dados no disco;
        } catch(Exception e) {
            System.out.println("Exceção: " + e);
        }
    }
}
