/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruzzle;

import javax.swing.JButton;

/**
 *
 * @author grappolini.edoardo
 */
public class PulsantiLettere extends JButton{
    public PulsantiLettere(char c){
        
            this.setText(""+c);
            
            ListenerTrascinamento listener = new ListenerTrascinamento();
            
            this.addMouseListener(listener);
            
            
        }
    
}
