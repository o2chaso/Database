package t2_AWT;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class T09_Panel3 extends Frame implements WindowListener, ActionListener{
	public T09_Panel3() {
		designView();
	}
	
//	------------------ User InterFace(UI) ------------------
	private void designView() {
		setTitle("AWT Frame(GridLayout/Panel)");
		setLayout(new GridLayout(1, 3));
		setBounds(1000, 50, 400, 350);
		
		Panel pn1 = new Panel();
		Panel pn2 = new Panel(new GridLayout(3, 1));
		Panel pn3 = new Panel();
		Panel pn4 = new Panel();
		Panel pn5 = new Panel();
		Panel pn6 = new Panel();
		
		pn1.setBackground(Color.DARK_GRAY);
		pn2.setBackground(Color.DARK_GRAY);
		pn3.setBackground(Color.DARK_GRAY);
		pn4.setBackground(Color.blue);
		pn5.setBackground(Color.YELLOW);
		pn6.setBackground(Color.blue);
		
		
		Label lbl1 = new Label("First Panel");
		Label lbl2 = new Label("2nd Panel");
		Label lbl3 = new Label("3nd Panel");
		
		Button btn1 = new Button("First");
		Button btn2 = new Button("EXIT");
		
		pn1.add(btn1);
		pn2.add(pn4);
		pn2.add(pn5);
		pn2.add(pn6);
		pn3.add(btn2);
		pn4.add(lbl1);
		pn5.add(lbl2);
		pn6.add(lbl3);

		add(pn1);
		add(pn2);
		add(pn3);

		
		addWindowListener(this);
		setVisible(true);
	}
	
	//	------------- User InterFace(UI) Setting -------------
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
    if ("EXIT".equals(cmd)) {
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
		new T09_Panel3();
	}
}
