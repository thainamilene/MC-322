import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class StyleButton extends JButton {
    public StyleButton(String icon) {
        super(new ImageIcon(icon));
        setBackground(new Color(0xEAE5EE));
        setFocusPainted(false);
        setBorderPainted(false);
    }
}
