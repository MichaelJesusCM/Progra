/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.github;

/**
 *
 * @author PC
 */
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class TrianguloFrame extends JFrame {

    public TrianguloFrame() {
        cargarComponentes();
    }
    private JPanel panel;
    private JTextField txtBase, txtAltura, txtLado, txtHacer;
    private JButton btnArea, btnPerimetro, btnLimpiar;
    private JLabel lblResultado;

    private void cargarComponentes() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setTitle("Triangulos");
        
        txtBase = new JTextField("", 10);
        txtBase.setBackground(Color.cyan);
        txtBase.setFocusable(true);

        txtAltura = new JTextField("", 10);
        txtAltura.setBackground(Color.green);
        
        txtLado = new JTextField("", 10);
        txtLado.setBackground(Color.yellow);
        
        lblResultado = new JLabel();
        

        btnArea = new JButton("Area");
        btnArea.addMouseListener(new Area());
        
        btnPerimetro = new JButton("Perimetro");
        btnPerimetro.addMouseListener(new Perimetro());
        
        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addMouseListener(new Limpiar());
        txtHacer = new JTextField("Ingrese Pimero la Base y luego la Altura");

        panel = new JPanel();
        panel.add(txtBase);
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

            int num1 = Integer.parseInt(txtBase.getText());
            int num2 = Integer.parseInt(txtAltura.getText());
            lblResultado.setText("=" + ((num1 * num2) / 2));
        }
    }

        private class Perimetro extends MouseAdapter {

            public void mouseClicked(MouseEvent e) {

                int num1 = Integer.parseInt(txtBase.getText());
                int num2 = Integer.parseInt(txtAltura.getText());
                lblResultado.setText("=" + (num1 + num2 + num1));
            }

        }
        
        public class Limpiar extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            txtBase.setText("");
            txtAltura.setText("");
            txtLado.setText("");
            lblResultado.setText("");
            
        }
    }
    }

