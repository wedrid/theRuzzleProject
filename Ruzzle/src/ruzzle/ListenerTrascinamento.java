/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruzzle;

import java.awt.Color;
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
    static int[] IDKeeper = new int[Ruzzle.totaleCaratteri+1];
    static int currentRow = 0;
    static int currentColumn = 0;
    static int contatoreVettoreParole = 0;
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Ruzzle.parola = "";
        //Azzero il vettore con gli id in cui si è già passati
        for(int i = 0; i<Ruzzle.totaleCaratteri; i++)
            IDKeeper[i] = 0;
        contatore = 0;
        isPressed = true;
        PulsantiLettere pulsante = (PulsantiLettere) e.getSource();
        Ruzzle.caratteriPresi[contatore] = pulsante.getText();
        Ruzzle.lettera.setText(Ruzzle.caratteriPresi[contatore]);
        Ruzzle.parola = Ruzzle.parola + Ruzzle.caratteriPresi[contatore]; //Crea progressivamente la stringa
       
        pulsante.setBackground(Color.ORANGE);
        
        IDKeeper[contatore] = pulsante.ID;
        contatore++;
        
        currentRow = pulsante.row;
        currentColumn = pulsante.column;
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        isPressed = false;
        
        System.out.println(Ruzzle.parola);
        
        
        Ruzzle.parole[contatoreVettoreParole] = Ruzzle.parola;
        contatoreVettoreParole++;
        Ruzzle.labelParola.setText(Ruzzle.parola);
        for(int row = 0; row < Ruzzle.righe; row++){
            for(int column = 0; column < Ruzzle.colonne; column++){
                Ruzzle.matrix[row][column].setBackground(Color.WHITE);
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        PulsantiLettere pulsante = (PulsantiLettere) e.getSource();
        
        //System.out.println("Diff. abs colonna = "+ abs(currentColumn - pulsante.column));
        //System.out.println("Diff. abs riga = "+ abs(currentRow - pulsante.row));
        //Controllo che l'utente non possa saltare un pulsante

        
        //Controlla se è già passato da un pulsante, lo controlla anche se !mousePressed ma tanto non importa
        for(int i = 0; i<Ruzzle.totaleCaratteri; i++){
            if(pulsante.ID == IDKeeper[i]){
                //System.out.println("Fora!");
                return;
            }
        }
        if(isPressed == true){
            System.out.println("Diff. colonne: " + abs(currentColumn - pulsante.column) + "Diff. righe" + abs(currentRow - pulsante.row));
            if(!(abs(currentColumn - pulsante.column) == 1 || abs(currentColumn - pulsante.column) == 0))
                return;
            if(!(abs(currentRow - pulsante.row) == 1 || abs(currentRow - pulsante.row) == 0))
                return;
            pulsante.setBackground(Color.ORANGE);
            char c;
            Ruzzle.caratteriPresi[contatore] = pulsante.getText();
            Ruzzle.lettera.setText(pulsante.getText());
            Ruzzle.parola = Ruzzle.parola + pulsante.getText();
            currentColumn = pulsante.column;
            currentRow = pulsante.row;
            IDKeeper[contatore] = pulsante.ID;
            contatore++;

        }
        else{
            return;
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
        PulsantiLettere pulsante = (PulsantiLettere) e.getSource();
        //System.out.println(IDKeeper[contatore]);
        
        
    }
    
}