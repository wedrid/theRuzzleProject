/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruzzle;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;

/**
 *
 * @author grappolini.edoardo
 */
public class Finestra extends JFrame{
    
    
    
    public Finestra(){
        Ruzzle.genLayout = new PannelloLayoutGenerale();
        this.setTitle("Ruzzello");
        this.setSize(Ruzzle.larghezzaFinestra, 700);
        this.setLocation(50, 50);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        this.add(Ruzzle.genLayout);
        //this.setResizable(false);
        
        
        
        //this.setUndecorated(true);
        
        
        this.setVisible(true);
    }
    
}
