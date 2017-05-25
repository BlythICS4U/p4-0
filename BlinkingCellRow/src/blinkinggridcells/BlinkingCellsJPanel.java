package blinkinggridcells;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author cgallinaro
 */
public class BlinkingCellsJPanel extends JPanel {
    
    private boolean[] cellsOn = new boolean[10];
    private int cellWidth = 40;
    private int cellGap = 10;

    private void setCellsRandomly() {
        Random r = new Random();

        for (int i = 0; i < cellsOn.length; i++) {
            cellsOn[i] = r.nextBoolean();
        }
    }
    
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.blue); 
        g.fillRect(0, 0, 800, 800); 
        
        setCellsRandomly(); //This ensures that the cells will appear differently
                            //every time paint() is called inside main().
                            //Since main() is calling paint() repeatedly in a loop, 
                            //the cells will look like they're blinking randomly        
        
        int xPos = 35;
        int yPos = 100;
        
        for (int i = 0; i < cellsOn.length; i++) {
            if (cellsOn[i] == true) {
                g.setColor(Color.red);
            } else {
                g.setColor(Color.white);
            }
            
            g.fillRect(xPos, yPos, cellWidth, cellWidth);
            
            g.setColor(Color.black);
            g.drawRect(xPos, yPos, cellWidth, cellWidth);
            
            xPos += cellWidth + cellGap;           
        }
    }
    
}
