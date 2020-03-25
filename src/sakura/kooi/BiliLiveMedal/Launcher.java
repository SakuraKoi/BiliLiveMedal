package sakura.kooi.BiliLiveMedal;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.io.PrintWriter;
import java.io.StringWriter;

public class Launcher {
    private static String getStackTraceAsString(Throwable ex) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        ex.printStackTrace(pw);
        return sw.toString();
    }

    public static void main(String[] args) {
        FlatLightLaf.install();
        Thread.setDefaultUncaughtExceptionHandler((thread, ex) -> {
            JOptionPane.showMessageDialog(null, "发生了异常错误: "+ getStackTraceAsString(ex), "查询失败", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        });
        MainForm dialog = new MainForm();
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }
}
