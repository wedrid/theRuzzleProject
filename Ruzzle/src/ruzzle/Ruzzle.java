/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruzzle;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author grappolini.edoardo
 */
public class Ruzzle {
    
    //Il numero di righe e colonne dev'essere uguale onde evitare errori matematici
    
    public static int righe = 5;
    
    public static int colonne = 4;
    
    public static int totaleCaratteri;

    public static String[] caratteriPresi;
    
    public static PulsantiLettere[][] matrix;
    
    public static Finestra finestra;
    
    public static PannelloGioco pannelloGioco;
    
    public static PannelloLayoutGenerale genLayout;
    
    public static JLabel lettera;
    
    public static String parola = new String();
    
    public static JLabel labelParola = new JLabel();
    
    public static JLabel labelTempo = new JLabel();
    
    public static Thread tempo;
    
    public static int larghezzaFinestra = 700;
    
    public static void main(String[] args) {
        
        totaleCaratteri = righe * colonne;
        matrix = new PulsantiLettere[righe][colonne];;
        
        tempo = new Thread(new ThreadCountDown());
        tempo.start();
        
        /*try {
            UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        
        matrix = new PulsantiLettere[righe][colonne];
        caratteriPresi = new String[totaleCaratteri];
        
        finestra = new Finestra();
        
    }
    
}
