
package com.mycompany.github;

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
  
    System.out.println("El perimetro es: "+((baseM*basem)*altura)/2);
 
 }
 
 
    public void perimetro(){
    System.out.println("El perimetro es: "+(baseM+basem+lado+lado));
    }
}
