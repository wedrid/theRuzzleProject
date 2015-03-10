/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruzzle;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static java.lang.Math.abs;
import javax.swing.JButton;

/**
 *
 * @author grappolini.edoardo
 */
public class ListenerTrascinamento implements MouseListener{

    static boolean isPressed = false;
    static int contatore = 0;
    String stringa = null;
    static int[] IDKeeper = new int[16];
    static int currentRow = 0;
    static int currentColumn = 0;
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Ruzzle.parola = "";
        for(int i = 0; i<16; i++)
            IDKeeper[i] = 0;
        contatore = 0;
        isPressed = true;
        PulsantiLettere pulsante = (PulsantiLettere) e.getSource();
        Ruzzle.caratteriPresi[contatore] = pulsante.getText();
        Ruzzle.lettera.setText(Ruzzle.caratteriPresi[contatore]);
        Ruzzle.parola = Ruzzle.parola + Ruzzle.caratteriPresi[contatore]; //Crea progressivamente la stringa
       
        
        IDKeeper[contatore] = pulsante.ID;
        contatore++;
        
        currentRow = pulsante.row;
        currentColumn = pulsante.column;
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        isPressed = false;
        for(int i = 0; i<16; i++){
            stringa = ""+Ruzzle.caratteriPresi[i];
        }
        System.out.println(Ruzzle.parola);
        Ruzzle.labelParola.setText(Ruzzle.parola);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        PulsantiLettere pulsante = (PulsantiLettere) e.getSource();
        
        System.out.println("Diff. abs colonna = "+ abs(currentColumn - pulsante.column));
        System.out.println("Diff. abs riga = "+ abs(currentRow - pulsante.row));
        //Controllo che l'utente non possa saltare un pulsante
        if(!(abs(currentColumn - pulsante.column) == 1 || abs(currentColumn - pulsante.column) == 0))
            return;
        if(!(abs(currentRow - pulsante.row) == 1 || abs(currentRow - pulsante.row) == 0))
            return;
        
        //Controlla se è già passato da un pulsante, lo controlla anche se !mousePressed ma tanto non importa
        for(int i = 0; i<16; i++){
            if(pulsante.ID == IDKeeper[i]){
                //System.out.println("Fora!");
                return;
            }
        }
        if(isPressed == true){
            char c;
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
                //System.out.println("Fora!");
                return;
            }
        }
        
        currentColumn = pulsante.column;
        currentRow = pulsante.row;
        IDKeeper[contatore] = pulsante.ID;
        
        System.out.println(IDKeeper[contatore]);
        contatore++;
        
    }
    
}