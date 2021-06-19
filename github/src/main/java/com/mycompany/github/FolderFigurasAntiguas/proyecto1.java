package com.mycompany.github;

import com.sun.source.tree.TryTree;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Michael Jesús
 */
public class proyecto1 {

   /* public static double base, altura, lado, apotema, baseM, basem, numla, diam, Diam, radio;           //variables

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
       String  opcion;

        try {
                                                                                                            //menus
        
       opcion=JOptionPane.showInputDialog("selecione operacion a realizar."
        +"\n 1.Cuadradro "
        +"\n 2.Rectangulo"
        +"\n 3.Triangulo"
        +"\n 4.Rombo"
        +"\n 5.Romboide "
        +"\n 6.Trapecio"
        +"\n 7.Circulo"
        +"\n 8.Poligono"       
        +"\n 9.salir" );

            switch (opcion) {
                case "1":                                                         //cuadrado
                  lado=Double.parseDouble(JOptionPane.showInputDialog("ingrese los lados "));   
                  Cuadrados cua = new Cuadrados(lado);
                    cua.area();
                    cua.perimetro();
                    break;

                case "2":                                                         //rectangulo
                   
                    base=Double.parseDouble(JOptionPane.showInputDialog("ingrese la base"));    
                    altura=Double.parseDouble(JOptionPane.showInputDialog("ingrese la altura"));
                   Rectangulo rec = new Rectangulo(base, altura);
                    rec.area();
                    rec.perimetro();
                    break;
                case "3":                                                         //traingulo
                    double suma = 0;
                    altura=Double.parseDouble(JOptionPane.showInputDialog("ingrese la Altura"));
                    base=Double.parseDouble(JOptionPane.showInputDialog("ingrese la base"));
                    lado=Double.parseDouble(JOptionPane.showInputDialog("ingrese valor para  un lado "));
                    Triangulo tri = new Triangulo(altura, base, lado);
                    tri.area();
                    tri.perimetro();

                    break;
                case "4":                                                          //rombo
                    Diam=Double.parseDouble(JOptionPane.showInputDialog("Ingrese Diametro Mayor "));
                    diam=Double.parseDouble(JOptionPane.showInputDialog("Ingrese Diametro Menor"));
                    lado=Double.parseDouble(JOptionPane.showInputDialog("Ingrese Lado "));
                    Rombo rom = new Rombo(Diam, diam, lado);
                    rom.area();
                    rom.perimetro();
                    break;
                case "5":                                                         //romboide
                  base=Double.parseDouble(JOptionPane.showInputDialog("Ingrese La Base"));
                  altura=Double.parseDouble(JOptionPane.showInputDialog("Ingrese La Altura"));
                    Romboide romboi = new Romboide(base,altura);
                    romboi.area();
                    romboi.perimetro();
                    break;
                case "6":     //trapecio
                    diam=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la  Base Mayor"));
                    Diam=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la  Base Menor"));
                    altura=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Altura"));
                    lado=Double.parseDouble(JOptionPane.showInputDialog("Ingrese El Lado"));
                    Trapecio tra = new Trapecio(diam, Diam, altura, lado);
                    tra.area();
                    tra.perimetro();
                    break;
                case "7":                                                           //circulo
                    Diam=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Diametro"));
                    radio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Radio"));
                    Circulo cir = new Circulo(Diam,radio);
                    cir.area();
                    cir.perimetro();
                    break;
                case "8":                                                         //poligono
                    numla=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Numero de Lados "));
                    lado=Double.parseDouble(JOptionPane.showInputDialog("Ingrese Valor para Lado"));
                    apotema=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Apotema"));
                    Poligonon pol = new Poligonon(apotema,numla,lado);
                    pol.perimetro();
                    pol.area();
                    
                    break;
            }                                                                   //Exepciones
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "No se puede dividir para cero.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error comuniquese con TIC's.");
           
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            //cerrar la conexion 
             JOptionPane.showMessageDialog(null,"Grcias por utilizar nuestro sericio.");
        }*/
    Cuadrados fc = new Cuadrados();

    }

