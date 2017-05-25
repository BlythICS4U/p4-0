package blinkinggridcells;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class BlinkingCells {
    
    //Pauses the program for numMilliseconds whenever it's called. Needed for animation.
    public static void sleep( int numMilliseconds ) {
        try {
            Thread.sleep( numMilliseconds );
        } catch (InterruptedException e) {
        }
    } 
    
    public static void main(String[] args) {
        final JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800, 800);
        
        BlinkingCellsJPanel panel = new BlinkingCellsJPanel();
        f.add(panel);
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                f.setVisible(true);
            }
        });
        
        int numFrames = 50;
        
        for (int i = 1; i <= numFrames; i++) {            
            panel.repaint();  //Calls paintComponent() repeatedly.          
            sleep(200);  //...pause 200 milliseconds between frames. Try changing this value.      
        }    
    }
}

/* Your challenge! Turn cellsOn into a 2D array of booleans so that we get a 2D grid of blinking cells
   instead of just a single row. Thus, any for-loop that uses cellsOn will have to be a nested loop
*/