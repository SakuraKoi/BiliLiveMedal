package sakura.kooi.BiliLiveMedal;

import sakura.kooi.BiliLiveMedal.entity.MedalEntity;
import sakura.kooi.BiliLiveMedal.entity.RoomRankEntity;
import sakura.kooi.BiliLiveMedal.gui.RankPanel;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Map;

public class RoomRankDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JPanel panelRankList;

    public RoomRankDialog(long room, long uid, String selfName, List<RoomRankEntity.DataBean.MedalBean> roomRankList, Map<String, MedalEntity.DataBean.UserBean.MedalBean> medals) {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        this.setPreferredSize(new Dimension(620, 460));
        this.setTitle("房间 "+room+" 的粉丝排行榜");
        panelRankList.setLayout(new java.awt.GridLayout(0,1));

        boolean onRank = false;
        MedalEntity.DataBean.UserBean.MedalBean selfBean = uid == -1 ? null : medals.get(String.valueOf(uid));
        for (int i = 0, size = roomRankList.size(); i<size; i++) {
            RoomRankEntity.DataBean.MedalBean roomRank = roomRankList.get(i);
            MedalEntity.DataBean.UserBean.MedalBean pointBean = medals.get(String.valueOf(roomRank.getUid()));
            panelRankList.add(new RankPanel(String.valueOf(roomRank.getRank()), roomRank, pointBean, selfBean, null));
            if (roomRank.getUid() == uid)
                onRank = true;
        }
        if (!onRank && uid != -1) {
            if (selfBean != null)
                panelRankList.add(new RankPanel("自己", null, selfBean, null, selfName));
        }
        buttonOK.addActionListener(e -> onOK());
        pack();
        this.setLocationRelativeTo(null);
    }

    private void onOK() {
        dispose();
    }
}
