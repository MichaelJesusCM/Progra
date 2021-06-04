
package com.mycompany.github;

import javax.swing.JOptionPane;

public class Rectangulo {
    private double base;
    private double altura;
    
    public Rectangulo(double b, double a){
    this.base = b;
    this.altura = a;
    
    }
    
    public void area(){
   JOptionPane.showMessageDialog(null,"El perimetro es: "+(this.base*this.altura));
   
    }
    
    public void perimetro(){
        JOptionPane.showMessageDialog(null,"El perimetro es: "+((this.base*2)+(this.altura*2)));
    }
}
