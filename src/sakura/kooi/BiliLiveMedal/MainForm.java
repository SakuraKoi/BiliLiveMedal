package sakura.kooi.BiliLiveMedal;

import sakura.kooi.BiliLiveMedal.entity.MedalEntity;
import sakura.kooi.BiliLiveMedal.entity.RoomRankEntity;
import sakura.kooi.BiliLiveMedal.entity.UserFollowEntity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.util.List;
import java.util.*;

public class MainForm extends JFrame {
    private JPanel contentPane;
    private JButton btnMedalInfo;
    private JTextField textMedalUID;
    private JTextField textRankRoom;
    private JButton btnRoomRank;
    private JTextField textSelfUID;
    private JLabel lblAuthor;
    private JLabel lblVersion;
    private JTextField textFollowUID;
    private JButton btnFollows;
    private JCheckBox checkUseMobileAPI;

    public MainForm() {
        this.setContentPane(contentPane);
        this.setTitle("Bilibili直播 粉丝勋章工具包");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        lblVersion.setText("Version."+Constants.VERSION);
        btnMedalInfo.addActionListener(e -> {
            if (textMedalUID.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "请输入正确的用户UID", "参数错误", JOptionPane.ERROR_MESSAGE);
                return;
            }
            long uid;
            try {
                uid = Long.valueOf(textMedalUID.getText().trim());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "请输入正确的用户UID", "参数错误", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try {
                MedalEntity entity = API.liveMedals(Collections.singletonList(uid));
                new MedalInfoDialog(uid, entity.getData().getUsers().values().iterator().next().getMedals().values()).setVisible(true);
            } catch (BiliException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "查询失败", JOptionPane.ERROR_MESSAGE);
            }
        });

        btnRoomRank.addActionListener(e -> {
            if (textRankRoom.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "请输入正确的房间号", "参数错误", JOptionPane.ERROR_MESSAGE);
                return;
            }
            long room;
            try {
                room = Long.valueOf(textRankRoom.getText().trim());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "请输入正确的房间号", "参数错误", JOptionPane.ERROR_MESSAGE);
                return;
            }
            long uid = -1L;
            if (!textSelfUID.getText().trim().isEmpty()) {
                try {
                    uid = Long.valueOf(textSelfUID.getText().trim());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "请输入正确的用户UID", "参数错误", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            // query room info
            try {
                long streamerUid = API.roomInfo(room).getData().getUid();

                String selfName = null;
                if (uid != -1) {
                    try {
                        selfName = API.userInfo(uid).data.name;
                    } catch (BiliException ex) {
                        selfName = "用户名获取失败";
                    }
                }

                ArrayList<RoomRankEntity.DataBean.MedalBean> ranks = new ArrayList<>();
                if (checkUseMobileAPI.isSelected()) {
                    RoomRankEntity roomRankEntity = API.roomRankMobile(room, streamerUid, 1);
                    RoomRankEntity roomRankEntity2 = API.roomRankMobile(room, streamerUid, 2);
                    ranks.addAll(roomRankEntity.getData().getList());
                    ranks.addAll(roomRankEntity2.getData().getList());
                } else {
                    RoomRankEntity roomRankEntity = API.roomRankWeb(room, streamerUid);
                    ranks.addAll(roomRankEntity.getData().getList());
                }
                if (!ranks.isEmpty()) {
                   Map<String, MedalEntity.DataBean.UserBean.MedalBean> medals = new HashMap<>();
                    ArrayList<Long> uidList = new ArrayList<>();
                    if (uid != -1) uidList.add(uid);
                    LinkedList<RoomRankEntity.DataBean.MedalBean> uids = new LinkedList<>(ranks);
                    while(!uids.isEmpty()) {
                        uidList.clear();;
                        while (uidList.size() < 10) {
                            if (uids.isEmpty()) break;
                            uidList.add((long) uids.pop().getUid());
                        }
                        MedalEntity medalEntity = API.liveMedals(uidList);
                        medalEntity.getData().getUsers().entrySet().stream().forEach(entry -> medals.put(entry.getKey(), entry.getValue().getMedals().get(String.valueOf(streamerUid))));
                    }
                    new RoomRankDialog(room, uid, selfName, ranks, medals).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "所查询的直播间没有任何人拥有粉丝勋章", "你有问题.jpg", JOptionPane.ERROR_MESSAGE);
                }
            } catch (BiliException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "查询失败", JOptionPane.ERROR_MESSAGE);
            }
        });
        lblAuthor.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e)
            {
                Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
                if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
                    try {
                        desktop.browse(URI.create("https://github.com/SakuraKoi"));
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        btnFollows.addActionListener(e -> {
            if (textFollowUID.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "请输入正确的用户UID", "参数错误", JOptionPane.ERROR_MESSAGE);
                return;
            }
            long uid;
            try {
                uid = Long.valueOf(textFollowUID.getText().trim());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "请输入正确的用户UID", "参数错误", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try {
                UserFollowEntity followEntity = API.getFollowing(uid, 1);
                new UserFollowDialog(followEntity, uid).setVisible(true);
            } catch (BiliException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "查询失败", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    private List<Long> joinUidList(List<RoomRankEntity.DataBean.MedalBean> list, long uid) {
        HashSet<Long> set = new HashSet<>();
        for (RoomRankEntity.DataBean.MedalBean bean : list) {
            set.add((long) bean.getUid());
        }
        if (uid != -1) {
            set.add(uid);
        }
        return new ArrayList<>(set);
    }

    @Override
    public void dispose() {
        super.dispose();
        System.exit(0);
    }
}
