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

    public static double base, altura, lado, apotema, baseM, basem, numla, diam, Diam, radio;           //variables

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        try {
                                                                                                            //menus
            System.out.println("seleccione la operacion a realzar\n 1.-Area y permetro del Cuadrado.");
            System.out.println("2.-Area y permetro del Rectangulo.");
            System.out.println("3.-Area y permetro del Triángulo.");
            System.out.println("4.-Area y permetro del Rombo.");
            System.out.println("5.-Area y permetro del Romboide.");
            System.out.println("6.-Area y permetro del Trapecio.");
            System.out.println("7.-Area y permetro del Circulo.");
            System.out.println("8.-Area y permetro del Poligono.");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:                                                         //cuadrado
                    System.out.println("ingrese el lado");
                    lado = sc.nextDouble();
                    Cuadrados cua = new Cuadrados(lado);
                    cua.area();
                    cua.perimetro();
                    break;

                case 2:                                                         //rectangulo
                    System.out.println("ingrese la base");
                    base = sc.nextDouble();
                    System.out.println("ingrese la altura");
                    altura = sc.nextDouble();
                    Rectangulo rec = new Rectangulo(base, altura);
                    rec.area();
                    rec.perimetro();
                    break;
                case 3:                                                         //traingulo
                    double suma = 0;
                    System.out.println("Ingrese la Altura");
                    altura = sc.nextDouble();
                    System.out.println("Ingrese la Base");
                    base = sc.nextDouble();
                    System.out.println("Ingrese un Lado");
                    lado = sc.nextDouble();
                    Triangulo tri = new Triangulo(altura, base, lado);
                    tri.area();
                    tri.perimetro();

                    break;
                case 4:                                                         //rombo
                    System.out.println("Ingrese el Diametro Mayor");
                    Diam=sc.nextDouble();
                    System.out.println("Ingrese el Diametro Menor");
                    diam=sc.nextDouble();
                    System.out.println("Ingrese el Lado");
                    lado=sc.nextDouble();
                    Rombo rom = new Rombo(Diam, diam, lado);
                    rom.area();
                    rom.perimetro();
                    break;
                case 5:                                                         //romboide
                    System.out.println("Ingrese la Base ");
                    base=sc.nextDouble();
                    System.out.println("Ingrese la Altura ");
                    altura=sc.nextDouble();
                    Romboide romboi = new Romboide(base,altura);
                    romboi.area();
                    romboi.perimetro();
                    break;
                case 6:                                                         //trapecio
                    System.out.println("Ingrese el Base Mayor");
                    diam = sc.nextDouble();
                    System.out.println("Ingrese el base Menor");
                    Diam = sc.nextDouble();
                    System.out.println("Ingrese la Altura");
                    altura = sc.nextDouble();
                    System.out.println("Ingrese El Lado");
                    lado = sc.nextDouble();
                    Trapecio tra = new Trapecio(diam, Diam, altura, lado);
                    tra.area();
                    tra.perimetro();
                    break;
                case 7:                                                         //circulo
                    System.out.println("Ingrese el Diametro");
                    Diam=sc.nextDouble();
                    System.out.println("Ingrese el Radio");
                    radio=sc.nextDouble();
                    Circulo cir = new Circulo(Diam,radio);
                    cir.area();
                    cir.perimetro();
                    break;
                case 8:                                                         //poligono
                    System.out.println("Ingrese el Numero de Lados");
                    numla=sc.nextDouble();
                    System.out.println("Ingrese el Valor Del Lado");
                    lado=sc.nextDouble();
                    System.out.println("Ingrese La Apotema");
                    apotema=sc.nextDouble();
                    Poligono pol = new Poligono(apotema,numla,lado);
                    pol.perimetro();
                    pol.area();
                    break;
            }                                                                   //Exepciones
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
