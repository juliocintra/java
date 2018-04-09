/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Julio
 */
public class TestaEmpregado {
    
    public static void main(String[] args) {
        
        EmpregadoMensalista emp1 = new EmpregadoMensalista("julio", "av brasil", 1111111111, 1090.00);
        System.out.println(emp1.getValorAPagar());
        
        EmpregadoComissaoAssalariado emp2 = new EmpregadoComissaoAssalariado("Ana", "Rua professor", 12345611, 1.0, 1.0, 1.0, 1.0);
        System.out.println(emp2.getValorAPagar());
    }
}
