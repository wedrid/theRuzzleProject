/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ruzzle;

import javax.swing.JFrame;

/**
 *
 * @author EdoardoWijaya
 */
public class FinestraBancoProva extends JFrame{
    FinestraBancoProva(){
        this.setSize(500, 500);
        this.add(new SchermataIniziale());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
}
