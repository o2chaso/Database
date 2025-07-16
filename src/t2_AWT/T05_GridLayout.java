package t2_AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class T05_GridLayout extends Frame implements WindowListener, ActionListener{
	public T05_GridLayout() {
		designView();
	}
	
//	------------------ User InterFace(UI) ------------------
	private void designView() {
		setTitle("AWT Frame(GridLayout)");
		setLayout(new GridLayout(2, 3));
		setBounds(1000, 50, 400, 350);
		
		Button btn1 = new Button("btn1");
		Button btn2 = new Button("btn2");
		Button btn3 = new Button("btn3");
		Button btn4 = new Button("btn4");
		Button btnExit = new Button("Exit");
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btnExit);
		
		addWindowListener(this);
		btnExit.addActionListener(this);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Button btnText = (Button) e.getSource();
		if(btnText.getLabel().equals("Exit")) {
			System.exit(0);
		}
	}

	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}
	
	public static void main(String[] args) {
		new T05_GridLayout();
	}
}
