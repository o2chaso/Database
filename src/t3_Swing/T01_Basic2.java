package t3_Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class T01_Basic2 extends JFrame{
	
	public T01_Basic2() {
		super("Swing Test");
		designView();
	}
	
//	------------- User InterFace(UI) Setting -------------
	private void designView() {
		setSize(400,350);
		setLocationRelativeTo(null);	// Place in the center of the window
		setDefaultCloseOperation(3);	// Close Window button to perform a window closure
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);	// Window size fixed
		
		JButton btnExit = new JButton("Exit");
		add(btnExit);
		
		setVisible(true);
		
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new T01_Basic2();
	}
}
