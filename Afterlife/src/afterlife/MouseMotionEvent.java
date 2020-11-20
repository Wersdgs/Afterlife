package afterlife;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author hpro1-b
 */
public class MouseMotionEvent extends JPanel 
        implements MouseMotionListener {
        
    BlankArea blankArea;
    JTextArea textArea;
    static final String NEWLINE = System.getProperty("line.separator");
    
    /**
     *
     * @param args
     * @throws InstantiationException
     */
    public static void main(String []args) throws InstantiationException {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
        } catch (UnsupportedLookAndFeelException | IllegalAccessException | ClassNotFoundException ex) {
        }   
    }
    
    public MouseMotionEvent() {
        super(new GridLayout(0,1));
        blankArea = new BlankArea(Color.BLACK);
        add(blankArea);
        
        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setPreferredSize(new Dimension(200, 75));
        
        add(scrollPane);
        
        blankArea.addMouseMotionListener(this);
        addMouseMotionListener(this);
        
        setPreferredSize(new Dimension(450, 450));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
    }
    void eventOutput(String eventDescription, MouseEvent e) {
        textArea.append(eventDescription + " (" + e.getX() + "," + e.getY() + ")" + " detected on " + e.getComponent().getClass().getName() + NEWLINE);
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }
    
    @Override
    public void mouseDragged(MouseEvent e) {
        eventOutput("Mouse Dragged", e);
        System.out.println("Mouse movement detected.");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        eventOutput("Mouse moved", e); 
        System.out.println("Mouse movement detected.");
    }
}