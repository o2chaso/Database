package t3_Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class T01_Basic extends JFrame{
	
	public T01_Basic() {
		super("Swing Test");
		designView();
	}
	
//	------------- User InterFace(UI) Setting -------------
	private void designView() {
		setBounds(1000, 50, 400, 350);		
		
		JButton btnExit = new JButton("Exit");
		add(btnExit);
		
		setVisible(true);
		
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new T01_Basic();
	}
}
