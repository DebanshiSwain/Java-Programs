import java.awt.*;
import java.awt.event.*;

public class Assignment8 extends Frame {
    private TextField textField1, resultField;
    private Button countButton;
    private Label lb1, lb2;

    public Assignment8() {
        // Frame setup
        setTitle("Calculate Number of Digits");
        setSize(350, 250);
        setLayout(null);

        // Close window event
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Create labels, text fields, and button
        lb1 = new Label("Input number");
        lb2 = new Label("Number of digits");
        textField1 = new TextField();
        resultField = new TextField();
        resultField.setEditable(false); // Result field non-editable
        countButton = new Button("Count");

        // Set bounds for components
        lb1.setBounds(30, 50, 120, 30);
        textField1.setBounds(160, 50, 130, 30);
        lb2.setBounds(30, 100, 120, 30);
        resultField.setBounds(160, 100, 130, 30);
        countButton.setBounds(100, 150, 120, 30);

        // Add components to frame
        add(lb1);
        add(textField1);
        add(lb2);
        add(resultField);
        add(countButton);

        // Add button action listener
        countButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int n = Integer.parseInt(textField1.getText());
                    int count = 0;
                    int temp = n;
                    if (n == 0) count = 1; // Handle 0 as 1 digit
                    while (temp != 0) {
                        count++;
                        temp /= 10;
                    }
                    resultField.setText(Integer.toString(count));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid Input");
                }
            }
        });
    }

    public static void main(String[] args) {
        Assignment8 frame = new Assignment8();
        frame.setBackground(Color.LIGHT_GRAY);
        frame.setVisible(true);
    }
}
