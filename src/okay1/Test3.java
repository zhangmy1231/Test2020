package okay1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Test3 {
	public static void main(String[] args) {
		final JFrame frame = new JFrame();
		frame.setSize(400, 400);
		
		frame.setLayout(null);
		JButton btn = new JButton("按钮");
		btn.setBounds(8, 8, 80,20);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//JOptionPane.showConfirmDialog(null, "请选择一项","选择框",JOptionPane.YES_OPTION);
				JOptionPane.showMessageDialog(null,"Error", "错误提示框", JOptionPane.ERROR_MESSAGE);
				/*JDialog d = new JDialog();
				d.setSize(200, 200);
				d.add(new JButton("按钮"));
				d.setVisible(true);*/
			}
		});
		
		frame.add(btn);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}		

}
