/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.github;

import javax.swing.JOptionPane;

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
       JOptionPane.showMessageDialog(null,"El area es: " + (this.pi * this.radio));
    }

    public void perimetro() {
        JOptionPane.showMessageDialog(null,"El area es: " + (this.pi * this.diametro));

    }
}
