/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ruzzle;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import static ruzzle.Ruzzle.tempo;

/**
 *
 * @author EdoardoWijaya
 */
public class SchermataIniziale extends JPanel{
    SchermataIniziale(){
        Box box = Box.createVerticalBox();
        this.add(box);
        BottoneIniziali start = new BottoneIniziali("Inizia");
        start.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Ruzzle.genLayout = new PannelloLayoutGenerale();
                Ruzzle.finestra.add(Ruzzle.genLayout, BorderLayout.CENTER);
                Ruzzle.finestra.remove(Ruzzle.schermataIniziale);
                Ruzzle.finestra.validate();
                Ruzzle.finestra.repaint();
                tempo = new Thread(new ThreadCountDown());
                tempo.start();
            }
        });
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
