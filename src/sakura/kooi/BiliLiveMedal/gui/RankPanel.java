package sakura.kooi.BiliLiveMedal.gui;

import org.jetbrains.annotations.Nullable;
import sakura.kooi.BiliLiveMedal.entity.MedalEntity;
import sakura.kooi.BiliLiveMedal.entity.RoomRankEntity;

import javax.swing.*;
import java.awt.*;

public class RankPanel extends JPanel {
    private JPanel contentPane;
    private MedalLogoPanel medalLogo;
    private JLabel textName;
    private JLabel textPoint;
    private JLabel textGuard;
    private JLabel textCompare;
    private JLabel textRank;
    private MedalEntity.DataBean.UserBean.MedalBean medalBean;

    public RankPanel(String rank, @Nullable RoomRankEntity.DataBean.MedalBean medalBean, MedalEntity.DataBean.UserBean.MedalBean pointBean, @Nullable MedalEntity.DataBean.UserBean.MedalBean selfBean, String selfName) {
        this.medalBean = pointBean;
        this.add(contentPane);
        this.setLayout(new FlowLayout(FlowLayout.LEADING));
        textRank.setText(rank);
        textRank.setPreferredSize(new Dimension(24, 12));
        textRank.setMaximumSize(new Dimension(24, 12));
        textRank.setMinimumSize(new Dimension(24, 12));
        textRank.setSize(new Dimension(24, 12));

        textName.setText(medalBean == null ? selfName : medalBean.getUname());
        textPoint.setText(String.valueOf(pointBean.getIntimacy()));
        textGuard.setText(toGuardLevelString(pointBean.getGuardType()));
        textCompare.setText(selfBean == null ? "" : compareWithPrevious(pointBean, selfBean));
        if (selfBean != null)
            textCompare.setForeground(compareColor(pointBean, selfBean));
    }

    private Color compareColor(MedalEntity.DataBean.UserBean.MedalBean pointBean, MedalEntity.DataBean.UserBean.MedalBean selfBean) {
        if (selfBean.getUid() == pointBean.getUid()) return new Color(0x1976d2);
        if (pointBean.getLevel() > selfBean.getLevel()) return new Color(0xff9100);
        if (pointBean.getLevel() < selfBean.getLevel()) return new Color(0x00796b);
        if (pointBean.getLevel() == selfBean.getLevel()) {
            if (pointBean.getIntimacy() > selfBean.getIntimacy()) {
                if (pointBean.getIntimacy() - selfBean.getIntimacy() > 2000)
                    return new Color(0xff5722);
                return new Color(0x651fff);
            }
            if (pointBean.getIntimacy() < selfBean.getIntimacy()) {
                if (selfBean.getIntimacy() - pointBean.getIntimacy() > 3000)
                    return new Color(0x2e7d32);
                return new Color(0xb71c1c);
            }
        }
        return new Color(0x1976d2);
    }

    private String compareWithPrevious(MedalEntity.DataBean.UserBean.MedalBean pointBean, MedalEntity.DataBean.UserBean.MedalBean selfBean) {
        if (selfBean == null) return "";
        if (selfBean.getUid() == pointBean.getUid()) return "<-- 我自己";
        if (selfBean.getLevel() != pointBean.getLevel()) {
            return "还差 " + Math.abs(pointBean.getLevel() - selfBean.getLevel()) + " 级 " + Math.abs(pointBean.getNextIntimacy() - pointBean.getIntimacy()) + " 亲密度";
        } else return "还差 " + Math.abs(pointBean.getIntimacy() - selfBean.getIntimacy()) + " 亲密度";
    }

    private String toGuardLevelString(int guardLevel) {
        if (guardLevel == 0) return "";
        if (guardLevel == 1) return "总督";
        if (guardLevel == 2) return "提督";
        if (guardLevel == 3) return "舰长";
        return "未知";
    }

    private void createUIComponents() {
        medalLogo = new MedalLogoPanel(medalBean.getMedalName(), medalBean.getLevel(), medalBean.getMedalColor());
    }
}
