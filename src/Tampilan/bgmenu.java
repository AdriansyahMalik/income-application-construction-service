/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampilan;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author ASUS
 */
public class bgmenu extends JPanel {
    private Image b1;
    
    public bgmenu() {
        b1 = new ImageIcon(getClass().getResource("/gambar/b1.jpg")).getImage();
    }
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        
        Graphics2D gd = (Graphics2D) grphcs.create();
        gd.drawImage(b1, 0, 0, getWidth(), getHeight(), null);
        gd.dispose();
    }
    
    
}
