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
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TrianguloFrame extends JFrame {

    public TrianguloFrame() {
        cargarComponentes();
    }
    private JPanel panel;
    private JTextField txtNum1, txtNum2, txtNum3, txtNum4;
    private JButton btnArea, btnPerimetro, btnLimpiar;
    private JLabel lblResultado;

    private void cargarComponentes() {
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        txtNum1 = new JTextField("0", 10);
        txtNum1.setFocusable(true);

        txtNum2 = new JTextField("0", 10);

        lblResultado = new JLabel();

        btnArea = new JButton("Area");
        btnArea.addMouseListener(new Area());
        
        btnPerimetro = new JButton("Perimetro");
       /* btnPerimetro.addMouseListener(new Perimetro());*/

        panel = new JPanel();
        panel.add(txtNum1);
        panel.add(txtNum2);
        panel.add(btnArea);
        panel.add(btnPerimetro);
        panel.add(lblResultado);

        setContentPane(panel);
        setVisible(true);

    }

    private class Area extends MouseAdapter {

        public void mouseClicked(MouseEvent e) {

            int num1 = Integer.parseInt(txtNum1.getText());
            int num2 = Integer.parseInt(txtNum2.getText());
            lblResultado.setText("=" + ((num1 * num2) / 2));
        }

        private class Perimetro extends MouseAdapter {

            public void mouseClicked(MouseEvent e) {

                int num1 = Integer.parseInt(txtNum1.getText());
                int num2 = Integer.parseInt(txtNum2.getText());
                lblResultado.setText("=" + (num1 + num2 + num1));
            }

        }
    }
}
