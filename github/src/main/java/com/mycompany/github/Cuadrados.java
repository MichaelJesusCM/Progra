
package com.mycompany.github;

import javax.swing.JOptionPane;

public class Cuadrados {
 private double lado;
 
 public Cuadrados(double l){
 this.lado= l;
 }
 
 public void area(){
 JOptionPane.showMessageDialog(null,"EL Área es: "+(this.lado*this.lado));
 }
 public void perimetro(){
JOptionPane.showMessageDialog(null,"EL Permimetro es: "+(this.lado*4));
 }
}