/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruzzle;

import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author grappolini.edoardo
 */
public class PannelloBasso extends JPanel{
    public PannelloBasso(){
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        Ruzzle.lettera = new JLabel();
        Ruzzle.lettera.setText("Lettera");
        Ruzzle.labelParola.setText("Parola");
        this.setBackground(Color.CYAN);
        this.add(Ruzzle.lettera);
        this.add(Ruzzle.labelParola);
    
    }
    
}
