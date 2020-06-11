import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class Window extends JFrame {
    private static final long serialVersionUID = -5601463959007788665L;
    JPanel imagePanel, buttonPanel;

    public Window () {
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        visual();
    }

    private void visual() {
        setSize(700, 760);

        Container mainPanel = getContentPane();
        mainPanel.setLayout(new BorderLayout());

        imagePanel = new JPanel();
        imagePanel.setLayout(new GridLayout(7,7));
        mainPanel.add(imagePanel, BorderLayout.CENTER);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void addFieldImage(Images img) {
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


   public void addControl(JButton controle) {
      buttonPanel.add(controle);
      SwingUtilities.updateComponentTreeUI(this);
   }
}
