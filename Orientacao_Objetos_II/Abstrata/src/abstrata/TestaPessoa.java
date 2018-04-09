/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrata;

/**
 *
 * @author Julio
 */
public class TestaPessoa {
    
    public static void main(String[] args) {
        
//        Pessoa teste = new Pessoa("teste", 20);;
        Aluno a = new Aluno("Julio", 21, 9, 7);
        Professor p = new Professor("Orsi", 55, "JAVA");
        
        a.mostraDados();
        p.mostraDados();
//       
        
//        System.out.println(a.getNota1());
//        System.out.println(p.getMateria());
    }
}
