/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.github;

/**
 *
 * @author Pc Xtreme
 */
public class Romboide {
private double base;
private double altura;

public Romboide(double b, double h){
    this.base = b;
    this.altura =h;
}
public double area(){
    return this.base*this.altura;
}
public double perimetro(){
    return this.base+this.base+this.altura+this.altura;
}
}
