package okay1;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

public class Test1 {
	public static void main(String[] args) {
		
		final JFrame frame = new JFrame();
		frame.setSize(400, 400);
		
		frame.addWindowListener(new WindowListener() {						
			@Override
			public void windowOpened(WindowEvent arg0) {
				System.out.println("�������");
			}						
			@Override
			public void windowIconified(WindowEvent arg0) {
				System.out.println("������С����");
			}						
			@Override
			public void windowDeiconified(WindowEvent arg0) {
				System.out.println("������С������ԭ��");
			}						
			@Override
			public void windowDeactivated(WindowEvent arg0) {
				System.out.println("����ʧȥ������");
			}						
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.out.println("����ر�");
				//frame.dispose();  //��windowClosing������ִ��dispose������windowClosed����ִ��,���ʹ����frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)����windowClosed������ִ��
			}						
			@Override
			public void windowClosed(WindowEvent arg0) {
				System.out.println("�����Ѿ��ر���");
			}						
			@Override
			public void windowActivated(WindowEvent arg0) {
				System.out.println("�����ý���");
			}
		});										
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}		
}
