package sakura.kooi.BiliLiveMedal.gui;

import sakura.kooi.BiliLiveMedal.entity.UserFollowEntity;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.net.URL;

public class FollowPanel extends JPanel {
    private JPanel contentPane;
    private JLabel img;
    private JLabel userName;
    private JLabel userSign;

    public FollowPanel(UserFollowEntity.DataBean.ListBean bean) {
        this.add(contentPane);
        this.setLayout(new FlowLayout(FlowLayout.LEADING));
        userName.setText(bean.uname);
        userSign.setText(bean.sign);
        MouseAdapter adapter = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
                if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
                    try {
                        desktop.browse(URI.create("https://space.bilibili.com/"+bean.mid));
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        };
        userName.addMouseListener(adapter);
        img.addMouseListener(adapter);
        Dimension size = new Dimension(48, 48);
        img.setPreferredSize(size);
        img.setMaximumSize(size);
        img.setMinimumSize(size);
        img.setSize(size);
        new Thread(() -> {
            try {
                URL url = new URL(bean.face);
                Image image = ImageIO.read(url).getScaledInstance(48, 48, Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(image);
                img.setIcon(icon);
                img.setText("");
            } catch (Exception e) {
                img.setText("头像出错");
            }
        }).start();
    }
}
