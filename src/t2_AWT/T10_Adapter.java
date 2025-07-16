package t2_AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class T10_Adapter extends Frame{
	
	public T10_Adapter() {
		super("Adapter Utilization Example");
		designView();
	}
	
	private void designView() {
		//	setTitle("Adapter Utilization Example");
		setBounds(1000, 50, 400, 350);
		
		Button btnExit = new Button("Exit");
		add(btnExit);
				
		
		
		
		
		
		setVisible(true);
		
//	------------- User InterFace(UI) Setting -------------
		
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	public static void main(String[] args) {
		new T10_Adapter();
	}
}
