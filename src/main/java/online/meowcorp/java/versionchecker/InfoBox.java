package online.meowcorp.java.versionchecker;

import javax.swing.*;

public class InfoBox {
    public static void infoBox(String infoMessage, String titleBar) {
        JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
}
