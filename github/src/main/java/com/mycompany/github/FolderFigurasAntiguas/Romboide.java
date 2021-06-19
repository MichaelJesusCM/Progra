/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.github;

import javax.swing.JOptionPane;

/**
 *
 * @author Pc Xtreme
 */
public class Romboide {
private double base;
private double altura;

public Romboide(double b, double h){
    this.base = b;
    this.altura =h;
}
public void area(){
    JOptionPane.showMessageDialog(null,"El Área Es:"+(this.base*this.altura));
}
public void perimetro(){
    JOptionPane.showMessageDialog(null,"El Área Es:"+((this.base*2)*(this.altura*2)));
}
}
