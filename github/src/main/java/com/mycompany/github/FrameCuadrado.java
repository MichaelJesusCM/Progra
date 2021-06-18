package com.mycompany.github;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class FrameCuadrado extends JFrame {
    
     public FrameCuadrado(){
    cargarComponentes2();
    }
     private JPanel panel;
    private JTextField txtNum1, txtNum2,txtNum3, txtNum4;
    private JButton btnArea, btnPerimetro, btnLimpiar;
    private JLabel lblResultado;
    
    private void cargarComponentes2(){
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
    private class Sumar extends MouseAdapter{
     public void mouseClicked(MouseEvent e){
     
         int num1 =Integer.parseInt(txtNum1.getText());
         int num2 =Integer.parseInt(txtNum2.getText());
         lblResultado.setText("="+(num1+num2));
     } 
}
}