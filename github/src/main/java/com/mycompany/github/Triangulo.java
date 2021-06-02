
package com.mycompany.github;


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
 System.out.println("El Área es: "+((this.base * this.altura)/2));
}
    public void perimetro(){
        
    System.out.println("El perimetro es: "+(lado+lado+lado));
    }
}
