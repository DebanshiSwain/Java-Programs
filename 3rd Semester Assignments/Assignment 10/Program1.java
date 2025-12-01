/* Question 1 (AWT):
Write a java program to create three push buttons showing three different colors as their label. When a button is clicked, that particular color is set as background color in the frame.
*/
import java.awt.*;
import java.awt.event.*;
public class Assignment1 {
    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("Assignment-1");
        // Create the buttons
        Button b1 = new Button("Red");
        Button b2 = new Button("Green");
        Button b3 = new Button("Blue");
        // Set the position of the buttons
        b1.setBounds(50, 80, 80, 40);
        b2.setBounds(150, 80, 80, 40);
        b3.setBounds(260, 80, 80, 40);
        // Add action listener to button b1
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setBackground(Color.RED);
            }
        });
        // Add action listener to button b2
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setBackground(Color.GREEN);
            }
        });
        // Add action listener to button b3
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setBackground(Color.BLUE);
            }
        });
        // Add window listener (to close the window)
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        // Add buttons to the frame
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        // Set background color (optional)
        frame.setBackground(Color.LIGHT_GRAY);
        // Set size, layout, and visibility
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
