package sakura.kooi.BiliLiveMedal.gui;

import javax.swing.*;
import java.awt.*;

public class MedalLogoPanel extends JPanel {
    private static final Font font = new Font("微软雅黑", Font.PLAIN, 12);
    private JPanel content;
    private JLabel lblMedal;
    private JLabel lblLevel;
    private JPanel panelLevel;
    private JPanel panelMedal;

    public MedalLogoPanel(String medal , int level, int color) {
        this.add(content);
        panelMedal.setPreferredSize(new Dimension(48, 14));
        panelLevel.setPreferredSize(new Dimension(16, 14));
        lblMedal.setText(medal);
        lblLevel.setText(String.valueOf(level));
        Color c = new Color(color);
        lblLevel.setForeground(c);
        content.setBackground(c);
        panelMedal.setBackground(c);
        lblMedal.setFont(font);
        lblLevel.setFont(font);
    }
}
