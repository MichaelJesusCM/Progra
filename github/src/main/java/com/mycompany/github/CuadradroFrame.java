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
    private JTextField txtNum1, txtNum2;
    private JButton btnArea, btnPerimetro;
    private JLabel lblResultado;

    private void cargarComponentes() {
        setSize(500, 500);

        txtNum1 = new JTextField("0", 10);
        txtNum1.setFocusable(true);
        txtNum1.setBackground(Color.BLUE);

        txtNum2 = new JTextField("0", 10);
        txtNum2.setBackground(Color.GREEN);

        lblResultado = new JLabel();

        btnArea = new JButton("Perimetro");
        btnArea.addMouseListener(new Perimetro());

        btnPerimetro = new JButton("Area");
        btnPerimetro.addMouseListener(new Area());

        panel = new JPanel();
        panel.add(txtNum1);
        panel.add(txtNum2);
        panel.add(lblResultado);
        panel.add(btnArea);
        panel.add(btnPerimetro);
        setContentPane(panel);
        setVisible(true);
    }

    private class Area extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            int lado1 = Integer.parseInt(txtNum2.getText());
            int lado = Integer.parseInt(txtNum2.getText());
            lblResultado.setText(" = " + (lado * lado1));

        }
    }

    private class Perimetro extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {
            int lado1 = Integer.parseInt(txtNum1.getText());
            int lado = Integer.parseInt(txtNum2.getText());
            lblResultado.setText(" = " + (lado1 * 4));
        }
    }
}
