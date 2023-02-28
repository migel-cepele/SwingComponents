package komponentet;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TextFieldFrame extends JFrame {

    private final JTextField textField1;
    private final JTextField textField2;
    private final JTextField textField3;
    private final JPasswordField passwordField;

    public TextFieldFrame() {
        super("Testing JTextField and passwordfield");
        setLayout(new FlowLayout());

        //text field me 10 kolona
        textField1 = new JTextField(10);
        add(textField1);

        //text field me defauld text
        textField2 = new JTextField("Vendos tekstin ketu");
        add(textField2);

        //text field me default text me 21 kolona
        textField3 = new JTextField("Uneditable text field", 21);
        textField3.setEditable(false);
        add(textField3);

        //password field me default text
        passwordField = new JPasswordField("Hidden text");
        add(passwordField);

        //register event handler
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField.addActionListener(handler);


        
    }

    //private inner class per event handling
    private class TextFieldHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            String s = "";

            //user pressed Enter in textField1
            if(event.getSource() == textField1)
            s = String.format("textField1: %s", event.getActionCommand());

            //user pressed enter in textfield2
            else if (event.getSource() == textField2)
            s= String.format("textfield3: %s", event.getActionCommand());

            //user pressed enter in textfield3
            else if(event.getSource() == textField3)
            s = String.format("textfield3: %s", event.getActionCommand());

            //user pressed enter in passwordfield
            else if(event.getSource() == passwordField)
            s = String.format("passwordField: %s", event.getActionCommand());

            //display JTextField content
            JOptionPane.showMessageDialog(null, s);


        }

    }

    public static void main(String[] args) {
        
        TextFieldFrame textFieldFrame = new TextFieldFrame();
        textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textFieldFrame.setSize(350,100);
        textFieldFrame.setVisible(true);
    }
}
