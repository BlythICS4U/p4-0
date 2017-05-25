package basicgraphics;

import java.awt.*; // needed for graphics
import javax.swing.*; // needed for graphics

/**
 *
 * @author cgallinaro
 */
public class BasicGraphicsJPanel extends JPanel {
    
    public BasicGraphicsJPanel() {
    }

    @Override
    public void paintComponent(Graphics g) { // g is a graphics-drawing object. 
                                             // Think of g as a paint brush that can have any colour  
        
        super.paintComponent(g); // Since this is overridden, we call the parent implementation as well
        
        // Paint the background of the window
        g.setColor(Color.blue); 
        g.fillRect(0, 0, 800, 800); 

        // Draw some stuff on top of the blue background
        g.setColor(Color.red);
        g.fillRect(100, 100, 80, 40); // draws a red rectangle with upper-left corner (100, 100) and size 80x40
        g.drawRect(200, 200, 80, 40); // what's the difference between fillRect and drawRect?
        
        g.setColor(Color.white);
        g.drawLine(300, 100, 700, 200); // draws a line from (300,100) to (700, 200)
        
    }

}
