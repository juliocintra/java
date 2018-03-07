/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

/**
 *
 * @author 16320743
 */
public class Principal {
    
    private Pagavel vet[] = new Pagavel[10];
    private int pos = 0;
    
    public void adicionaPagavel(Pagavel p) {
    
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == null) {
                vet[i] = p;
                return;
            }
        }
    }
    
    public void mostraPagavel() {
        for (int i = 0; i< vet.length; i++) {
            if (vet[i] != null) {
                System.out.println("Valor: " + vet[i].getValorAPagar());
            }
        }
    }
    
    public static void main(String[] args) {
        Principal p = new Principal();
        p.adicionaPagavel(new EmpregadoMensalista("Juão", "Av. Brasil", 370000004, 1551));
        p.adicionaPagavel(new EmpregadoComissaoAssalariado("Ana", "Rua professor", 1, 8, 10, 10));
        p.adicionaPagavel(new NotaFiscal(10, "Note", 2, 1350));
        p.mostraPagavel();
    }
}
