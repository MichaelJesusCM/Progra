
package com.mycompany.github;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Cuadrado extends JFrame {
    public Cuadrado(){
        cargarComponentes();
        
        
    }
    private JPanel panel;
    private JTextField txtNum1, txtNum2,txtNum3, txtNum4;
    private JButton btnArea, btnPerimetro, btnLimpiar;
    private JLabel lblResultado;
    
    private void cargarComponentes(){
         setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        txtNum1 = new JTextField("0",10);
        txtNum1.setFocusable(true);
        
        txtNum2 = new JTextField("0",10);
        
        btnArea = new JButton("Area");
        
        btnPerimetro = new JButton("Perimetro");
        
        panel = new JPanel();
        panel.add(txtNum1);
        panel.add(txtNum2);
        panel.add(btnArea);
        panel.add(btnPerimetro);
        
        setContentPane(panel);
        setVisible(true);
    
}
}

