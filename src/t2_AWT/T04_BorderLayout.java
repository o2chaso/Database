package t2_AWT;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class T04_BorderLayout extends Frame implements WindowListener, ActionListener{
	public T04_BorderLayout() {
		designView();
	}
	
//	------------------ User InterFace(UI) ------------------
	private void designView() {
		setTitle("AWT Frame(BorderLayout)");
		setLayout(new BorderLayout());
		setBounds(1000, 50, 400, 350);
		
		Button btnN = new Button("North");
		Button btnW = new Button("West");
		Button btnS = new Button("South");
		Button btnE = new Button("East");
		Button btnC = new Button("Center(종료)");
		
		add(btnN, BorderLayout.NORTH);
		add(btnW, BorderLayout.WEST);
		add(btnS, BorderLayout.SOUTH);
		add(btnE, BorderLayout.EAST);
//		add(btnC, BorderLayout.CENTER);
		add(btnC, "Center");
		
		addWindowListener(this);
		btnC.addActionListener(this);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Button btnText = (Button) e.getSource();
		if(btnText.getLabel().equals("Center(종료)")) {
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
		new T04_BorderLayout();
	}
}
