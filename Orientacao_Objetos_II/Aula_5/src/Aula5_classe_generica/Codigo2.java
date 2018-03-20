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
public class Codigo2 <T, P>{
    private T setor;
    private P sequencia;
    
    public Codigo2(T setor, P sequencia) {
        this.setor = setor;
        this.sequencia = sequencia;
    }

    public T getSetor() {
        return setor;
    }

    public void setSetor(T setor) {
        this.setor = setor;
    }

    public P getSequencia() {
        return sequencia;
    }

    public void setSequencia(P sequencia) {
        this.sequencia = sequencia;
    }
    
    @Override
    public String toString() {
        return getSetor() + "" + getSequencia();
    }
}
