
package com.mycompany.github;

public class Rombo{
private double base;
private double altura;

public Rombo(double b, double h){
    this.base = b;
    this.altura =h;
}
public void area(){
     System.out.println("El area es:"+(this.base*altura));
}
public void perimetro(){
   System.out.println("El perometro es:"+(this.base+base+altura+altura));
}
}

