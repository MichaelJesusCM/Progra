package com.mycompany.github;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class PoligonoFrame extends JFrame {

    public PoligonoFrame() {
        cargarComponentes();

    }
    private JPanel panel;
    private JTextField txtLado, txtNumLados, txtApotema, txtHacer;
    private JButton btnArea, btnPerimetro, btnLimpiar;
    private JLabel lblResultado;

    private void cargarComponentes() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 500);
        setTitle("Poligonos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        txtLado = new JTextField("", 5);
        txtLado.setFocusable(true);
        txtLado.setBackground(Color.orange);

        txtNumLados = new JTextField("", 5);
        txtNumLados.setBackground(Color.green);

        txtApotema = new JTextField("", 5);
        txtApotema.setBackground(Color.cyan);

        lblResultado = new JLabel();

        btnArea = new JButton("Perimetro");
        btnArea.addMouseListener(new Perimetro());

        btnPerimetro = new JButton("Area");
        btnPerimetro.addMouseListener(new Area());
        
        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addMouseListener(new Limpiar());

        txtHacer = new JTextField("Ingrese Primero El Lado, Luego el Número de Lados y después el Apotema ");

        panel = new JPanel();
        panel.add(txtLado);
        panel.add(txtNumLados);
        panel.add(txtApotema);
        panel.add(lblResultado);
        panel.add(btnArea);
        panel.add(btnPerimetro);
        panel.add(btnLimpiar);
        panel.add(txtHacer);
        setContentPane(panel);
        setVisible(true);
    }
    int resp;

    private class Perimetro extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            int Lado = Integer.parseInt(txtLado.getText());
            int Numlados = Integer.parseInt(txtNumLados.getText());
            lblResultado.setText(" = " + (Lado * Numlados));
            resp = Lado * Numlados;

        }
    }

    private class Area extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {

            int lado = Integer.parseInt(txtLado.getText());
            int Numlado = Integer.parseInt(txtNumLados.getText());
            int Apotema = Integer.parseInt(txtApotema.getText());

            lblResultado.setText(" = " + ((resp * Apotema) / 2));
        }
    }

    public class Limpiar extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            txtApotema.setText("");
            txtLado.setText("");
            txtNumLados.setText("");
            lblResultado.setText("");

        }
    }

}
