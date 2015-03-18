/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruzzle;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author grappolini.edoardo
 */
public class SchermataFinale extends JPanel{
    public SchermataFinale(){
        this.setLayout(new BorderLayout());
        this.add(new JButton("Pippo"), BorderLayout.NORTH);
        Box boxLayout = Box.createVerticalBox();
                
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane jsp = new JScrollPane(boxLayout,v, h);
        
        int contatoreVettoreParole = 0;
        System.out.println("" + Ruzzle.parole[0]);
        
        while(Ruzzle.parole[contatoreVettoreParole] != null){
            JLabel label = new JLabel(Ruzzle.parole[contatoreVettoreParole]);
            label.setFont(new Font("Times New Roman", Font.BOLD, 21));
            boxLayout.add(label);
            System.out.println(Ruzzle.parole[contatoreVettoreParole]);
            contatoreVettoreParole++;
            
        }
        
        this.add(jsp, BorderLayout.CENTER);
        
    }
    
}
