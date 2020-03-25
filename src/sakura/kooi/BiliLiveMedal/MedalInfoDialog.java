package sakura.kooi.BiliLiveMedal;

import sakura.kooi.BiliLiveMedal.entity.MedalEntity;
import sakura.kooi.BiliLiveMedal.gui.MedalInfoPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.List;

public class MedalInfoDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JPanel panelMedalList;

    public MedalInfoDialog(long uid, Collection<MedalEntity.DataBean.UserBean.MedalBean> medals) {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        this.setPreferredSize(new Dimension(750, 500));
        this.setTitle("UID "+uid+" 的粉丝勋章列表");
        panelMedalList.setLayout(new java.awt.GridLayout(0,1));
        for (MedalEntity.DataBean.UserBean.MedalBean bean : medals) {
            panelMedalList.add(new MedalInfoPanel(bean));
        }

        buttonOK.addActionListener(e -> onOK());
        pack();
        this.setLocationRelativeTo(null);
    }

    private void onOK() {
        dispose();
    }
}
