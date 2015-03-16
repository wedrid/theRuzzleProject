/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruzzle;

import java.awt.Color;
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
        int j = 0, k = 1;
        char[] caratteri = new char[16];
        for(int i = 0; i<16; i++){
            caratteri[i] = (char)(r.nextInt(26) + 'A');
        }
        
        this.setLayout(new GridLayout(Ruzzle.colonne, Ruzzle.righe, 30, 30));
        //this.setSize(600, 600);
        this.setBackground(Color.GRAY);
        
        
        //QUI!!! Metto gli ID ai pulsanti
        for(int column = 0; column < Ruzzle.colonne; column++){
            for(int row = 0; row < Ruzzle.righe; row++){
                Ruzzle.matrix[column][row] = new PulsantiLettere(caratteri[j]);
                this.add(Ruzzle.matrix[column][row]);
                Ruzzle.matrix[column][row].ID = k;
                System.out.println(Ruzzle.matrix[column][row].ID);
                j++;
                k++;
                Ruzzle.matrix[column][row].row = row;
                Ruzzle.matrix[column][row].column = column;
                Ruzzle.matrix[column][row].setBackground(Color.WHITE);
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
        
        
        
        
        
    
            

