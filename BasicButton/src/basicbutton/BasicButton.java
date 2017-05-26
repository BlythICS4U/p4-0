/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicbutton;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author cgallinaro
 */
public class BasicButton {

    private static void createAndShowGUI() {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(425, 80);
        
        BasicButtonJPanel panel = new BasicButtonJPanel();
        panel.initButtons();
        f.add(panel);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
}
