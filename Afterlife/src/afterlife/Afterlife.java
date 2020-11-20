package afterlife;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import static java.awt.event.MouseEvent.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
/**
 * Copyright © 2020. All rights reserved.
 * @author Lucas Curran
 */
public class Afterlife extends JFrame {

   boolean isRunning = true;
   short fps = 30;
   short windowWidth = 1000;
   short windowHeight = 1000;
   
   
   Insets insets;
   BufferedImage backBuffer;
   BufferedImage kino;
   InputHandler input;
   ImageIcon image1;
   JLabel label1;
   MouseInput mouseEvent = new MouseInput();
   JPanel myPanel;
   
   
   int x = 0;
   int y = 0;
   
    public static void main(String[] args) {
        Afterlife game = new Afterlife();
        game.run();
        System.exit(0);
    } //Main method ends
    
    //This method starts the game and runs it in a loop
    public void run() {
        initialize();
        while (isRunning) {
            
            long time = System.currentTimeMillis();
            
            update();
            draw();
            
            // find how long frame took
            time = (1000 / fps) - (System.currentTimeMillis() - time);
            
            // delay frame if time greater than 0
            if (time > 0) {
                try {
                    Thread.sleep(time);
                }
                catch(InterruptedException e){}
            }
        }
        setVisible(false); // Stop showing frame once isRunning loop ends
    } // run method ends
    
    // This method sets up everything needed for the game to run
    void initialize() { 
        setTitle("Afterlife");
        setSize(windowWidth, windowHeight);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        insets = getInsets();
        setSize(insets.left + windowWidth + insets.right, insets.top + windowHeight + insets.bottom);
        
        backBuffer = new BufferedImage(windowWidth, windowHeight, BufferedImage.TYPE_INT_RGB);
        input = new InputHandler(this);
    }
    
    // This method checks for user input, moves things around, etc...
    void update() {
        if (input.isKeyDown(KeyEvent.VK_RIGHT)) {
            x+=10;
        }
        if (input.isKeyDown(KeyEvent.VK_LEFT)) {
            x-=10;
        }
        if (input.isKeyDown(KeyEvent.VK_UP)) {
           y-=10;
        }
        if (input.isKeyDown(KeyEvent.VK_DOWN)) {
            y+=10;
        }
    }
    
    // This method draws everything
    void draw() {
        
        Graphics g = getGraphics();
        
        Graphics bbg = backBuffer.getGraphics();
        
        bbg.setColor(Color.BLACK);
        bbg.drawImage(backBuffer, insets.left, insets.top, this); //'this' is the ImageObserver required to draw the image, inherited by JFrame
        setLayout(new FlowLayout());
        g.drawRect(x, y, 100, 100);
       image1 = new ImageIcon(getClass().getResource("kino.png"));
       
       label1 = new JLabel(image1);
       add(label1);      
        
    }

    void MouseInput(MouseEvent e) {
       MouseEvent MouseEvent = null;
        mouseEvent.mouseClicked(MouseEvent);
    }
    
}
