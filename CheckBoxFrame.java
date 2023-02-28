package komponentet;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;

import javax.swing.JCheckBox;

public class CheckBoxFrame extends JFrame {
    private final JTextField textField; //paraqet tekst ne fonte te ndryshem
    private final JCheckBox boldCheckBox; //selekton ose diselekton bold
    private final JCheckBox italiCheckBox; //selekton ose diselekton italic

    public CheckBoxFrame() {
        super("Jcheckbox test");
        setLayout(new FlowLayout());

        textField = new JTextField("Shiko fontin te ndryshoj", 20);
        textField.setFont(new Font("Serif", Font.PLAIN, 14));
        add(textField);

        boldCheckBox = new JCheckBox("Bold");
        italiCheckBox = new JCheckBox("Italic");
        add(boldCheckBox);
        add(italiCheckBox);

        //regjistrimi i listeners per checkboxes
        CheckBoxHandler handler = new CheckBoxHandler();
        boldCheckBox.addItemListener(handler);
        italiCheckBox.addItemListener(handler);
    }
    private class CheckBoxHandler implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent event) {
            Font font = null;

            //percakto se cilat checkbox jane check
            if(boldCheckBox.isSelected() && italiCheckBox.isSelected() )
            font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            
            else if(boldCheckBox.isSelected())
            font = new Font("Serif", Font.BOLD, 14);

            else if(italiCheckBox.isSelected())
            font = new Font("Serif", Font.ITALIC, 14);

            else 
            font = new Font("Serif", Font.PLAIN, 14);

            textField.setFont(font);
        }
    }

    public static void main(String[] args) {
        CheckBoxFrame c = new CheckBoxFrame();
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setSize(500, 500);
        c.setVisible(true);
    }

}
