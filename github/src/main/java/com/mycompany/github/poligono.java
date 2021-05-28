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
public class poligono {
    

    private double perimetro;
    private double apotema;
    private double lado;
    private double numla;
    
public poligono (double a, double b,double c ){
   this.perimetro=b;
   this.apotema =a;
   this.lado=1;
   this.numla=c;
}

public void perimetro(){
    System.out.println("El perimetro es: "+(lado*numla));
    }

public double area(){
     return(this.perimetro * this.apotema)/2;
}
    
}
    

