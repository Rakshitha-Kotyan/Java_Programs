/*5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
display the concerned color whenever the specific tab is selected in the Pan*/
// Program Name: ColorTabbedPane.java
// Description: Tabbed Pane with Cyan, Magenta, and Yellow color panels

import java.awt.Color;
import javax.swing.*;

public class ColorTabbedPane2 {
    JFrame frame;

    ColorTabbedPane2() {
        frame = new JFrame("Color Tabs Example");

        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(50, 50, 250, 250);
        tabbedPane.add("Cyan", cyanPanel);
        tabbedPane.add("Magenta", magentaPanel);
        tabbedPane.add("Yellow", yellowPanel);

        frame.add(tabbedPane);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ColorTabbedPane2();
    }
}
