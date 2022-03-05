import View.GameFrame;

import javax.swing.*;

// serpinin main 1
public class SimpleRobotApplication {

	// serpinin branch 1
    public static void main(String[] args) {

		// serpinin main 2
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GameFrame mainW = new GameFrame();
                mainW.setVisible(true);
            }
			// serpinin branch 2
        });
    }
}