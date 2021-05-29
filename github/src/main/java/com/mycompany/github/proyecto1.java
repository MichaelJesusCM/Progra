/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.github;

import java.util.Scanner;


/**
 *
 * @author Michael Jesús
 */
public class proyecto1 {
public static double base,altura,lado,apotema,baseM,basem,numla;

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        int opcion=0;
        
        
        System.out.println("seleccione la operacion a realzar\n 1.-Area y permetro del Cuadrado.");
        System.out.println("seleccione la operacion a realzar\n 1.-Area y permetro del Rectangulo.");
        System.out.println("seleccione la operacion a realzar\n 1.-Area y permetro del Trapecio.");
        System.out.println("seleccione la operacion a realzar\n 1.-Area y permetro del .");
        System.out.println("seleccione la operacion a realzar\n 1.-Area y permetro del Cuadrado.");
        System.out.println("seleccione la operacion a realzar\n 1.-Area y permetro del Cuadrado.");
        System.out.println("seleccione la operacion a realzar\n 1.-Area y permetro del Cuadrado.");
        System.out.println("seleccione la operacion a realzar\n 1.-Area y permetro del Cuadrado.");
        opcion=sc.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("ingrese el lado");
                lado=sc.nextDouble();
                Cuadrados cua =new Cuadrados(lado);
                cua.area();
                cua.perimetro();
                break;
               
            case 2:
                System.out.println("ingrese la base");
                System.out.println("ingrese la altura");
                base=sc.nextDouble();
                altura=sc.nextDouble();
                Rectangulo rec =new Rectangulo(base,altura);
                rec.area();
                rec.perimetro();
                break;
        }
        
    }
    
}
