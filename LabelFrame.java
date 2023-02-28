package komponentet;
import java.awt.FlowLayout;
import javax.swing.*;

public class LabelFrame extends JFrame {
	
	private final JLabel label1;
	private final JLabel label2;
	private final JLabel label3;

	public LabelFrame() {
		super("Testing JLabel");
		setLayout(new FlowLayout()); //frame layout

		//label me tekst
		label1 = new JLabel("Label me text");
		label1.setToolTipText("kjo eshte label1");
		add(label1);

		//jlabel konstruktor me string ikone dhe argumenta vendoses
		Icon bug = new ImageIcon("/java/vijetenxire.jpg");
		label2 = new JLabel("Label me tekst dhe ikone", bug, SwingConstants.LEFT);
		label2.setToolTipText("label 2");
		add(label2); //shton komponentin ne frame

		//konstruktor pa argumenta
		label3 = new JLabel();
		label3.setText("label me ikone dhe text ne fund");
		label3.setIcon(bug);
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		label3.setToolTipText("this is label3");
		add(label3);
	}

	public static void main(String[] args) {
		
		LabelFrame lb = new LabelFrame();
		lb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lb.setSize(250,500);
		lb.setVisible(true);
	}
	
	

}
