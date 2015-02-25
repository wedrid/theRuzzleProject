/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ruzzle;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 *
 * @author EdoardoWijaya
 */
public class PannelloLayoutGenerale extends JPanel{
    PannelloLayoutGenerale(){
        
        Ruzzle.pannelloGioco = new PannelloGioco();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(Ruzzle.pannelloGioco);
        
    
    
    }
}
