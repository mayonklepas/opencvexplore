/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package opencveplore;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author mulyadi
 */
public class ImageSetter extends Canvas {
    
    String imageSrc;
    
    JPanel panel;

    public ImageSetter(String imageSrc,JPanel panel) {
        this.imageSrc = imageSrc;
        this.panel = panel;
    }
   
    @Override
    public void paint(Graphics g) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Image img = tk.getImage(imageSrc);
        g.drawImage(img, 400, 400, panel);
    }

}
