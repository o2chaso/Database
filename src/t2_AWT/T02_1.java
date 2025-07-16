package t2_AWT;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class T02_1 extends Frame implements WindowListener{

	public T02_1() {
		setTitle("AWT Frame");
//		setSize(300, 250);
		setVisible(true);
		setBounds(3100, 50, 400, 350);
		addWindowListener(this);
	}
	
	public static void main(String[] args) {
		new T02_1();
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
}
