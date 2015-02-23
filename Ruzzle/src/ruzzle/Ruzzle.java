/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruzzle;

/**
 *
 * @author grappolini.edoardo
 */
public class Ruzzle {

    public static String[] caratteriPresi = new String[16];
    
    public static PulsantiLettere[][] matrix = new PulsantiLettere[5][5];;
    
    public static Finestra finestra;
    
    public static Pannello pannello;
    
    
    public static void main(String[] args) {
        matrix = new PulsantiLettere[4][4];
        
        finestra = new Finestra();
        
    }
    
}
