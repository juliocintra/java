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
import java.util.Scanner;
public class TestaScanner {
    
    public static void main(String[] args) {
        
        File arq = new File ("C:\\PROJETOS\\FACULDADE\\linguagem_C\\5_Semestre\\Aula_1\\programas\\exercicio.txt");
        // o arquivo exercicio.txt poderÃ¡ ter o seguinte conteudo
        // 10;Joao;5800.20;M
        // 20;Ana;3400.10;F
        // 30;Carlos;2800.36;M
        // 40;Claudia alencar;9200.00;F
        System.out.println("Caminho absoluto: " + arq.getAbsolutePath());
        try
        {
            //Scanner, nesse exemplo vai fazer a leitura de um
            // arquivo texto denominado de exercicio.txt
            Scanner scanner = new Scanner(arq);
            // A leitura do arquivo serÃ¡ por linha (String)
            // O metodo hasNextLine() verifica se existe linha para ler
            // se existir retorna true, se nÃ£o existir retorna false
            while(scanner.hasNextLine())
            {
                String s[];
                s=(scanner.nextLine()).split(";");
                //transformar a String s[0] em um numero inteiro
                int numero=Integer.parseInt(s[0]);
                String nome = s[1];
                //transformar a String s[2] em um numero real (double)
                double salario = Double.parseDouble(s[2]);
                char sexo = s[3].charAt(0);
                System.out.println("Numero: " + numero);
                System.out.println("Nome: " + nome);
                System.out.println("Salario: " + salario);
                System.out.println("Sexo: " + sexo);
            }
        }
        catch(Exception e)
        {
            System.out.println("Excecao: " + e);
        }
    }
//    public static void main(String[] args)
//    {
//        File arq = new File("C:\\Users\\Julio\\Desktop\\exercicio.txt");
//        //o arquivo exericicio.txt poderá ter o seguinte conteudo
//        // 10;Joao;5800.20;M
//        //20;Ana;3400.10;P
//        //30;Carlos;2800.36;m
//        //40;Claudia alencar;9200.00;F
//        
//        try
//        {
//            //Scanner, esse exemplo vai fazer a leitura de um
//            //arquivo texto denominado de exercicio.txt
//            Scanner scanner = new Scanner(arq);
//            //A leitura do arquivo será por linha.
//            //O metodo hasNextLine() verifica se existe linha para ler
//            //se existir retorna true, se não existir retorna false
//            
//            while(scanner.hasNextLine())
//            {
//                String s[];
//                s = (scanner.nextLine()).split(";");
//                //transformar a string s[0] em um numero inteiro
//                int numero = Integer.parseInt(s[0]);
//                String nome = s [1];
//                //transformar a String s[2] em um numero real (double)
//                double salario = Double.parseDouble(s[2]);
//                char sexo = s[3]. charAt(0);
//                System.out.println("Numero: " + numero);
//                System.out.println("Nome: " + nome);
//                System.out.println("Salario: " + salario);
//                System.out.println("sexo: " + sexo);
//            }
//        }
//        catch(Exception e)
//        {
//            System.out.println("Excecao: " + e);
//        }
//    }
}
