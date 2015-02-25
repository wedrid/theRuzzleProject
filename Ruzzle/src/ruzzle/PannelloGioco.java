/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruzzle;

import java.awt.GridLayout;
import static java.awt.SystemColor.window;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.util.Random;

/**
 *
 * @author grappolini.edoardo
 */
public class PannelloGioco extends JPanel{
    public PannelloGioco(){
        
        Random r = new Random();
        int j = 0;
        char[] caratteri = new char[16];
        for(int i = 0; i<16; i++){
            caratteri[i] = (char)(r.nextInt(26) + 'A');
        }
        
        this.setLayout(new GridLayout(4, 4, 30, 30));
        //this.setSize(600, 600);
        
        for(int column = 0; column <4; column++){
            for(int row = 0; row <4; row++){
                Ruzzle.matrix[column][row] = new PulsantiLettere(caratteri[j]);
                this.add(Ruzzle.matrix[column][row]);
                Ruzzle.matrix[column][row].ID = j;
                System.out.println(Ruzzle.matrix[column][row].ID);
                j++;
            }
        }
        
        
        
        
        
        
    }
}

                
            
        
        
        
                
        /*
        this.add(new PulsantiLettere());
        this.add(new PulsantiLettere());
        this.add(new PulsantiLettere());
        this.add(new PulsantiLettere());
        this.add(new PulsantiLettere());
        this.add(new PulsantiLettere());
        this.add(new PulsantiLettere());
        this.add(new PulsantiLettere());
        this.add(new PulsantiLettere());
        this.add(new PulsantiLettere());
        this.add(new PulsantiLettere());
        this.add(new PulsantiLettere());
        this.add(new PulsantiLettere());
        this.add(new PulsantiLettere());
        this.add(new PulsantiLettere());
        this.add(new PulsantiLettere());
        this.add(new PulsantiLettere());
        this.add(new PulsantiLettere());
        this.add(new PulsantiLettere());
        this.add(new PulsantiLettere());
        this.add(new PulsantiLettere());
        this.add(new PulsantiLettere());
        this.add(new PulsantiLettere());
        this.add(new PulsantiLettere());
        this.add(new PulsantiLettere());
        */
        
        
        
        
        
    
            

