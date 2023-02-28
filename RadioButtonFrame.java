package komponentet;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;


public class RadioButtonFrame extends JFrame {

    private final JTextField textField;
    private final Font plainFont;
    private final Font boldFont;
    private final Font italiFont;
    private final Font boldItalicFont;

    private final JRadioButton plainRadioButton;
    private final JRadioButton bolRadioButton;
    private final JRadioButton italicRadioButton;
    private final JRadioButton boldItalRadioButton;
    private final ButtonGroup radiGroup; //ruan radio buttons

    public RadioButtonFrame() {
        super("RadioButton text");
        setLayout(new FlowLayout());

        textField = new JTextField("shiko fontin te ndryshoj", 50);
        add(textField);

        //radio butonat
        plainRadioButton = new JRadioButton("Plain", true); //true tregon qe eshte i selektuar default
        bolRadioButton = new JRadioButton("Bold", false);
        italicRadioButton = new JRadioButton("italic", false);
        boldItalRadioButton = new JRadioButton("bold dhe italic", false);
        add(plainRadioButton);
        add(bolRadioButton);
        add(italicRadioButton);
        add(boldItalRadioButton);

        //krijon marredhenie logjike mes radio butonave
        radiGroup = new ButtonGroup();
        radiGroup.add(plainRadioButton);
        radiGroup.add(bolRadioButton);
        radiGroup.add(italicRadioButton);
        radiGroup.add(boldItalRadioButton);

        //fonti i objekteve
        plainFont = new Font("Serif", Font.PLAIN, 14);
        boldFont = new Font("Serif", Font.BOLD, 14);
        italiFont = new Font("Serif", Font.ITALIC, 14);
        boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        textField.setFont(plainFont);

        //regjistrimi i eventeve per radio butonat
        plainRadioButton.addItemListener(new RadioButtonHandler(plainFont));
        bolRadioButton.addItemListener(new RadioButtonHandler(boldFont));
        italicRadioButton.addItemListener(new RadioButtonHandler(italiFont));
        boldItalRadioButton.addItemListener(new RadioButtonHandler(boldItalicFont));

    }

    private class RadioButtonHandler implements ItemListener {
        private Font font;
        public RadioButtonHandler(Font f) {
            font = f;
        }

        @Override
        public void itemStateChanged(ItemEvent e) {
            textField.setFont(font);
        }
    }

    public static void main(String[] args) {
        RadioButtonFrame r = new RadioButtonFrame();
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.setSize(500, 500);
        r.setVisible(true);
    }

}
