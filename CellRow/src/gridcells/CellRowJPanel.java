package gridcells;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author cgallinaro
 */
public class CellRowJPanel extends JPanel {
    
    private boolean[] cellsOn = new boolean[10]; // Each cell represents a light that can be "on" (true) or "off" (false)
    private int cellWidth = 40; // Each cell will be 40x40 pixels in size. Try changing this.
    private int cellGap = 10; // Cells will have gaps of 10 pixels between them. Try changing this.
    
    //Assigns each cell randomly to "on" or "off"
    public void setCellsRandomly() {
        Random r = new Random();
        
        for (int i = 0; i < cellsOn.length; i++) {           
            cellsOn[i]  = r.nextBoolean(); //a random true-or-false value
        }          
    }
    
    //Assigns cells alternately to on-off-on-off-on-off...
    public void setCellsAlternately() {
        //Can you code this? =)     
    }
    
    @Override
    public void paintComponent( Graphics g ) { //g is a graphics-drawing object. 
                                                //Think of g as a paint brush that can have any colour
        g.setColor(Color.blue); 
        g.fillRect(0, 0, 800, 800); //paint the background of the window using g's current colour, which is blue
        
        setCellsRandomly(); //assigns each cell a random on-off value
        
        //The (x, y) position of the upper-left corner of the cell we're about to draw
        //Try changing these values.
        int xPos = 35; 
        int yPos = 100;
        
        //This loop draws the cells according to their on-off values, 
        //which were set by the method-call setCellsRandomly() two lines above.
        for (int i = 0; i < cellsOn.length; i++) {
            
            //Set g's next brush color to either red or white, based on cell i's on-off value
            if (cellsOn[i] == true) {
                g.setColor(Color.white);
            } else {
                g.setColor(Color.red);
            }
            
            g.fillRect(xPos, yPos, cellWidth, cellWidth); //Draw cell i using g's current color, which was just chosen by the if-statement
                                            //The cell will be drawn 20 pixels wide and 20 pixels tall. Try changing these.
                        
            xPos += cellWidth + cellGap; //Move to the right before drawing the next cell                        
        }
    }
    
}
