// 5d. Develop a Swing program in Java to create a Tabbed Pane of Cyan, Magenta and Yellow
// and display the concerned color whenever the specific tab is selected in the Pane.

package prg5;

import javax.swing.*;
import java.awt.*;

public class JColor {

    public static void main(String[] args) {
        // Create the main JFrame
        JFrame frame = new JFrame("Tabbed Pane Colors - CMY");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        // Create a JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels with different background colors
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        // Add the panels as tabs
        tabbedPane.addTab("Cyan", cyanPanel);
        tabbedPane.addTab("Magenta", magentaPanel);
        tabbedPane.addTab("Yellow", yellowPanel);

        // Add the tabbedPane to the frame
        frame.add(tabbedPane);

        // Make the frame visible
        frame.setVisible(true);
    }
}
