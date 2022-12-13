/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase5;

/**
 *
 * @author adplascencia
 */
public class Docente extends Persona {

    private String facultad;

    public Docente(String cedula, String nombre, String facultad) {
        super(cedula, nombre);
        this.facultad = facultad;
    }

    public void dar_clase() {
        System.out.println("Estoy dando una clase en la facultad de " + facultad);
    }

    @Override
    public void presentarse() {
        System.out.println("Hola mi nombre es " + super.nombre + " y soy docente de la facultad de" + facultad);
    }

}
