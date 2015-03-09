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

    public static String[] caratteriPresi = new String[16];
    
    public static PulsantiLettere[][] matrix = new PulsantiLettere[5][5];;
    
    public static Finestra finestra;
    
    public static PannelloGioco pannelloGioco;
    
    public static PannelloLayoutGenerale genLayout;
    
    public static JLabel lettera;
    
    public static String parola = new String();
    
    public static JLabel labelParola = new JLabel();
    
    
    public static void main(String[] args) {
        
        /*try {
            UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        
        matrix = new PulsantiLettere[4][4];
        
        finestra = new Finestra();
        
    }
    
}
