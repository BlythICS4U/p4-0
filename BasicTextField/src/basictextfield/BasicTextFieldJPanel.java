/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basictextfield;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author cgallinaro
 */
public class BasicTextFieldJPanel extends JPanel {

    public void initTextField() {
        JLabel pageLabel = new JLabel("Web page address: ", JLabel.RIGHT);
        JTextField pageAddress = new JTextField(20);
        add(pageLabel);
        add(pageAddress);
    }
    
}
