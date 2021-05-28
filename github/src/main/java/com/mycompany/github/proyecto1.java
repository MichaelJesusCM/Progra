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

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        double altura=0;
        double base=0;
        int opcion=0;
        
        System.out.println("seleccione la operacion a realzar\n 1.-Area y permetro del rectangulo.");
        opcion=sc.nextInt();
        
        switch(opcion){
            case 1:
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
