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
				System.out.println("窗体打开了");
			}						
			@Override
			public void windowIconified(WindowEvent arg0) {
				System.out.println("窗体最小化了");
			}						
			@Override
			public void windowDeiconified(WindowEvent arg0) {
				System.out.println("窗体最小化被还原了");
			}						
			@Override
			public void windowDeactivated(WindowEvent arg0) {
				System.out.println("窗体失去焦点了");
			}						
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.out.println("窗体关闭");
				//frame.dispose();  //在windowClosing方法中执行dispose方法，windowClosed方法执行,如果使用了frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)，则windowClosed方法不执行
			}						
			@Override
			public void windowClosed(WindowEvent arg0) {
				System.out.println("窗体已经关闭了");
			}						
			@Override
			public void windowActivated(WindowEvent arg0) {
				System.out.println("窗体获得焦点");
			}
		});										
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}		
}
