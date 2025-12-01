/* Question 2 (AWT):
Write a java awt program, which will create 3 text fields and one button labelled as Subtract. The program will take the input from the two text fields and upon pressing the Subtract button it will display the result in the third text field.
*/
import java.awt.*;
import java.awt.event.*;
public class Assignment2 extends Frame {
    private TextField textField1, textField2, resultField;
    private Button subtractButton;
    public Assignment2() {
        // Set up the frame
        setTitle("Assignment-2");
        setSize(300, 250);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setLayout(null);
        // Create text fields and button
        textField1 = new TextField();
        textField2 = new TextField();
        resultField = new TextField();
        resultField.setEditable(false); // Result field should not be editable
        subtractButton = new Button("Subtract");
        // Set bounds for the components
        textField1.setBounds(30, 50, 130, 30);
        textField2.setBounds(30, 100, 130, 30);
        resultField.setBounds(30, 150, 130, 30);
        subtractButton.setBounds(30, 200, 130, 30);
        // Add components to the frame
        add(textField1);
        add(textField2);
        add(resultField);
        add(subtractButton);
        // Add action listener to the button
        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(textField1.getText());
                    int num2 = Integer.parseInt(textField2.getText());
                    int result = num1 - num2;
                    resultField.setText(Integer.toString(result));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid Input");
                }
            }
        });
    }
    public static void main(String[] args) {
        Assignment2 frame = new Assignment2();
        frame.setVisible(true);
    }
}
