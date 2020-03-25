package sakura.kooi.BiliLiveMedal.gui;

import sakura.kooi.BiliLiveMedal.entity.MedalEntity;

import javax.swing.*;
import java.awt.*;

public class MedalInfoPanel extends JPanel {
    private JPanel contentPane;
    private MedalLogoPanel medalLogo;
    private JLabel textStreamer;
    private JLabel textCurrent;
    private JLabel textToday;
    private JLabel textMax;
    private MedalEntity.DataBean.UserBean.MedalBean medalBean;

    public MedalInfoPanel(MedalEntity.DataBean.UserBean.MedalBean medalBean) {
        this.medalBean = medalBean;
        this.add(contentPane);
        this.setLayout(new FlowLayout(FlowLayout.LEADING));
        textStreamer.setText(medalBean.getTargetName());
        textCurrent.setText(String.valueOf(medalBean.getIntimacy()));
        textToday.setText(String.valueOf(medalBean.getTodayIntimacy()));
        textMax.setText(String.valueOf(medalBean.getDayLimit()));
    }

    private void createUIComponents() {
        medalLogo = new MedalLogoPanel(medalBean.getMedalName(), medalBean.getLevel(), medalBean.getMedalColor());
    }
}
