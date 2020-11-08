package afterlife;
import java.awt.Component;
import java.awt.event.*;

public class InputHandler implements KeyListener {
    /**
     * Assigns InputHandler to a Component
     * @param c Component to get input from
     */
    boolean keys[] = new boolean[256];
    public InputHandler(Component c) {
        c.addKeyListener(this);
    }
    /**
     * 
     * @param keyCode
     * @return Whether the key is pressed or not
     */
    public boolean isKeyDown(int keyCode) {
        
        if (keyCode > 0 && keyCode < 256) {
            return keys[keyCode];
        }
        
        return false;
    }
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() > 0 && e.getKeyCode() < 256) {
            keys[e.getKeyCode()] = true;
        }
    }
    
    /**
     *
     * @param e
     */
    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() > 0 && e.getKeyCode() < 256) {
            keys[e.getKeyCode()] = false;
        }
    }

    /**
     *
     * @param e
     */
    @Override
    public void keyTyped (KeyEvent e){}
}
