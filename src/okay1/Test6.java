package okay1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Test6 {
	 public static void main(String[] args) {
	        JFrame jf = new JFrame("���Դ���");
	        jf.setSize(300, 300);
	        jf.setLocationRelativeTo(null);
	        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	        // ���� ������壬ʹ�� �߽粼��
	        JPanel panel = new JPanel(new BorderLayout());

	        // ���� һ��������ʵ��
	        JToolBar toolBar = new JToolBar("���Թ�����");

	        // ���� ��������ť
	        JButton previousBtn = new JButton(new ImageIcon("previous.png"));
	        JButton pauseBtn = new JButton(new ImageIcon("pause.png"));
	        JButton nextBtn = new JButton(new ImageIcon("next.png"));

	        // ��� ��ť �� ������
	        toolBar.add(previousBtn);
	        toolBar.add(pauseBtn);
	        toolBar.add(nextBtn);

	        // ����һ���ı�����������������Ϣ
	        final JTextArea textArea = new JTextArea();
	        textArea.setLineWrap(true);

	        // ��� ��ť �ĵ�����������������������Ϣ���뵽 �ı�����
	        previousBtn.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                textArea.append("����1\n");
	            }
	        });
	        pauseBtn.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                textArea.append("��ͣ\n");
	            }
	        });
	        nextBtn.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                textArea.append("����2\n");
	            }
	        });

	        // ��� ������ �� ������� �� ����
	        panel.add(toolBar, BorderLayout.PAGE_START);
	        // ��� �ı����� �� ������� �� �м�
	        panel.add(textArea, BorderLayout.CENTER);

	        jf.setContentPane(panel);
	        jf.setVisible(true);
	     }

	}
	
