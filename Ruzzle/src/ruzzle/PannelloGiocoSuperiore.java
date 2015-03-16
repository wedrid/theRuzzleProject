/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruzzle;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author grappolini.edoardo
 */
public class PannelloGiocoSuperiore extends JPanel{
    public PannelloGiocoSuperiore(){
        this.setPreferredSize(new Dimension(Ruzzle.larghezzaFinestra, 1));
        this.setBackground(Color.BLUE);
    }
    
}
