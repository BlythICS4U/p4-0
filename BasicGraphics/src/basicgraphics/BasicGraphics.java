package basicgraphics;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class BasicGraphics {
    
    private static void createAndShowGUI() {
        JFrame f = new JFrame("My First Graphics Program");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800, 400);
        f.add(new BasicGraphicsJPanel());
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
