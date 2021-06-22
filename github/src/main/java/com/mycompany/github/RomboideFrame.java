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
public class RomboideFrame extends JFrame {

    public RomboideFrame() {
        cargarComponentes();

    }
    private JPanel panel;
    private JTextField txtBase, txtAltura, txtHacer;
    private JButton btnArea, btnPerimetro, btnLimpiar;
    private JLabel lblResultado;

    private void cargarComponentes() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 500);
        setTitle("Romboides");

        txtBase = new JTextField("", 10);
        txtBase.setFocusable(true);
        txtBase.setBackground(Color.cyan);

        txtAltura = new JTextField("", 10);
        txtAltura.setBackground(Color.green);

        lblResultado = new JLabel();

        btnArea = new JButton("Perimetro");
        btnArea.addMouseListener(new Perimetro());

        btnPerimetro = new JButton("Area");
        btnPerimetro.addMouseListener(new Area());
        
        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addMouseListener(new Limpiar());
        
        txtHacer = new JTextField("Ingrese Primero La Base y luego la Altura");

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
            int base = Integer.parseInt(txtBase.getText());
            int altura = Integer.parseInt(txtAltura.getText());
            lblResultado.setText(" = " + (base * altura));

        }
    }

    private class Perimetro extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            int base = Integer.parseInt(txtBase.getText());
            int altura = Integer.parseInt(txtAltura.getText());
            lblResultado.setText(" = " + (base + base + altura + altura));
        }
    }

    public class Limpiar extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            txtBase.setText("");
            txtAltura.setText("");
            lblResultado.setText("");
            txtBase.setFocusable(true);
            
        }
    }

}
