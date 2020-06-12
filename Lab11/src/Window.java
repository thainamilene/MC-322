import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

public class Window extends JFrame {
    private static final long serialVersionUID = -5601463959007788665L;
    JPanel imagePanel, buttonPanel;

    public Window() {
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        visual();
    }

    private void visual() {
        setSize(700, 945);

        Container mainPanel = getContentPane();
        mainPanel.setLayout(new BorderLayout());

        imagePanel = new JPanel();
        imagePanel.setLayout(new GridLayout(7, 7));
        mainPanel.add(imagePanel, BorderLayout.CENTER);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2,0));
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void addImage(Images img) {
        imagePanel.add(img);
        SwingUtilities.updateComponentTreeUI(this);
    }

    public void addImage(Images img, int index) {
        imagePanel.add(img, index);
        SwingUtilities.updateComponentTreeUI(this);
    }

    public void removeImage(int index) {
        imagePanel.remove(index);
        SwingUtilities.updateComponentTreeUI(this);
    }

    public void addControl(JButton button) {
        buttonPanel.add(button);
        SwingUtilities.updateComponentTreeUI(this);
    }
}