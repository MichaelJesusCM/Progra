/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasFRAME;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class FmrRomboide extends Frame{
    public FmrRomboide (){
        cargarComponentes();
        
    }
    
   
    private JPanel panel;
    private JTextField txtbase, txtAltura,txtLado;
    private JButton btnArea, btnPerimetro;
    private JLabel lblResultado;
    
    private void cargarComponentes(){
        setSize (400, 200);
        
        txtbase = new JTextField("0",10);
        txtbase.setFocusable(true);
        txtbase.setBackground(Color.white);
       
        
        txtAltura = new JTextField("0",10);
        txtAltura.setBackground(Color.WHITE);
        
         txtLado = new JTextField("0",10);
        txtLado.setBackground(Color.WHITE);
        
        lblResultado = new JLabel();
        
        btnArea = new JButton ("AREA ");
        btnArea. addMouseListener(new areRomboide());
         
        btnPerimetro = new JButton ("PERIMETRO");
        btnPerimetro. addMouseListener(new perimetroRomboide());
        
       
        panel = new JPanel();
        panel.add (txtbase);
        panel.add (txtAltura);
        panel.add(txtLado);
        panel.add (lblResultado);
        panel.add (btnArea);
        panel.add (btnPerimetro);
        
        setContentPane(panel);
        setVisible(true);
        
        
        
    }

    private void setContentPane(JPanel panel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
private class areRomboide extends MouseAdapter{
       public void mouseClicked(MouseEvent e){
       int base = Integer.parseInt(txtbase.getText());
       int altura = Integer.parseInt(txtAltura.getText());
       lblResultado.setText("="+(base*altura)+"cm");
    }
    
}
    
 private class perimetroRomboide extends MouseAdapter{
       public void mouseClicked(MouseEvent e){
       int base = Integer.parseInt(txtbase.getText());
       int altura = Integer.parseInt(txtAltura.getText());
       lblResultado.setText("="+(base+base+altura+altura)+"cm");
    }
    
}

}