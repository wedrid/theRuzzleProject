/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruzzle;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author grappolini.edoardo
 */
public class PannelloGiocoSuperiore extends JPanel{
    public PannelloGiocoSuperiore(){
        
        this.add(Ruzzle.labelTempo);
        this.setBackground(Color.CYAN);
        
        Ruzzle.lettera = new JLabel();
        Ruzzle.lettera.setFont(new Font("Sans Serif", Font.PLAIN, 20));
        Ruzzle.lettera.setText("Lettera");
        Ruzzle.lettera.setAlignmentX(JLabel.CENTER_ALIGNMENT);       
        
        this.add(Ruzzle.lettera);
        
    }
    
}
