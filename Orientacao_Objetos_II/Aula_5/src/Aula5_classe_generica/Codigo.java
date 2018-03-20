/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula5_classe_generica;

/**
 *
 * @author 16320743
 */
public class Codigo {
    private String setor;
    private int sequencia;
    
    public Codigo(String setor, int sequencia) {
        this.setor = setor;
        this.sequencia = sequencia;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }
    
    @Override
    public String toString() {
        return getSetor() + getSequencia();
    }
}
