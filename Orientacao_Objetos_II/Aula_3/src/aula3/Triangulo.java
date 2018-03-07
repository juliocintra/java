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
public class Triangulo implements FiguraGeometrica{
    private int base;
    private int altura;
    private int ladoa;
    private int ladob;
    private int ladoc;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLadoa() {
        return ladoa;
    }

    public void setLadoa(int ladoa) {
        this.ladoa = ladoa;
    }

    public int getLadob() {
        return ladob;
    }

    public void setLadob(int ladob) {
        this.ladob = ladob;
    }

    public int getLadoc() {
        return ladoc;
    }

    public void setLadoc(int ladoc) {
        this.ladoc = ladoc;
    }
    
    public int getArea() {
        int area = 0;
        area = (base * altura) / 2;
        return area;
    }
    
    public int getPerimetro() {
        int perimetro = 0;
        perimetro = ladoa * ladob * ladoc;
        
        return perimetro;
    }
    
    public String getNomeFigura() {
        return "Triângulo";
    }
}
