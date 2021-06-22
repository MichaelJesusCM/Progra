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
public class TrapecioFrame extends JFrame {

    public TrapecioFrame() {
        cargarComponentes();

    }
    private JPanel panel;
    private JTextField txtBaseM, txtBasem, txtLado, txtAltura, txtHacer;
    private JButton btnArea, btnPerimetro, btnLimpiar;
    private JLabel lblResultado;

    private void cargarComponentes() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 500);
        setTitle("Trapecios");

        txtBaseM = new JTextField("", 5);
        txtBaseM.setFocusable(true);
        txtBaseM.setBackground(Color.yellow);

        txtBasem = new JTextField("", 5);
        txtBasem.setBackground(Color.green);

        txtLado = new JTextField("", 5);
        txtLado.setBackground(Color.cyan);

        txtAltura = new JTextField("", 5);
        txtAltura.setBackground(Color.lightGray);

        lblResultado = new JLabel();

        btnArea = new JButton("Perimetro");
        btnArea.addMouseListener(new Perimetro());

        btnPerimetro = new JButton("Area");
        btnPerimetro.addMouseListener(new Area());
        
        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addMouseListener(new Limpiar());
        
        txtHacer = new JTextField("Ingrese Primero la Base Mayor, después la Base Menor, luego el Lado y la Altura");

        panel = new JPanel();
        panel.add(txtBaseM);
        panel.add(txtBasem);
        panel.add(txtLado);
        panel.add(txtAltura);
        panel.add(lblResultado);
        panel.add(btnArea);
        panel.add(btnPerimetro);
        panel.add(btnLimpiar);
        panel.add(txtHacer);
        setContentPane(panel);
        setVisible(true);
    }

    private class Area extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            int baseM = Integer.parseInt(txtAltura.getText());
            int basem = Integer.parseInt(txtBaseM.getText());
            int altura = Integer.parseInt(txtBasem.getText());
            lblResultado.setText(" = " + ( altura * (baseM + basem) ) / 2);

        }
    }

    private class Perimetro extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            int baseM = Integer.parseInt(txtBaseM.getText());
            int basem = Integer.parseInt(txtBasem.getText());
           
            int lado = Integer.parseInt(txtLado.getText());
            lblResultado.setText(" = " + (baseM + basem + lado + lado));
        }
    }
    
     public class Limpiar extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            txtBaseM.setText("");
            txtBasem.setText("");
            txtAltura.setText("");
            txtLado.setText("");
            lblResultado.setText("");
           
        }
    }

}
