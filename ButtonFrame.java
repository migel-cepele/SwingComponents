package komponentet;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame {
    private final JButton plainJButton;
    private final JButton fancyjButton;

    public ButtonFrame() {
        super("Testing Buttons");
        FlowLayout layout = new FlowLayout();
        setLayout(layout);

        plainJButton = new JButton("Plain Button");//buton me tekst
        add(plainJButton);

        Icon ikone1 = new ImageIcon("/java/peter.jpg");
        Icon ikone2 = new ImageIcon("/java/vijetenxire.jpg");
        fancyjButton = new JButton("Fancy button", ikone1);//vendos imazhin
        fancyjButton.setRolloverIcon(ikone2);
        add(fancyjButton); //shtimi i fancybutton ne frame

        //event handling
        //ButtonHandler handler = new ButtonHandler();
        fancyjButton.addActionListener(event -> {
        	JOptionPane.showMessageDialog(ButtonFrame.this, String.format("U pressed: %s",event.getActionCommand()));
        });
        plainJButton.addActionListener(event -> {
        	JOptionPane.showMessageDialog(ButtonFrame.this, String.format("U pressed: %s",event.getActionCommand()));
        }); //ketu event handling behet me ane te lambdas
    }

    /*private class ButtonHandler implements ActionListener{

        //handle buttonevent
        @Override
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(ButtonFrame.this,
             String.format("Your pressed: %s", event.getActionCommand()));
             //fjala kyce "this" perdoret qe mesazhi te vendoset siper komponentit

        }
    }*/

    public static void main(String[] args) {
        ButtonFrame b = new ButtonFrame();
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.setSize(500, 200);
        b.setVisible(true);
    }

    

}
