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
public class aula {
    
    // CLASSE ABSTRATA
    /*
        possui pelo menos um metodo abstrato(nao possui implementacao, apenas declaração);
    
        não pode ser instanciada, somente implementada;
    
        classe abstrata só pode ser herdada;
    */
    
    // INTERFACE
    /*
        È um recurso da orientação a objeto utilizado em Java, que define ações executadas
        mas que cada classe pode executar de forma diferentes;
        
        Interface até a versão 7 do Java continha apenas valores constantes e/ou assinaturas
        de métodos que devem ser implementados dentro de uma classe(métodos abstrado);
    
        Uma interface é criada da mesma forma que uma classe , mas utilizando a palavra-chave
        "interface" no lugar de "class";
    
        ex:
            public interface "nomeDaInterface" {
                
            }
    
        Para a classe realizer(implementar) a INTERFACE é necessario adicionar a palavra-chave "implements"
        no final da declaração da classe (que vai implementar a interface);
    */
    
    /*
        As classes seguem o contrato da interface FiguraGeometrica, porém com implementaçoes distintas;
    */
    
    /*
        A interface de de marcação, força o polimorfismo;
    */
    
    /*
        A partir do java 8 podemos definir metodos dentro da interface fornecendo uma implementação "default";
        Se variaS classes, por exemplo, ClasseA, ClasseB, ClasseC, ClasseD implementam a interface 'xyz'
        e se um novo método for adicionado a essa interface, o que acontece?
        Teremos que mudar o código em todas as classes que implementam a interface. Por isso que no Java 8
        apareceu o conceito método "default". Esses métodos poderm ser adicionados em qualquer interface e
        não há necessidade da implementação desses métodos;
    
    EXEMPLO: 
        
    */
}
