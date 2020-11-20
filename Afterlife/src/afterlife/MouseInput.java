package afterlife;

import java.awt.event.*;
import java.awt.*;
import static java.awt.event.MouseEvent.*;
import javax.swing.*;

/**
 *
 * @author 
 */

//Uses BlankArea.java
class BlankArea extends JLabel {
    Dimension minSize = new Dimension(1000, 1000);

    public BlankArea(Color color) {
        setBackground(color);
        setOpaque(true);
        setBorder(BorderFactory.createLineBorder(Color.black));
    }
    
    @Override
    public Dimension getMinimumSize() {
        return minSize;
    }
    
    @Override
    public Dimension getPreferredSize() {
        return minSize;
    }
}
// MouseMotionEvent



public class MouseInput extends JPanel implements MouseListener {
     
    @Override
    public void mouseClicked(MouseEvent e) {
        int eventType = e.getModifiersEx();
        
        if ((eventType & MOUSE_CLICKED) > 0) {
            System.out.println("hi");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}