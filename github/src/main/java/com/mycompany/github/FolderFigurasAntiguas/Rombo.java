/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.github;

import javax.swing.JOptionPane;

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
   public void area(){
       JOptionPane.showMessageDialog(null,"El Área Es: "+(this.diame*this.Dime));
   }
   
   public void perimetro(){
       JOptionPane.showMessageDialog(null,"El Área Es: "+(lado*4));
   
   }
}