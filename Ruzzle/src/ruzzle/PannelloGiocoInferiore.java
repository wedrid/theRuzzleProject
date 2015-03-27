/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruzzle;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author grappolini.edoardo
 */
public class PannelloGiocoInferiore extends JPanel{
    public PannelloGiocoInferiore(){
        this.setLayout(new BorderLayout());
        Ruzzle.labelParola.setText("Parola");
        Ruzzle.labelParola.setFont(new Font("Sans Serif", Font.PLAIN, 20));
        this.setBackground(Color.CYAN);
        Ruzzle.labelParola.setAlignmentX(JLabel.CENTER);
        
        this.add(Ruzzle.labelParola, BorderLayout.CENTER);
        this.add(Ruzzle.labelTempo, BorderLayout.EAST);
    
    }
    
}
