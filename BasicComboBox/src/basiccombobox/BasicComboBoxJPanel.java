/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basiccombobox;

import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 *
 * @author cgallinaro
 */
public class BasicComboBoxJPanel extends JPanel {

    public void initComboBox() {
    	JComboBox profession = new JComboBox();
    	profession.addItem("Butcher");
    	profession.addItem("Baker");
    	profession.addItem("Candlestick maker");
    	profession.addItem("Fletcher");
    	profession.addItem("Fighter");
    	profession.addItem("Technical writer");
    	add(profession);
    }

}
