package okay1;


import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Test9 {
	 public static void main(String[] args) throws Exception {
	        final JFrame jf = new JFrame("���Դ���");
	        jf.setSize(300, 300);
	        jf.setLocationRelativeTo(null);
	        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	        /*
	         * ����һ���˵���
	         */
	        JMenuBar menuBar = new JMenuBar();

	        /*
	         * ����һ���˵�
	         */
	        JMenu fileMenu = new JMenu("�ļ�");
	        JMenu editMenu = new JMenu("�༭");
	        JMenu viewMenu = new JMenu("��ͼ");
	        JMenu aboutMenu = new JMenu("����");
	        // һ���˵���ӵ��˵���
	        menuBar.add(fileMenu);
	        menuBar.add(editMenu);
	        menuBar.add(viewMenu);
	        menuBar.add(aboutMenu);

	        /*
	         * ���� "�ļ�" һ���˵����Ӳ˵�
	         */
	        JMenuItem newMenuItem = new JMenuItem("�½�");
	        JMenuItem openMenuItem = new JMenuItem("��");
	        JMenuItem exitMenuItem = new JMenuItem("�˳�");
	        // �Ӳ˵���ӵ�һ���˵�
	        fileMenu.add(newMenuItem);
	        fileMenu.add(openMenuItem);
	        fileMenu.addSeparator();       // ���һ���ָ���
	        fileMenu.add(exitMenuItem);

	        /*
	         * ���� "�༭" һ���˵����Ӳ˵�
	         */
	        JMenuItem copyMenuItem = new JMenuItem("����");
	        JMenuItem pasteMenuItem = new JMenuItem("ճ��");
	        // �Ӳ˵���ӵ�һ���˵�
	        editMenu.add(copyMenuItem);
	        editMenu.add(pasteMenuItem);

	        /*
	         * ���� "��ͼ" һ���˵����Ӳ˵�
	         */
	        final JCheckBoxMenuItem checkBoxMenuItem = new JCheckBoxMenuItem("��ѡ���Ӳ˵�");
	        final JRadioButtonMenuItem radioButtonMenuItem01 = new JRadioButtonMenuItem("��ѡ��ť�Ӳ˵�01");
	        final JRadioButtonMenuItem radioButtonMenuItem02 = new JRadioButtonMenuItem("��ѡ��ť�Ӳ˵�02");
	        // �Ӳ˵���ӵ�һ���˵�
	        viewMenu.add(checkBoxMenuItem);
	        viewMenu.addSeparator();                // ���һ���ָ���
	        viewMenu.add(radioButtonMenuItem01);
	        viewMenu.add(radioButtonMenuItem02);

	        // �������� ��ѡ��ť�Ӳ˵���Ҫʵ�ֵ�ѡ��ť��Ч������Ҫ�����Ƿŵ�һ����ť����
	        ButtonGroup btnGroup = new ButtonGroup();
	        btnGroup.add(radioButtonMenuItem01);
	        btnGroup.add(radioButtonMenuItem02);

	        // Ĭ�ϵ�һ����ѡ��ť�Ӳ˵�ѡ��
	        radioButtonMenuItem01.setSelected(true);

	        /*
	         * �˵���ĵ��/״̬�ı��¼��������¼���������ֱ�������ھ�����Ӳ˵��ϣ�����ֻ�������м�����
	         */
	        // ���� "�½�" �Ӳ˵�������ļ�����
	        newMenuItem.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                System.out.println("�½�  �����");
	            }
	        });
	        // ���� "��" �Ӳ˵�������ļ�����
	        openMenuItem.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                System.out.println("��  �����");
	            }
	        });
	        // ���� "�˳�" �Ӳ˵�������ļ�����
	        exitMenuItem.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                System.out.println("�˳�  �����");
	            }
	        });

	        // ���� ��ѡ���Ӳ˵� ״̬�ı� ������
	        checkBoxMenuItem.addChangeListener(new ChangeListener() {
	            @Override
	            public void stateChanged(ChangeEvent e) {
	                System.out.println("��ѡ���Ƿ�ѡ��: " + checkBoxMenuItem.isSelected());
	            }
	        });

	        // ���� ��ѡ��ť�Ӳ˵� ״̬�ı� ������
	        radioButtonMenuItem01.addChangeListener(new ChangeListener() {
	            @Override
	            public void stateChanged(ChangeEvent e) {
	                System.out.println("��ѡ��ť01 �Ƿ�ѡ��: " + radioButtonMenuItem01.isSelected());
	            }
	        });

	        /*
	         * ��� �Ѳ˵������õ�����
	         */
	        jf.setJMenuBar(menuBar);

	        jf.setVisible(true);
	    }

	}
	
