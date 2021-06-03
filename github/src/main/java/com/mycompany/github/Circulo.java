/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.github;

/**
 *
 * @author Michael Jesús
 */
public class Circulo {

    private double diametro;
    private double radio;
    private double pi;

    public Circulo(double d, double r) {
        this.diametro = d;
        this.radio = r;
        this.pi = 3.1416;
    }

    public void area() {
        System.out.println("El area es: " + (this.pi * this.radio));
    }

    public void perimetro() {
        System.out.println("El area es: " + (this.pi * this.diametro));

    }
}
