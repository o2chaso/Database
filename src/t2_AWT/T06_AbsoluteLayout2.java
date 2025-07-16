package t2_AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class T06_AbsoluteLayout2 extends Frame implements WindowListener, ActionListener{
	public T06_AbsoluteLayout2() {
		designView();
	}
	
//	------------------ User InterFace(UI) ------------------
	private void designView() {
		setTitle("AWT Frame(AbsoluteLayout)");
		setLayout(null);
		setBounds(1000, 50, 400, 350);
		
		int x = 100, y= 100, w = 150, h = 30;
		Button btn1 = new Button("btn1");
		Button btn2 = new Button("btn2");
		Button btn3 = new Button("btn3");
		Button btn4 = new Button("btn4");
		Button btnExit = new Button("Exit");
		
		// x, y, w, h
		btn1.setBounds(x, y, w, h);
		btn2.setBounds(x, y+40, w, h);
		btn3.setBounds(x, y+80, w, h);
		btn4.setBounds(x, y+120, w, h);
		btnExit.setBounds(x, y+180, w, h);
		
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
		new T06_AbsoluteLayout2();
	}
}
