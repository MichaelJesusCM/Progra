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
public class RomboFrame extends JFrame {

    public RomboFrame() {
        cargarComponentes();

    }
    private JPanel panel;
    private JTextField txtDiametroM, txtDiametrom, txtLado, txtHacer;
    private JButton btnArea, btnPerimetro, btnLimpiar;
    private JLabel lblResultado;

    private void cargarComponentes() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 500);
        setTitle("Rombos");

        txtDiametroM = new JTextField("", 5);
        txtDiametroM.setFocusable(true);
        txtDiametroM.setBackground(Color.lightGray);

        txtDiametrom = new JTextField("", 5);
        txtDiametrom.setBackground(Color.green);

        txtLado = new JTextField("", 5);
        txtLado.setBackground(Color.cyan);

        lblResultado = new JLabel();

        btnArea = new JButton("Perimetro");
        btnArea.addMouseListener(new Perimetro());

        btnPerimetro = new JButton("Area");
        btnPerimetro.addMouseListener(new Area());
        
        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addMouseListener(new Limpiar());
        
        
        
        txtHacer = new JTextField("Ingrese primero el Diametro Mayor, luego el Diametro Menor y el Lado");
        

        panel = new JPanel();
        panel.add(txtDiametroM);
        panel.add(txtDiametrom);
        panel.add(txtLado);
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
            int DiametroMa = Integer.parseInt(txtDiametroM.getText());
            int Diametrome = Integer.parseInt(txtDiametrom.getText());
            lblResultado.setText(" = " + (DiametroMa * Diametrome));

        }
    }

    private class Perimetro extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            int lado = Integer.parseInt(txtLado.getText());
            lblResultado.setText(" = " + (lado * 4));
        }
    }

    public class Limpiar extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            txtDiametroM.setText("");
            txtDiametrom.setText("");
            txtLado.setText("");
            lblResultado.setText("");
        }
    }

}
