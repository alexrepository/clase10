/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase5;

/**
 *
 * @author adplascencia
 */
public class Cuadrado implements Figura {

    private int lado;
    private int perimetro;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public Cuadrado() {

    }

    @Override
    public void calcular_perimetro() {
        this.perimetro = lado * 4;
    }

    public int getLado() {
        return lado;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}
