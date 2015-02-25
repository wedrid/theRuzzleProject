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
        for(int i = 0; i<16; i++)
            IDKeeper[i] = 0;
        contatore = 0;
        pressed = true;
        PulsantiLettere pulsante = (PulsantiLettere) e.getSource();
        Ruzzle.caratteriPresi[contatore] = pulsante.getText();
        System.out.println("Carattere: " + Ruzzle.caratteriPresi[contatore]);
        contatore++;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        pressed = false;
        for(int i = 0; i<16; i++){
            stringa = ""+Ruzzle.caratteriPresi[i];
        }
        System.out.println(stringa);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(pressed == true){
            JButton pulsante = (JButton) e.getSource();
            Ruzzle.caratteriPresi[contatore] = pulsante.getText();
            System.out.println("Carattere: " + Ruzzle.caratteriPresi[contatore]);
            contatore++;
        }
        else{
            return;
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}