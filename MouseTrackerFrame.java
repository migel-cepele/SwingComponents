package komponentet;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;

public class MouseTrackerFrame extends JFrame {

    private final JPanel mousePanel;
    private final JLabel statusBar;

    public MouseTrackerFrame() { //nderton gui dhe regjistron mouse event handlers
        super("Mouse events");

        mousePanel = new JPanel();
        mousePanel.setBackground(Color.WHITE);
        add(mousePanel, BorderLayout.CENTER);

        statusBar = new JLabel("Mouse jashte panelit");
        add(statusBar, BorderLayout.SOUTH);

        //regjistrat per degjimin dhe levizjen e mouse
        
        /*addMouseListener(new MouseClickHandler());
    

        final class MouseClickHandler extends MouseAdapter {

            @Override
            public void mouseClicked(MouseEvent e) {
                statusBar.setText(String.format("klikuar ne: [%d, %d]", e.getX(), e.getY()));
            }

            @Override
            public void mousePressed(MouseEvent e) {
                statusBar.setText(String.format("Pressed at: [%d, %d]",
                 e.getX(), e.getY()));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                statusBar.setText(String.format("Released at: [%d, %d]", e.getX(), e.getY()));

            }

            @Override
            public void mouseEntered(MouseEvent e) {

                statusBar.setText(String.format("Mouse entered at: [%d, %d]", e.getX(), e.getY()));
                mousePanel.setBackground(Color.GREEN);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                statusBar.setText("Mouse jashte panelit");
                mousePanel.setBackground(Color.WHITE);

            }

            @Override
            public void mouseDragged(MouseEvent e) {
                statusBar.setText(String.format("Dragged at [%d, %d]", e.getX(), e.getY()));

            }
            @Override
            public void mouseMoved(MouseEvent e) {
                statusBar.setText(String.format("Moved at [%d, %d]", e.getX(), e.getY()));

            }

        }*/


    }


}
