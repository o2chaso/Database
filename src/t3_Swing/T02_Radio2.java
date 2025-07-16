package t3_Swing;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class T02_Radio2 extends JFrame{
	
	public T02_Radio2() {
		super("Radio Swing Test");
		designView();
	}
	
//	------------- DesignView InterFace(UI) Setting -------------
	private void designView() {
		setSize(400,350);
		setLocationRelativeTo(null);	
		setDefaultCloseOperation(3);
		setResizable(false);	
		
		setLayout(new GridLayout(4, 1));
		JPanel pn1 = new JPanel();
		JPanel pn2 = new JPanel();
		JPanel pn3 = new JPanel();
		JPanel pn4 = new JPanel();
		
		pn1.setBackground(Color.lightGray);
		pn2.setBackground(Color.cyan);
		pn3.setBackground(Color.cyan);
		pn4.setBackground(Color.cyan);
		
		JLabel lbl = new JLabel("Swing");
		pn1.add(lbl);
		
		//	Check Button
		JCheckBox chkgames1 = new JCheckBox("MMORPG");
		JCheckBox chkgames2 = new JCheckBox("RPG");
		JCheckBox chkgames3 = new JCheckBox("FPS");
		JCheckBox chkgames4 = new JCheckBox("AOS");
		
		pn2.add(chkgames1);
		pn2.add(chkgames2);
		pn2.add(chkgames3);
		pn2.add(chkgames4);

		//	Radio Button
		CheckboxGroup gender = new CheckboxGroup();
		Checkbox chkMale = new Checkbox("Male", gender, false);
		Checkbox chkFeMale = new Checkbox("FeMale", gender, true);
		
		pn3.add(chkMale);
		pn3.add(chkFeMale);
		
		JButton btnExit = new JButton("Exit");
		pn4.add(btnExit);
		
		add(pn1);
		add(pn2);
		add(pn3);
		add(pn4);
		
		setVisible(true);
		
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new T02_Radio2();
	}
}
