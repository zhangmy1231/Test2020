package okay1;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class Test2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		
		frame.addWindowListener(new WindowAdapter() {   //匿名内部类实现方式
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.out.println("窗体关闭了");
			
			
			}	
		});
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
