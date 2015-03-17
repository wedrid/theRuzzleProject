/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ruzzle;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author EdoardoWijaya
 */
public class SchermataIniziale extends JPanel{
    SchermataIniziale(){
        Box box = Box.createVerticalBox();
        this.add(box);
        BottoneIniziali start = new BottoneIniziali("Inizia");
        BottoneIniziali opzioni = new BottoneIniziali("Opzioni");
        BottoneIniziali esci = new BottoneIniziali("Esci");
        
        box.add(Box.createVerticalStrut(100));
        box.add(start);
        box.add(Box.createVerticalStrut(30)); //spaziamento
        box.add(opzioni);
        box.add(Box.createVerticalStrut(30)); //spaziamento
        box.add(esci);
        
    }
}
