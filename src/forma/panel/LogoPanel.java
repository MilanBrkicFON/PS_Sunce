/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forma.panel;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Milan
 */
public class LogoPanel  extends JPanel{

    public LogoPanel() {
       
        
    }

    public JPanel createBackgroundPanel() {
        return new JPanel() {
            BufferedImage image;
            {
                try {
                    image = ImageIO.read(new File("jpg/Sun2.png"));
                } catch (IOException ex) {
                }
            }
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(450, 250);
            }
        };
    }
    
    
}
