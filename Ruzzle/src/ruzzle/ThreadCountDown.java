/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruzzle;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author grappolini.edoardo
 */
public class ThreadCountDown implements Runnable{
    private int tempo = 0;
    private int minuti = 0;
    private int secondi = 0;
    @Override
    public void run() {
        for(tempo = 120; tempo > 0; tempo--){
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadCountDown.class.getName()).log(Level.SEVERE, null, ex);
            }
            minuti = tempo/60;
            secondi = tempo - (minuti*60);
            Ruzzle.labelTempo.setText("Tempo rimanente: " + minuti + ":" + secondi);
        }
    }
    
    
}
