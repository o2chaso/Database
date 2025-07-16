package t2_AWT;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class T07_MouseEvent extends Frame implements WindowListener, ActionListener, MouseListener{
	public T07_MouseEvent() {
		designView();
	}
	
//	------------------ User InterFace(UI) ------------------
	private void designView() {
		setTitle("AWT Frame(MouseEvent)");
		setLayout(null);
		setBounds(1000, 50, 400, 350);
		
		addWindowListener(this);
		addMouseListener(this);
		setVisible(true);
		
	}
	
//	------------- User InterFace(UI) Setting -------------
//	Mouse
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("MouseClick!!!");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("MouseClick PutTime!!!");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("MouseClick OutTime!!!");
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse In the Class!!!");
	}
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse Out the Class!!!");
	}
	
//	Action
	@Override
	public void actionPerformed(ActionEvent e) {}
	
//	Window
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
		new T07_MouseEvent();
	}
}
