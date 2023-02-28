package komponentet;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultipleSelectionFrame extends JFrame{

    private final JList<String> colorJList;
    private final JList<String> copyJList;
    private JButton copyButton;
    private static final String[] colorNames = {"Black", "Blue", "Cyan",
    "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange",
    "Pink", "Red", "White", "Yellow"};

    public MultipleSelectionFrame() {

        super("Multiple Selection List");
        setLayout(new FlowLayout());

        colorJList = new JList<String>(colorNames);
        colorJList.setVisibleRowCount(3);

        colorJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(colorJList)); //shton listen bashke me ashensor

        copyButton = new JButton("Copy");
        copyButton.addActionListener(
            new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    copyJList.setListData(colorJList.getSelectedValuesList().toArray(new String[0]));
                }

            }
        );
        add(copyButton);

        copyJList = new JList<String>();
        copyJList.setVisibleRowCount(5);
        copyJList.setFixedCellHeight(15); //vendos gjatesine
        copyJList.setFixedCellWidth(100); //vendos lartesine
        copyJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add(new JScrollPane(copyJList));

    }

    public static void main(String[] args) {
        MultipleSelectionFrame m = new MultipleSelectionFrame();
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setSize(500, 500);
        m.setVisible(true);
    }

}
