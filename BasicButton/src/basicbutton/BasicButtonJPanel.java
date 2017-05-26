/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicbutton;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author cgallinaro
 */
public class BasicButtonJPanel extends JPanel {
    
    public void initButtons() {
    	JButton play = new JButton("Play");
    	JButton stop = new JButton("Stop");
    	JButton pause = new JButton("Pause");
    	add(play);
    	add(stop);
    	add(pause);
    }
    
}
