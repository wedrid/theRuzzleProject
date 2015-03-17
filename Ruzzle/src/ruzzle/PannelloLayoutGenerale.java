/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ruzzle;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 *
 * @author EdoardoWijaya
 */
public class PannelloLayoutGenerale extends JPanel{
    PannelloLayoutGenerale(){
        this.setLayout(new BorderLayout());
        PannelloGiocoSuperiore pannelloSup = new PannelloGiocoSuperiore();
        //pannelloSup.setPreferredSize(new Dimension(Ruzzle.larghezzaFinestra, 10));
        this.add(pannelloSup, BorderLayout.NORTH);
        
        
        
        Ruzzle.pannelloGioco = new PannelloGioco();
        
        this.add(Ruzzle.pannelloGioco, BorderLayout.CENTER);
        this.add(new PannelloBasso(), BorderLayout.SOUTH);
    
    
    }
}
