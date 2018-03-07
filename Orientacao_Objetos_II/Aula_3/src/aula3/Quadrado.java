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
public class Quadrado implements FiguraGeometrica{
    private int lado;
    
    public Quadrado (int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    public int getArea() {
        int area = 0;
        area = lado * lado;
        return area;
    }
    
    public int getPerimetro() {
        int perimetro = 0;
        perimetro = 4 * lado;
        return perimetro;
    }
    
    public String getNomeFigura() {
        return "Quadrado";
    }
}
