/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase5;

import java.util.Date;

/**
 *
 * @author adplascencia
 */
public class Estudiante extends Persona {

    private String pregunta;

    public Estudiante(String cedula, String nombre, String pregunta) {
        super(cedula, nombre);
        this.pregunta = pregunta;
    }

    public void hacer_pregunta() {
        System.out.println("Profe tengo una pregunta: " + pregunta);
    }

    public void hacer_pregunta(String detalle) {
        System.out.println("Profe tengo una pregunta: " + pregunta + ", " + detalle);
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    @Override
    public void presentarse() {
        System.out.println("Hola mi nombre es " + super.nombre + ", soy un estudiante y tengo la siguiente pregunta" + pregunta);
    }
}
