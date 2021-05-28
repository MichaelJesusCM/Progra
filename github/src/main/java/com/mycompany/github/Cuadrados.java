
package com.mycompany.github;

public class Cuadrados {
 private double lado;
 
 public Cuadrados(double l){
 this.lado= l;
 }
 
 public double area(){
 return lado*lado;
 }
 public double perimetro(){
 return lado +lado +lado +lado;
 }
}