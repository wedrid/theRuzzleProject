/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruzzle;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

/**
 *
 * @author grappolini.edoardo
 */
public class ListenerTrascinamento implements MouseListener{

    static boolean pressed = false;
    static int contatore = 0;
    String stringa = null;
    static int[] IDKeeper = new int[16];
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Ruzzle.parola = "";
        for(int i = 0; i<16; i++)
            IDKeeper[i] = 0;
        contatore = 0;
        pressed = true;
        PulsantiLettere pulsante = (PulsantiLettere) e.getSource();
        Ruzzle.caratteriPresi[contatore] = pulsante.getText();
        Ruzzle.lettera.setText(Ruzzle.caratteriPresi[contatore]);
        Ruzzle.parola = Ruzzle.parola + Ruzzle.caratteriPresi[contatore];
       
        
        IDKeeper[contatore] = pulsante.ID;
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        pressed = false;
        for(int i = 0; i<16; i++){
            stringa = ""+Ruzzle.caratteriPresi[i];
        }
        System.out.println(Ruzzle.parola);
        Ruzzle.labelParola.setText(Ruzzle.parola);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        PulsantiLettere pulsante = (PulsantiLettere) e.getSource();
        //Controlla se è già passato da un pulsante
        for(int i = 0; i<16; i++){
            if(pulsante.ID == IDKeeper[i]){
                System.out.println("Fora!");
                return;
            }
        }
        if(pressed == true){
            Ruzzle.caratteriPresi[contatore] = pulsante.getText();
            Ruzzle.lettera.setText(pulsante.getText());
            Ruzzle.parola = Ruzzle.parola + pulsante.getText();
            
        }
        else{
            return;
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
        PulsantiLettere pulsante = (PulsantiLettere) e.getSource();
        
        for(int i = 0; i<16; i++){
            if(pulsante.ID == IDKeeper[i]){
                System.out.println("Fora!");
                return;
            }
        }
        IDKeeper[contatore] = pulsante.ID;
        contatore++;
        
    }
    
}