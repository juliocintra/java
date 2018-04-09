/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg02;

/**
 *
 * @author 15282783
 */
public class AULA02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = new String();
        String s1 = new String("POO");
        String s2 = new String(s1);
        
        String st1 = "teste";
        String st2 = "teste";
        
        if(st1.equals(st2))
            System.out.println("Iguais");
        else
            System.out.println("Diferentes");
        
        System.out.println("Tamanho de s: " + s.length());
        System.out.println("Tamanho de s2: " + s1.length());
        System.out.println("Tamanho de s3: " + s2.length());
        
        System.out.println(s1);
        System.out.println(s2);
        
        if(s1.equals(s2))
            System.out.println("Iguais");
        else
            System.out.println("Diferentes");
        
        boolean b;
        b = "POO".equals(s1);
        System.out.println("Resultado da Compração: " + b);
        
        String str1 = new String("Teste");
        String str2 = new String("Teste");
        String str3 = "Teste";
        String str4 = "Teste";
        
        String datas = new String ("19/02/2018");
        String vet[] = datas.split("/");
        
        System.out.println("Vet[0]: " + vet[0]);
        System.out.println("Vet[1]: " + vet[1]);
        System.out.println("Vet[2]: " + vet[2]);
        
        String texto = "julio cesar cintra";
        
    }
    
}
