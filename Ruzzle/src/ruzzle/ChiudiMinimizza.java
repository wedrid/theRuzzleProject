/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruzzle;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author EdoardoWijaya
 */
public class ChiudiMinimizza extends JPanel{
    public ChiudiMinimizza(){
        this.setBackground(Color.WHITE);
        Dimension dimensione = new Dimension(12,12);
        JPanel subPannello = new JPanel();
        this.setLayout(new BorderLayout());
        JButton chiudi = new JButton();
        JButton minimizza = new JButton();
        
        chiudi.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        minimizza.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Ruzzle.finestra.setState(JFrame.ICONIFIED);
            }
        });
        
        Icon minimizeIcon = new ImageIcon("minimize.png");
        minimizza.setIcon(minimizeIcon);
        minimizza.setPreferredSize(dimensione);
        minimizza.setOpaque(false);
        minimizza.setBorderPainted(false);
        minimizza.setContentAreaFilled(false);
        subPannello.add(minimizza);
        
        chiudi.setOpaque(false);
        chiudi.setContentAreaFilled(false);
        chiudi.setBorderPainted(false);
        chiudi.setPreferredSize(dimensione);
        
        Icon closeIcon = new ImageIcon("close-icon.png");
        chiudi.setIcon(closeIcon);
        chiudi.setAlignmentX(RIGHT_ALIGNMENT);
        subPannello.add(chiudi);
        
        
        this.add(subPannello, BorderLayout.EAST);
        //Non funziona
        this.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
                double x = (e.getLocationOnScreen().getX() - Ruzzle.finestra.getLocationOnScreen().getX());
                double y = (e.getLocationOnScreen().getY() - Ruzzle.finestra.getLocationOnScreen().getY());
                Ruzzle.finestra.setLocation((int) x,(int) y);
            }

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });
        
    }
    
}
