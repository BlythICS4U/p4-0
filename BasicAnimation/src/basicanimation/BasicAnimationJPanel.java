package basicanimation;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author cgallinaro
 */
public class BasicAnimationJPanel extends JPanel {
    
    // variables that the paint method will need
    private int xStart = 50, yStart = 50, xEnd = 200, yEnd = 0;
    
    public void yEndIncr(int amount) {
        yEnd += amount;
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, 300, 300);

        g.setColor(Color.blue);
        g.drawLine(xStart, yStart, xEnd, yEnd);
    }

}
