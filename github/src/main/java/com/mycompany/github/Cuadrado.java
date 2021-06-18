
package com.mycompany.github;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
        
        lblResultado = new JLabel();
        
        btnArea = new JButton("Area");
        btnArea.addMouseListener(new AreaCu());
        
        btnPerimetro = new JButton("Perimetro");
        btnPerimetro.addMouseListener(new PerimetroCu());
        
        panel = new JPanel();
        panel.add(txtNum1);
        panel.add(txtNum2);
        panel.add(btnArea);
        panel.add(btnPerimetro);
        panel.add(lblResultado);
        
        
        setContentPane(panel);
        setVisible(true);
    
}
     private class AreaCu extends MouseAdapter{
     public void mouseClicked(MouseEvent e){
     
         int num1 =Integer.parseInt(txtNum1.getText());
         int num2 =Integer.parseInt(txtNum2.getText());
         lblResultado.setText("="+(num1*num2));
     } 

}
   private class PerimetroCu extends MouseAdapter{
     public void mouseClicked(MouseEvent e){
     
         int num1 =Integer.parseInt(txtNum1.getText());
         int num2 =Integer.parseInt(txtNum2.getText());
         lblResultado.setText("="+(num1+num2+num1+num2));
     } 

}   
}
