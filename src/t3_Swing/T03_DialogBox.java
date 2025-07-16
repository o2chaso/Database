package t3_Swing;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class T03_DialogBox extends JFrame{
	
	public T03_DialogBox() {
		super("Radio Swing Test");
		designView();
	}
	
//	------------- DesignView InterFace(UI) Setting -------------
	private void designView() {
		setSize(400,350);
		setLocationRelativeTo(null);	
		setDefaultCloseOperation(3);
		setResizable(false);	
		
		setLayout(new GridLayout(2, 1));
		
		JPanel pn1 = new JPanel();
		JPanel pn2 = new JPanel();
		
		pn1.setBackground(Color.lightGray);
		pn2.setBackground(Color.cyan);
		
		JButton btn1 = new JButton("Warning!");
		JButton btn2 = new JButton("Input");
		JButton btn3 = new JButton("Exit(Yes/No)");
		JButton btn4 = new JButton("Exit(Yes/No/Cancel)");
		JButton btnExit = new JButton("Exit)");
		
		pn1.add(btn1);
		pn1.add(btn2);
		pn1.add(btn3);
		pn1.add(btn4);
		pn1.add(btnExit);
		
		JLabel lblMessage = new JLabel("Out Print Message!");
		pn2.add(lblMessage);
		
		add(pn1);
		add(pn2);
		
		setVisible(true);
//	------------- DesignView InterFace(UI) Setting -------------
		
		//	Warning Message Print
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblMessage.setText("Clack Warning Button!");
				JOptionPane.showMessageDialog(null, lblMessage.getText(), "Warning Message", JOptionPane.WARNING_MESSAGE);
			}
		});
		//	Input Message Print
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblMessage.setText("Clack Input Button!");
				String name =  JOptionPane.showInputDialog(null, "Please enter your name", "Input", JOptionPane.DEFAULT_OPTION);
				if(name != null) lblMessage.setText("User name: " + name);
			}
		});
		//	Exit Yes/No Message Print
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblMessage.setText("Clack Exit Yes/No Button!");
				int ans = JOptionPane.showConfirmDialog(null, "Do you want to continue working on it?", "End of Job window", JOptionPane.YES_NO_OPTION);
				if(ans == 0) {
					JOptionPane.showMessageDialog(null, "Continue the operation.");
				}
				else {
					JOptionPane.showMessageDialog(null, "Close the operation.");
					System.exit(0);
				}
			}
		});
		//	Exit Yes/No/Cancel Message Print
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblMessage.setText("Clack Exit Yes/No/Cancel Button!");
				int ans = JOptionPane.showConfirmDialog(null, "Do you want to continue working on it?", "End of Job window", JOptionPane.YES_NO_CANCEL_OPTION);
				if(ans == 0) {
					JOptionPane.showMessageDialog(null, "Continue the operation.");
				}
				else if(ans == 1) {
					JOptionPane.showMessageDialog(null, "Close the operation.");
					System.exit(0);
				}
				else {
					JOptionPane.showMessageDialog(null, "Cancel the operation.");
					System.exit(0);
				}
			}
		});
		
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new T03_DialogBox();
	}
}
