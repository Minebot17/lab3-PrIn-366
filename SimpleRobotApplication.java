import View.GameFrame;

import javax.swing.*;

public class SimpleRobotApplication {

	// serpinin branch 1
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GameFrame mainW = new GameFrame();
                mainW.setVisible(true);
            }
			// serpinin branch 2
        });
    }
}