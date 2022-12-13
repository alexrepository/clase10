/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.clase5;

import javax.swing.JOptionPane;

/**
 *
 * @author adplascencia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Persona p = new Persona("12345678", "Antonio");
        //p.presentarse();

    //descomente el código para ver que hace        
    Docente d = new Docente("1104635501", "ALEX", "UNIDAD TECNICA Y TECNOLÓGICA");
        d.presentarse();
        d.dar_clase();
        
        Estudiante e = new Estudiante("POIUYT", "ALKZAMM", "¿Soy una clase heredada?");
        e.presentarse();
        e.hacer_pregunta();
 
//HE HABILITADO LOS CUADRADOS  
        Cuadrado c = new Cuadrado(5);
        c.calcular_perimetro();
        System.out.println("El perimetro del cuadrado es " + c.getPerimetro());

        Triangulo t = new Triangulo();
        int[] lados = {6, 6, 6};
        t.setLado(lados);
        t.calcular_perimetro();
        System.out.println("El perimetro del triangulo es " + t.getPerimetro());
        //e.hacer_pregunta("¿Porque tengo los métodos de presentarse si no los declare en la clase estudiante?");

    }

}
