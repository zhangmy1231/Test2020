
package okay1;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Test4 {
	
       public static void main(String[] args) {
	        final JFrame jf = new JFrame("���Դ���");
	        jf.setSize(400, 400);
	        jf.setLocationRelativeTo(null);
	        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	        JPanel panel = new JPanel();

	        JButton btn = new JButton("��ʾ����");
	        btn.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // �����ť, ��ʾ�µ�һ������
	                showNewWindow(jf);
	            }
	        });
	        panel.add(btn);

	        jf.setContentPane(panel);
	        jf.setVisible(true);
	    }

	    public static void showNewWindow(JFrame relativeWindow) {
	        // ����һ���´���
	        JFrame newJFrame = new JFrame("�µĴ���");

	        newJFrame.setSize(250, 250);

	        // ���´��ڵ�λ�����õ� relativeWindow ���ڵ�����
	        newJFrame.setLocationRelativeTo(relativeWindow);

	        // ������ڹرհ�ť, ִ�����ٴ��ڲ������������Ϊ EXIT_ON_CLOSE, �����´��ڹرհ�ť��, �������̽�������
	        newJFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

	        // ��������Ϊ���ɸı��С
	        newJFrame.setResizable(false);

	        JPanel panel = new JPanel(new GridLayout(1, 1));

	        // ���´�������ʾһ����ǩ
	        JLabel label = new JLabel("����һ��С����");
	        label.setFont(new Font(null, Font.PLAIN, 25));
	        label.setHorizontalAlignment(SwingConstants.CENTER);
	        label.setVerticalAlignment(SwingConstants.CENTER);
	        panel.add(label);

	        newJFrame.setContentPane(panel);
	        newJFrame.setVisible(true);
	    }

	}
	

