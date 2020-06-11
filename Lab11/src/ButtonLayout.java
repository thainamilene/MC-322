import javax.swing.*;
import java.awt.*;

public class ButtonLayout extends JFrame {
    private static final long serialVersionUID = 2253083887687830773L;
    JPanel buttonDirectionalsPanel, buttonRandomlyPanel;

    public ButtonLayout() {
        super();
        visual();
    }

    private void visual() {
        setSize(700, 60);
        Container mPanel = getContentPane();
        buttonDirectionalsPanel = new JPanel();
        buttonDirectionalsPanel.setLayout(new GridBagLayout());
        mPanel.add(buttonDirectionalsPanel, BorderLayout.WEST);
        buttonRandomlyPanel = new JPanel();
        buttonRandomlyPanel.setLayout(new GridBagLayout());
        mPanel.add(buttonRandomlyPanel, BorderLayout.EAST);
        setVisible(true);

    }
    public JPanel getButtonDirectionalsPanel() {
        return buttonDirectionalsPanel;
    }

    public JPanel getButtonRandomlyPanel() {
        return buttonRandomlyPanel;
    }
}
