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
public class Professor extends Pessoa{
    String materia;
    
    public Professor(String nome, int idade, String materia) {
        super(nome, idade);
        this.materia = materia;
    }
    
    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    public String getMateria() {
        return materia;
    }
    
    public void mostraDados() {
        System.out.println("nome : " + getNome() + " idade: " + getIdade() +
                           "\n Materia: " + getMateria());
    }
}
