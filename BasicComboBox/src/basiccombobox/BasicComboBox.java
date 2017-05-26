/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basiccombobox;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author cgallinaro
 */
public class BasicComboBox {

    private static void createAndShowGUI() {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(425, 210);
        
        BasicComboBoxJPanel panel = new BasicComboBoxJPanel();
        panel.initComboBox();
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
