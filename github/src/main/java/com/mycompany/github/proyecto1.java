/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.github;

import com.sun.source.tree.TryTree;
import java.util.Scanner;

/**
 *
 * @author Michael Jesús
 */
public class proyecto1 {

    public static double base, altura, lado, apotema, baseM, basem, numla;

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        try {

            System.out.println("seleccione la operacion a realzar\n 1.-Area y permetro del Cuadrado.");
            System.out.println("seleccione la operacion a realzar\n 2.-Area y permetro del Rectangulo.");
            System.out.println("seleccione la operacion a realzar\n 3.-Area y permetro del Triángulo.");
            System.out.println("seleccione la operacion a realzar\n 4.-Area y permetro del Rombo.");
            System.out.println("seleccione la operacion a realzar\n 5.-Area y permetro del Romboide.");
            System.out.println("seleccione la operacion a realzar\n 6.-Area y permetro del Trapecio.");
            System.out.println("seleccione la operacion a realzar\n 7.-Area y permetro del Circulo.");
            System.out.println("seleccione la operacion a realzar\n 8.-Area y permetro del Poligono.");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("ingrese el lado");
                    lado = sc.nextDouble();
                    Cuadrados cua = new Cuadrados(lado);
                    cua.area();
                    cua.perimetro();
                    break;

                case 2:
                    System.out.println("ingrese la base");
                    System.out.println("ingrese la altura");
                    base = sc.nextDouble();
                    altura = sc.nextDouble();
                    Rectangulo rec = new Rectangulo(base, altura);
                    rec.area();
                    rec.perimetro();
                    break;
                case 3:
                    double suma=0;
                    System.out.println("Ingrese la Altura");
                    System.out.println("Ingrese la Base");
                    altura = sc.nextDouble();
                    base = sc.nextDouble();
                    Triangulo tri=new Triangulo(altura,base,lado);
                    tri.area();
                    for(int cont=0;cont<3;cont++){
                    System.out.println("Ingrese El Lado");
                    lado = sc.nextDouble();
                    suma=suma+lado;
                    
                    }
                    break;
                case 4:
                     System.out.println("aun no esta listo");
                    
                    break;
                 case 5:
                     System.out.println("aun no esta listo");
                    
                    break;    
                 case 6:
                     System.out.println("aun no esta listo");
                    
                    break;
                 case 7:
                     System.out.println("aun no esta listo");
                    
                    break;  
                case 8:
                     System.out.println("aun no esta listo");
                    
                    break;   
            }
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir para cero.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {

            System.out.println("Error comuniquese con TIC's");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            //cerrar la conexion 
            System.out.println("Grcias por utilizar nuestro sericio.");
        }

    }
}
