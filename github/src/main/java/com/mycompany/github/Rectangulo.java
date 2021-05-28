
package com.mycompany.github;

public class Rectangulo {
    private double base;
    private double altura;
    
    public Rectangulo(double b, double a){
    this.base = b;
    this.altura = a;
    
    }
    
    public double area(){
    return this.base * this.altura;
   
    }
    
    public void perimetro(){
        System.out.println("El perimetro es: "+((this.base*2)+(this.altura*2)));
    }
}
