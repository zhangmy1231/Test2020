package okay1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Test7 {
	public static void main(String[] args) throws Exception {
        final JFrame jf = new JFrame("���Դ���");
        jf.setSize(300, 300);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        // ����һ����ǩ, ������ʾѡ���ԭɫ
        final JLabel label = new JLabel();
        label.setPreferredSize(new Dimension(150, 150));
        label.setOpaque(true);
        panel.add(label);

        JButton btn = new JButton("ѡ����ɫ");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ��ʾ��ɫѡȡ���Ի���, ����ѡȡ����ɫ���߳̽�������, ֱ���Ի��򱻹رգ�
                Color color = JColorChooser.showDialog(jf, "ѡȡ��ɫ", null);

                // ����û�ȡ����رմ���, �򷵻ص� color Ϊ null
                if (color == null) {
                    return;
                }

                // ��ѡȡ����ɫ����Ϊ��ǩ�ı���
                label.setBackground(color);

                // ��ȡ��ɫ�� ARGB ��������ֵ
                int alpha = color.getAlpha();
                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();

                label.setText("A=" + String.format("%02x", alpha) + ", " +
                        String.format("#%02x%02x%02x", red, green, blue));
            }
        });
        panel.add(btn);

        jf.setContentPane(panel);
        jf.setVisible(true);
    }

}

