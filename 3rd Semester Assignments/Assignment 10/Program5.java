/* Question 5 (AWT):
Write a java awt program, which will create 2 text fields and one button labelled as Reverse. The user will enter a number in the 1st text field and upon pressing the button it will display the reverse of the number in the 2nd text field.
*/
import java.awt.*;
import java.awt.event.*;
public class Assignment5 extends Frame {
    private TextField textField1, resultField;
    private Button reverseButton;
    public Assignment5() {
        // Set up the frame
        setTitle("Reverse a number");
        setSize(300, 250);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setLayout(null);
        // Create text fields and button
        textField1 = new TextField();
        resultField = new TextField();
        resultField.setEditable(false); // Result field should not be editable
        reverseButton = new Button("Reverse");
        // Set bounds for the components
        textField1.setBounds(30, 50, 130, 30);
        resultField.setBounds(30, 150, 130, 30);
        reverseButton.setBounds(30, 200, 130, 30);
        // Add components to the frame
        add(textField1);
        add(resultField);
        add(reverseButton);
        // Add action listener to the button
        reverseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    long n = Long.parseLong(textField1.getText());
                    long rev = 0;
                    while(n != 0) {
                        rev = rev * 10 + n % 10;
                        n = n / 10;
                    }
                    resultField.setText(Long.toString(rev));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid Input");
                }
            }
        });
    }
    public static void main(String[] args) {
        Assignment5 frame = new Assignment5();
        frame.setVisible(true);
    }
}
