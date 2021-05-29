
package com.mycompany.github;

public class Cuadrados {
 private double lado;
 
 public Cuadrados(double l){
 this.lado= l;
 }
 
 public void area(){
 System.out.println("EL Área es: "+(this.lado*this.lado));
 }
 public void perimetro(){
 System.out.println("EL Permimetro es: "+(this.lado*4));
 }
}