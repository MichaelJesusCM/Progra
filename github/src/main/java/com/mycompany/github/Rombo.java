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
public class Rombo {
    private double Dime;
    private double diame;
    private double lado;
    
    public Rombo(double D,double d,double l){
       this.diame =d;
        this.Dime =D;
        this.lado=l;
    }
   public double area(){
       return this.Dime * this.diame;
   }
   
   public double perimetro(){
       return this.lado+this.lado+this.lado+this.lado;
   }
   
}