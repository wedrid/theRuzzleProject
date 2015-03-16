/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ruzzle;

import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 *
 * @author EdoardoWijaya
 */
public class PannelloLayoutGenerale extends JPanel{
    PannelloLayoutGenerale(){
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        PannelloGiocoSuperiore pannelloSup = new PannelloGiocoSuperiore();
        //pannelloSup.setPreferredSize(new Dimension(Ruzzle.larghezzaFinestra, 10));
        this.add(pannelloSup);
        
        this.add(Ruzzle.labelTempo);
        
        Ruzzle.pannelloGioco = new PannelloGioco();
        
        this.add(Ruzzle.pannelloGioco);
        this.add(new PannelloBasso());
    
    
    }
}
