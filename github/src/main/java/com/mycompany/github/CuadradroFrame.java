package com.mycompany.github;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class CuadradroFrame extends JFrame {

    public CuadradroFrame() {
        cargarComponentes();

    }
    private JPanel panel;
    private JTextField txtLado, txtHacer;
    private JButton btnArea, btnPerimetro, btnLimpiar;
    private JLabel lblResultado;

    private void cargarComponentes() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 500);
        setTitle("Cuadrado");

        txtLado = new JTextField("", 10);
        txtLado.setBackground(Color.cyan);

        lblResultado = new JLabel();

        btnArea = new JButton("Perimetro");
        btnArea.addMouseListener(new Perimetro());

        btnPerimetro = new JButton("Area");
        btnPerimetro.addMouseListener(new Area());
        
        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addMouseListener(new Limpiar());
        
        txtHacer = new JTextField("Debe ingresar el Lado");
        
        panel = new JPanel();
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

            int lado = Integer.parseInt(txtLado.getText());
            lblResultado.setText(" = " + (lado * lado));

        }
    }

    private class Perimetro extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            int lado = Integer.parseInt(txtLado.getText());

            lblResultado.setText(" = " + (lado * 4));
        }
    }
    ///boton limpiar
    public class Limpiar extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            txtLado.setText("");
            lblResultado.setText("");
            
        }
    }
}
