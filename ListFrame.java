package komponentet;
import java.awt.FlowLayout;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;


public class ListFrame extends JFrame {
    private final JList<String> colorJList;
    private static final String[] colorNames = {"Black", "Blue", "Cyan",
    "Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
    "Orange", "Pink", "Red", "White", "Yellow"};

    private static final Color[] color = {Color.BLACK, Color.BLUE,
        Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN,
        Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK,
        Color.RED, Color.WHITE, Color.YELLOW};

    public ListFrame() {
        super("List Test");
        setLayout(new FlowLayout());

        colorJList = new JList<String>(colorNames);
        colorJList.setVisibleRowCount(5);

        //nuk lejohen multiple selections
        colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        //shtojme nje JScrollPane me JList
        add(new JScrollPane(colorJList));

        colorJList.addListSelectionListener(
            new ListSelectionListener() { //klase e brendshme anonime

                @Override
                public void valueChanged(ListSelectionEvent event) {
                    getContentPane().setBackground(color[colorJList.getSelectedIndex()]);
                }
                
            }
        );
    }

    public static void main(String[] args) {
        ListFrame l = new ListFrame();
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l.setSize(500, 500);
        l.setVisible(true);
    }
}