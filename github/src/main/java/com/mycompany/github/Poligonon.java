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
public class Poligonon {

    private double apotema;
    private double numerol;
    private double lado;
    private double perimetro;
    private double numla;

    public Poligonon(double ap, double nl, double l) {
        this.apotema = ap;
        this.numerol = nl;
        this.lado = l;
        this.numla = 0;
    }
        public void perimetro() {
        System.out.println("El Perimetro Es :" + (this.lado * this.numla));

    }

    public void area() {
        System.out.println("El Área es: " + (this.perimetro * this.apotema) / 2);
    }

}
