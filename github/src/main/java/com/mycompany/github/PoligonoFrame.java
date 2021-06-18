
package com.mycompany.github;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PoligonoFrame extends JFrame {
    public PoligonoFrame(){
        cargarComponentes();
        
    }
    private JPanel panel;
    private JTextField txtNum1,txtNum2,txtNum3;
    private JButton btnArea, btnPerimetro,btnApotema;
    private JLabel lblResultado ;
    
    private void cargarComponentes(){
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        txtNum1 = new JTextField("0",10);
        txtNum1.setFocusable(true);
        txtNum1.setBackground(Color.orange);
        
        txtNum2 = new JTextField("0",10);
        txtNum2.setBackground(Color.GREEN);
        
        txtNum3 = new JTextField("0",10);
        txtNum3.setFocusable(true);
        
        lblResultado = new JLabel();
        
        btnArea = new JButton("Perimetro");
        btnArea.addMouseListener(new Perimetro());
        
        btnPerimetro = new JButton("Area");
        btnPerimetro.addMouseListener(new Area());
        
         panel=new JPanel();
        panel.add(txtNum1);
        panel.add(txtNum2);
        panel.add(txtNum3);
        panel.add(lblResultado);
        panel.add(btnArea);
        panel.add(btnPerimetro);
        setContentPane(panel);
        setVisible(true);
    }
 private class Perimetro extends MouseAdapter{
        public void mouseClicked(MouseEvent e){
           int lado = Integer.parseInt (txtNum1.getText());
            int Numlado = Integer.parseInt (txtNum2.getText());
            lblResultado.setText (" = " +(lado*Numlado)+"cm");

}
 }

private class Area extends MouseAdapter{
        public void mouseClicked(MouseEvent e){
            int resp;
            int lado = Integer.parseInt (txtNum1.getText());
            int Numlado = Integer.parseInt (txtNum2.getText());
            int Perimetro = Integer.parseInt (txtNum1.getText());
            int Apotema= Integer.parseInt (txtNum3.getText());
            resp=Perimetro*Numlado;
            lblResultado.setText (" = " +(resp*Apotema)/2+"cm");
}
}
}
