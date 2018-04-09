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
public class Ultilitaria {
 
    public static int quantidade(String texto) {
        int qtde = 0;
        String vet[];
        
        if (texto.length() == 0) {
            System.out.println("ERRO");
            return qtde;
        }
        else {
            vet = texto.split(" ");
            
            for (int i = 0; i < vet.length; i++) {
                qtde++;
            }
        }
        return qtde;
    }
    
    public static int quantidadePalavrasTexto(String texto, String palavra)
    {
        int quantidade = 0;
        String vetaux[];
        
        if(texto.length()==0) // Se o texto for vazio retorna 0.
            return quantidade;
        
        vetaux = texto.split(" ");
        
        for(int i = 0; i < vetaux.length; i++)
        {
            if(vetaux[i].equals(palavra))
                quantidade++;
        }
        return quantidade;
    }
    
    public static int quantidadePalavrasTextoNoCase(String texto, String palavra)
    {
        int quantidade = 0;
        String vetaux[];
        
        if(texto.length()==0)
            return quantidade;
        
        vetaux = texto.split(" ");
        
        for(int i = 0; i < vetaux.length; i++)
        {
            if(vetaux[i].equalsIgnoreCase(palavra))
                quantidade++;
        }
        
        return quantidade;
    }
    
   
                
}
