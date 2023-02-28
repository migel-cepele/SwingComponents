package komponentet;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.security.*;
import javax.swing.*;


public class GuessTheNumber extends JFrame implements ActionListener{

	private JLabel titulli;
	private JLabel input;
	private JTextField text;
	private JLabel focus;
	private JButton reset;
	private JLabel a;

	private int nrGjen;
	private int guess;
	private int guessMeparshem;
	private SecureRandom r;


	public GuessTheNumber() {
		super("Guess the number: ");
		setLayout(new FlowLayout());
		setBackground(Color.WHITE);

		titulli = new JLabel("Can u guess the number from 1-1000");
		input = new JLabel("Vendosni numrin tuaj: ");
		add(titulli);
		add(input);

		text = new JTextField(7);
		add(text);

		focus = new JLabel("");
		add(focus);

		reset = new JButton("reset");
		add(reset);

		text.addActionListener(this);
		reset.addActionListener(this);

		r = new SecureRandom();
		nrGjen = r.nextInt(1000) + 1;
		a = new JLabel(""+nrGjen);
		add(a);


	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == text) {
			String s = e.getActionCommand();
			guess = Integer.parseInt(s);

			if(guess == nrGjen) {
				JOptionPane.showMessageDialog(GuessTheNumber.this, "Correct!");
				getContentPane().setBackground(Color.GREEN);
				text.setEditable(false);
				
			} else {
				boolean k = ngjyra(guess, guessMeparshem);
				if(k == true) {
					getContentPane().setBackground(Color.RED);
				} else {
					getContentPane().setBackground(Color.BLUE);
				}

				focus.setText(fokus(guess));
			}
			guessMeparshem = guess;
		}
		else if(e.getSource() == reset) {
			text.setEditable(true);
			nrGjen = r.nextInt(1000) + 1;
			a.setText("" + nrGjen);
			getContentPane().setBackground(Color.WHITE);
		}
		
	} 

	public boolean ngjyra(int guess, int guessMeparshem) { //kthen false per blu dhe true per te kuqe
		int dif1, dif2;
		dif1 = Math.abs(nrGjen - guess);
		dif2 = Math.abs(nrGjen - guessMeparshem);

		if(dif1 >= dif2)
		return false;
		else
		return true;

	}

	public String fokus(int guess) {
		if(nrGjen - guess > 200)
		return "Too low";
		else if (nrGjen - guess < -200)
		return "Too high";
		else 
		return "";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuessTheNumber g = new GuessTheNumber();
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		g.setSize(400,500);
		g.setVisible(true);

	}

}
