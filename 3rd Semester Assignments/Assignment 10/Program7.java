/* Assignment 7:
Create three color buttons ("Red", "Green", "Blue") and a text label.
Initially the text is black. Clicking a button changes the text color.
*/

import java.awt.*;
import java.awt.event.*;

public class Assignment7 {
    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("My Buttons");

        // Create the label
        Label label = new Label("Welcome");
        label.setAlignment(Label.CENTER);
        label.setFont(new Font("Roboto Condensed Light", Font.BOLD, 20));
        label.setForeground(Color.BLACK); // Initial text color

        // Create the buttons
        Button b1 = new Button("Red");
        Button b2 = new Button("Green");
        Button b3 = new Button("Blue");

        // Set bounds for buttons and label
        b1.setBounds(50, 80, 80, 40);
        b2.setBounds(150, 80, 80, 40);
        b3.setBounds(260, 80, 80, 40);
        label.setBounds(140, 150, 120, 50);

        // Add action listeners to buttons
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setForeground(Color.RED);
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setForeground(Color.GREEN);
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setForeground(Color.BLUE);
            }
        });

        // Add window listener to close the frame
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Add components to the frame
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(label);

        // Frame settings
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
