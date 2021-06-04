
package com.mycompany.github;

import javax.swing.JOptionPane;

public class Trapecio {
    private double baseM;
    private double basem;
    private double altura;
    private double lado;
    
 public Trapecio(double M, double m,double a,double l){
 this.baseM=M;
 this.basem=m;
 this.altura=a;
 this.lado=l;
 }
 public void area(){
  
   JOptionPane.showMessageDialog(null,"El perimetro es: "+((baseM*basem)*altura)/2);
 
 }
 
 
    public void perimetro(){
    JOptionPane.showMessageDialog(null,"El perimetro es: "+(baseM+basem+lado+lado));
    }
}
