package komponentet;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class ToCelsius extends JFrame implements ActionListener {

	private JTextField f;
	private JLabel c;
	private double farenheit;
	private double celsius;

	public ToCelsius() {
		super("Convert from Farenheit to Celsius");
		Container con = getContentPane();
		con.setBackground(Color.WHITE);
		con.setLayout(new FlowLayout());

		f = new JTextField(10);
		add(f);

		c = new JLabel("");
		c.setFont(new Font("Serif", Font.BOLD, 20));
		add(c);

		f.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {

		String s = e.getActionCommand();

		farenheit = Double.parseDouble(s);
		toCelsius();
		
		c.setText(String.format("%.2f", celsius));
	}

	public void toCelsius() {
		celsius =  5 * (farenheit - 32) / 9;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ToCelsius c = new ToCelsius();
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setSize(300, 300);
		c.setVisible(true);



	}

}
