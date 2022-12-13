/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase5;

/**
 *
 * @author adplascencia
 */
public class Triangulo implements Figura {

    private int[] lado;
    private int perimetro;

    public int[] getLado() {
        return lado;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setLado(int[] lado) {
        this.lado = lado;
    }

    @Override
    public void calcular_perimetro() {
        this.perimetro = lado[0] + lado[1] + lado[2];
    }

    public Triangulo() {
    }

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado = new int[3];
        this.lado[0] = lado1;
        this.lado[1] = lado2;
        this.lado[2] = lado3;
    }

   
}
