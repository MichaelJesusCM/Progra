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

/**
 *
 * @author Michael Jesús
 */
public class CirculoFrame extends JFrame {

    public CirculoFrame() {
        cargarComponentes();

    }
    private JPanel panel;
    private JTextField txtRadio, txtDiametro, txtHacer;
    private JButton btnArea, btnPerimetro, btnLimpiar;
    private JLabel lblResultado;

    private void cargarComponentes() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 500);
        setTitle("Circulos");

        txtRadio= new JTextField("",10);
        txtRadio.setFocusable(true);
        txtRadio.setBackground(Color.cyan);
        txtDiametro = new JTextField("",10);
        txtDiametro.setBackground(Color.green);

        
        lblResultado = new JLabel();

        btnArea = new JButton("Perimetro");
        btnArea.addMouseListener(new Perimetro());
        btnPerimetro = new JButton("Area");
        btnPerimetro.addMouseListener(new Area());
        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addMouseListener(new Limpiar());
        
        txtHacer = new JTextField("Ingrese primero el Radio y luego el Diametro");
        
        panel = new JPanel();
        panel.add(txtRadio);
        panel.add(txtDiametro);
        panel.add(lblResultado);
        panel.add(btnArea);
        panel.add(btnPerimetro);
        panel.add(btnLimpiar);
        panel.add(txtHacer);
        setContentPane(panel);
        setVisible(true);
    }
//Boton Área
    private class Area extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            double val = 3.14;
            int diametro = Integer.parseInt(txtRadio.getText());
            int radio = Integer.parseInt(txtDiametro.getText());
            lblResultado.setText(" = " + (val ) *(radio*radio));

        }
    }
//Boton perimetro
    private class Perimetro extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            double val = 3.14;
            
            int diametro = Integer.parseInt(txtRadio.getText());
            lblResultado.setText(" = " + (val * diametro));
        }
    }
    //Boton limpiar
     public class Limpiar extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            txtDiametro.setText("");
            txtRadio.setText("");
            lblResultado.setText("");
        }
    }

}
