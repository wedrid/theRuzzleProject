/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruzzle;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author grappolini.edoardo
 */
public class PulsantiLettere extends JButton{
    public int ID = 0;
    public int row = 0;
    public int column = 0;
    private char carattere;
    public PulsantiLettere(char c){
            //ImageIcon iconaPulsante = new ImageIcon("pulsante.png");
            
            this.setText(""+c);
            carattere = c;
            ListenerTrascinamento listener = new ListenerTrascinamento();
            this.setAlignmentX(Component.CENTER_ALIGNMENT);
            this.setAlignmentY(Component.CENTER_ALIGNMENT);
            
            
            //this.setIcon(iconaPulsante);
            
            this.addMouseListener(listener);
        }
    
    /*public void paintComponent(Graphics g){
        Graphics2D graph2 = (Graphics2D)g;
        graph2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        /* UTILIZZA TROPPE RISORSE
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("pulsante.png"));
        } catch (IOException e) {
        }        
        g.drawImage(img, 0, 0, this.getHeight(), this.getWidth(), this);
        
        */
        /*
        Shape rettangoloArrotondato = new RoundRectangle2D.Double(0, 0, this.getWidth(), this.getHeight(), 45, 45);
        graph2.setColor(Color.BLUE);
        graph2.fill(rettangoloArrotondato);
        graph2.setColor(Color.WHITE);
        graph2.draw(rettangoloArrotondato);
        Font font=new Font("Helvetica",Font.PLAIN,30);
        graph2.setFont(font);
        
        graph2.drawString("" + carattere, this.getHeight()/2-7, this.getWidth()/2+7);
        
    }*/
}
