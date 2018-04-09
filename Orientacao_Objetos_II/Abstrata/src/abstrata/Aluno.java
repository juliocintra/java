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
public class Aluno extends Pessoa{
    private float nota1;
    private float nota2;
    
    public Aluno(String nome, int idade, float nota1, float nota2) {
        super(nome, idade);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    public float getNota1() {
        return nota1;
    }
    
    public void setNota1(float n1) {
        this.nota1 = n1;
    }
    
    public float getNota2() {
        return nota2;
    }
    
    public void setNota2(float n2) {
        this.nota2 = n2;
    }
    
    public void mostraDados() {
        System.out.println("nome : " + getNome() + " idade: " + getIdade() +
                           "\n nota1: " + getNota1() + " nota2: " + getNota2());
    }
}
