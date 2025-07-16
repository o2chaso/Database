package t3_Swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class T02_Radio1 extends JFrame{
	
	public T02_Radio1() {
		super("Radio Swing Test");
		designView();
	}
	
//	------------- DesignView InterFace(UI) Setting -------------
	private void designView() {
		setSize(400,350);
		setLocationRelativeTo(null);	
		setDefaultCloseOperation(3);
		setResizable(false);	
		
		setLayout(new FlowLayout());
		JPanel pn1 = new JPanel();
		JPanel pn2 = new JPanel();
		
		pn1.setBackground(Color.lightGray);
		pn2.setBackground(Color.cyan);
		
		JLabel lbl = new JLabel("Swing");
		pn1.add(lbl);
		
		JButton btnExit = new JButton("Exit");
		pn2.add(btnExit);
		
		add(pn1);
		add(pn2);
		
		setVisible(true);
		
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new T02_Radio1();
	}
}
