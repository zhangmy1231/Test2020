package okay1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Test5 {
	public static void main(String[] args) throws Exception {
        final JFrame jf = new JFrame("���Դ���");
        jf.setSize(400, 400);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        /*
         * 1. ��Ϣ�Ի�����Ϣ��Ϣ��
         */
        JButton btn01 = new JButton("��������JACK����Ϣ");
        btn01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ��Ϣ�Ի����޷���, ����֪ͨ����
                JOptionPane.showMessageDialog(
                        jf,
                        "How do you do ?",
                        "��Ϣ����",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });

        /*
         * 2. ��Ϣ�Ի��򣨾�����Ϣ��
         */
        JButton btn02 = new JButton("showMessageDialog");
        btn02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ��Ϣ�Ի����޷���, ����֪ͨ����
                JOptionPane.showMessageDialog(
                        jf,
                        "Hello Warning Message",
                        "��Ϣ����",
                        JOptionPane.WARNING_MESSAGE
                );
            }
        });

        /*
         * 3. ȷ�϶Ի���
         */
        JButton btn03 = new JButton("showConfirmDialog");
        btn03.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*
                 * �����û������ѡ��, ֵΪ��������֮һ:
                 *     ��:   JOptionPane.YES_OPTION
                 *     ��:   JOptionPane.NO_OPTION
                 *     ȡ��: JOptionPane.CANCEL_OPTION
                 *     �ر�: JOptionPane.CLOSED_OPTION
                 */
                int result = JOptionPane.showConfirmDialog(
                        jf,
                        "ȷ��ɾ����",
                        "��ʾ",
                        JOptionPane.YES_NO_CANCEL_OPTION
                );
                System.out.println("ѡ����: " + result);
            }
        });

        /*
         * 4. ����Ի����ı������룩
         */
        JButton btn04 = new JButton("���������������");
        btn04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ��ʾ����Ի���, �������������
                String inputContent = JOptionPane.showInputDialog(
                        jf,
                        "TOM",
                        "Ĭ������"
                );
                System.out.println("���������: " + inputContent);
            }
        });

        /*
         * 5. ����Ի���������ѡ��
         */
        JButton btn05 = new JButton("ѡ��һ��ˮ����");
        btn05.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object[] selectionValues = new Object[]{"�㽶", "ѩ��", "ƻ��"};

                // ��ʾ����Ի���, ����ѡ�������, ���ȡ����ر�, �򷵻�null
                Object inputContent = JOptionPane.showInputDialog(
                        jf,
                        "ѡ��һ��: ",
                        "����",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        selectionValues,
                        selectionValues[0]
                );
                System.out.println("���������: " + inputContent);
            }
        });

        /*
         * 6. ѡ��Ի���
         */
        JButton btn06 = new JButton("showOptionDialog");
        btn06.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ѡ�ť
                Object[] options = new Object[]{"�㽶", "ѩ��", "ƻ��"};

                // ��ʾѡ��Ի���, ����ѡ���ѡ������, ����رհ�ť����-1
                int optionSelected = JOptionPane.showOptionDialog(
                        jf,
                        "����һ����ťѡ��һ��",
                        "�Ի������",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.ERROR_MESSAGE,
                        null,
                        options,    // �����null, ��ťΪ optionType ��������ʾ�İ�ť��Ҳ����ȷ�϶Ի���
                        options[0]
                );

                if (optionSelected >= 0) {
                    System.out.println("����İ�ť: " + options[optionSelected]);
                }
            }
        });

        // ��ֱ���а�ť
        Box vBox = Box.createVerticalBox();
        vBox.add(btn01);
        vBox.add(btn02);
        vBox.add(btn03);
        vBox.add(btn04);
        vBox.add(btn05);
        vBox.add(btn06);

        JPanel panel = new JPanel();
        panel.add(vBox);

        jf.setContentPane(panel);
        jf.setVisible(true);
    }

}


