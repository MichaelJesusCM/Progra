/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.github;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;


public class FigurasFrame extends JFrame{
    public FigurasFrame() {
        cargarComponentes();

    }
    private JPanel panel;
    private JTextField txtNum1, txtNum2;
    private JButton btnCuadrados, btnCirculo, btnPoligono, btnRectangulo, btnRombo, btnRomboide, btnTrapecio, btnTriangulo;
    private JLabel lblResultado;

    private void cargarComponentes() {
        ////////////PANTALLA PRINCIPAL////////////
        setSize(500, 500);

        

        lblResultado = new JLabel();

        btnCuadrados = new JButton("Cuadrados");
        btnCuadrados.addMouseListener(new Cuadrados());

        btnCirculo = new JButton("Circulos");
        btnCirculo.addMouseListener(new Circulo());

        btnPoligono = new JButton("Poligonos");
        btnPoligono.addMouseListener(new Poligono());

        btnRectangulo = new JButton("Rectangulos");
        btnRectangulo.addMouseListener(new Rectangulo());

        btnRombo = new JButton("Rombo");
        btnRombo.addMouseListener(new Rombo());

        btnRomboide = new JButton("Romboides");
        btnRomboide.addMouseListener(new Romboide());

        btnTrapecio = new JButton("Trapecios");
        btnTrapecio.addMouseListener(new Trapecio());

        btnTriangulo = new JButton("Triangulos");
        btnTriangulo.addMouseListener(new Triangulo());

        panel = new JPanel();
       
        panel.add(lblResultado);
        panel.add(btnCuadrados);
        panel.add(btnCirculo);
        panel.add(btnPoligono);
        panel.add(btnRectangulo);
        panel.add(btnRombo);
        panel.add(btnRomboide);
        panel.add(btnTrapecio);
        panel.add(btnTriangulo);

        setContentPane(panel);
        setVisible(true);

    }
//// Llamar Cuadrados

    private class Cuadrados extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            
            CuadradroFrame cuaf = new CuadradroFrame();
            

        }
    }
//// Llamar Circulos
    private class Circulo extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            CirculoFrame cirf = new CirculoFrame();

        }
    }
//// Llamar poligono
    private class Poligono extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
           PoligonoFrame polf = new PoligonoFrame();

        }
    }
//// Llamar Rectangulos
    private class Rectangulo extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            RectanguloFrame recf = new RectanguloFrame();

        }
    }
//// Llamar Rombo
    private class Rombo extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            RomboFrame rof = new RomboFrame();

        }
    }
//// Llamar Romboides
    private class Romboide extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            RomboideFrame romf = new RomboideFrame ();
        }
    }
//// Llamar Trapecio
    private class Trapecio extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            TrapecioFrame traf = new TrapecioFrame();

        }
    }
//// Llamar Triangulo
    private class Triangulo extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            TrianguloFrame trif = new TrianguloFrame();
            

        }
    }

}

    

