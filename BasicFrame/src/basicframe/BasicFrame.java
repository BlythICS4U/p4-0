package basicframe;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author cgallinaro
 */
public class BasicFrame {

    private static void createAndShowGUI() {
        JFrame f = new JFrame("My First Frame Program");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 400);
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
