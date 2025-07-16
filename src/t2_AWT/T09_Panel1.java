package t2_AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class T09_Panel1 extends Frame implements WindowListener, ActionListener{
	public T09_Panel1() {
		designView();
	}
	
//	------------------ User InterFace(UI) ------------------
	private void designView() {
		setTitle("AWT Frame(GridLayout/Panel)");
		setLayout(new GridLayout(3, 1));
		setBounds(1000, 50, 400, 350);
		
		Panel pn1 = new Panel();
		Panel pn2 = new Panel();
		Panel pn3 = new Panel();
		
		Label lbl1 = new Label("First Panel");
		Label lbl2 = new Label("2nd Panel");
		Label lbl3 = new Label("Last Panel");
		
		pn1.add(lbl1);
		pn2.add(lbl2);
		pn3.add(lbl3);

		add(pn1);
		add(pn2);
		add(pn3);
		
		addWindowListener(this);
		setVisible(true);
	}
	
//	------------- User InterFace(UI) Setting -------------
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
		new T09_Panel1();
	}
}
