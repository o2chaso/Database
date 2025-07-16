package t2_AWT;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class T03_FlowLayout extends Frame implements WindowListener, ActionListener{

	private Label lblTitle;

	public T03_FlowLayout() {
		setLayout(new FlowLayout());
		setTitle("AWT Frame(FlowLayout)");
//		setSize(300, 250);
		setBounds(1000, 50, 400, 350);
		
		lblTitle = new Label("Lable Test");
		add(lblTitle);
		
		Button btn1 = new Button("btn1");
		Button btn2 = new Button("btn2");
		Button btn3 = new Button("btn3");
		Button btn4 = new Button("btn4");
		Button btnExit = new Button("Exit");
//		btnAction.setLabel("Action");
		this.add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btnExit);
		
		
		addWindowListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btnExit.addActionListener(this);
		
		setVisible(true);
	
//	------------------------------ User InterFace(UI), 아래쪽 method(동작) 처리 ------------------------------
	}
	
	public static void main(String[] args) {
		new T03_FlowLayout();
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

	@Override
	public void actionPerformed(ActionEvent e) {
		Button btnText = (Button) e.getSource();
		if(btnText.getLabel().equals("btn1")) {
			System.out.println("btn1~~~~");
		}
		else if(btnText.getLabel().equals("btn2")) {
			System.out.println("btn2~~~~");
		}
		else if(btnText.getLabel().equals("btn3")) {
			lblTitle.setText("btn3 호출");
		}
		else if(btnText.getLabel().equals("btn4")) {
			lblTitle.setText("btn4 호출");
		}
		else if(btnText.getLabel().equals("Exit")){
			System.exit(0);
		}

	}
}
