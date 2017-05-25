/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basicanimation;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class BasicAnimation {

    public static void sleep(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
        }
    }

    public static void main(String[] args) {
        final JFrame f = new JFrame("My First Animation Program");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 300);
        
        BasicAnimationJPanel panel = new BasicAnimationJPanel();
        f.add(panel);
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                f.setVisible(true);
            }
        });
        
        int numFrames = 100;

        for (int i = 1; i <= numFrames; i++) {
            panel.repaint();   //draw the current frame
            panel.yEndIncr(5); //update the yEnd vriable
            sleep(100);        //pause before drawing the next frame
        }
    }
}
