package sakura.kooi.BiliLiveMedal;

import sakura.kooi.BiliLiveMedal.entity.UserFollowEntity;
import sakura.kooi.BiliLiveMedal.gui.FollowPanel;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class UserFollowDialog extends JDialog {
    private JPanel contentPane;
    private JButton btnPrev;
    private JButton btnNext;
    private JButton btnOk;
    private JLabel lblCurrentPage;
    private JLabel lblMaxPage;
    private JPanel containerFollowing;
    private int maxPage;
    private int page = 1;

    public UserFollowDialog(UserFollowEntity followEntity, long uid) {
        this.setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(btnOk);
        this.setTitle("用户 "+uid+" 的关注列表");
        this.setPreferredSize(new Dimension(1024, 550));
        btnPrev.setEnabled(false);
        maxPage = (followEntity.data.total+49)/50;
        lblMaxPage.setText(String.valueOf(maxPage));
        btnOk.addActionListener(e -> onOK());
        btnNext.addActionListener(e -> {
            btnPrev.setEnabled(page > 1);
            btnNext.setEnabled(page < maxPage);
            try {
                updateFollowingList(API.getFollowing(uid, page+1).data.list);
                page++;
                lblCurrentPage.setText(String.valueOf(page));
            } catch (BiliException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "查询失败", JOptionPane.ERROR_MESSAGE);
            }
        });
        btnPrev.addActionListener(e -> {
            btnPrev.setEnabled(page > 1);
            btnNext.setEnabled(page < maxPage);
            try {
                updateFollowingList(API.getFollowing(uid, page-1).data.list);
                page--;
                lblCurrentPage.setText(String.valueOf(page));
            } catch (BiliException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "查询失败", JOptionPane.ERROR_MESSAGE);
            }
        });
        updateFollowingList(followEntity.data.list);
        containerFollowing.setLayout(new java.awt.GridLayout(0,1));
        pack();
        this.setLocationRelativeTo(null);
    }

    private void onOK() {
        dispose();
    }

    private void updateFollowingList(List<UserFollowEntity.DataBean.ListBean> list) {
        containerFollowing.removeAll();
        for (UserFollowEntity.DataBean.ListBean bean : list) {
            containerFollowing.add(new FollowPanel(bean));
        }
    }
}
