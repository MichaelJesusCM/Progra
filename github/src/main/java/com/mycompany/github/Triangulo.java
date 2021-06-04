
package com.mycompany.github;

import javax.swing.JOptionPane;


public class Triangulo {
    private double base;
    private double altura;
    private double lado;
    
public Triangulo (double a, double b, double lado){
   this.base=b;
   this.altura =a;
   this.lado=1;
}

public void area(){
JOptionPane.showMessageDialog(null,"El Área es: "+((this.base * this.altura)/2));
}
    public void perimetro(){
        
    JOptionPane.showMessageDialog(null,"El perimetro es: "+(lado+lado+lado));
    }
}
