package komponentet;
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ComboBoxFrame extends JFrame{

	private final JComboBox<String> imagesJComboBox;
	private final JLabel label; 

	private static final String[] names = {"vijetenxire.jpg",
	"vijetenxire.jpg", "vijetenxire.jpg", "vijetenxire.jpg"};

	private final Icon[] ikonat = {new ImageIcon("/java/vijetenxire.jpg"),
			new ImageIcon("/java/vijetenxire.jpg"),
			new ImageIcon("/java/vijetenxire.jpg")
			,new ImageIcon("/java/vijetenxire.jpg")};

	public ComboBoxFrame() {
		super("testing jcombobox");
		setLayout(new FlowLayout());
		
		label = new JLabel(ikonat[0]);
		add(label);

		imagesJComboBox = new JComboBox<String>(names);
		imagesJComboBox.setMaximumRowCount(3); //shfaq tre rreshta

		imagesJComboBox.addItemListener(event -> {
			if(event.getStateChange() == ItemEvent.SELECTED)
				label.setIcon(ikonat[imagesJComboBox.getSelectedIndex()]);
			
		}
			/*new ItemListener() //klase e brendshme anonime(lambda)
			{
				@Override
				public void itemStateChanged(ItemEvent event) {

					//percakto nese item eshte selected
					if(event.getStateChange() == ItemEvent.SELECTED)
					label.setIcon(ikonat[imagesJComboBox.getSelectedIndex()]);
				}

			}*/
		);

		add(imagesJComboBox);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComboBoxFrame c = new ComboBoxFrame();
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setSize(350, 350);
		c.setVisible(true);

	}

}
