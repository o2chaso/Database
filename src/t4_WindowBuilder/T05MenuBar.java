package t4_WindowBuilder;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;

public class T05MenuBar {

	private JFrame frame;

	public static void main(String[] args) {
		new T05MenuBar();
	}

	public T05MenuBar() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("메뉴 연습");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		frame.getContentPane().add(toolBar, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(T05MenuBar.class.getResource("/t4_WindowBuilder/Images/Image20250717122337.jpg")));
		toolBar.add(btnNewButton);
		
		JButton btnOpne = new JButton("");
		btnOpne.setIcon(new ImageIcon(T05MenuBar.class.getResource("/t4_WindowBuilder/Images/Image20250717122348.jpg")));
		toolBar.add(btnOpne);
		
		JButton btnSave = new JButton("");
		btnSave.setIcon(new ImageIcon(T05MenuBar.class.getResource("/t4_WindowBuilder/Images/Image20250717122354.jpg")));
		toolBar.add(btnSave);
		
		JButton btnExit = new JButton("");
		btnExit.setIcon(new ImageIcon(T05MenuBar.class.getResource("/t4_WindowBuilder/Images/Image20250717122351.jpg")));
		toolBar.add(btnExit);
		
//		JSeparator separator = new JSeparator();
		toolBar.addSeparator();
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Open");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Save");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Exit");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("Edit");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("About");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("About SpringGroup");
		mnNewMenu_2.add(mntmNewMenuItem_4);
		
		
		frame.setVisible(true);
		
//		---------------------------------------------------
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ans = JOptionPane.showConfirmDialog(null,"작업을 종료하시겠습니까?", "종료합니다.", JOptionPane.YES_NO_OPTION);
				if(ans == 0) System.exit(0);
			}
		});
	
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ans = JOptionPane.showConfirmDialog(null,"작업을 종료하시겠습니까?", "종료합니다.", JOptionPane.YES_NO_OPTION);
				if(ans == 0) System.exit(0);
			}
		});
		
		//	About 클릭 시 수행
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "SpringGroup Ver 1.0");
			}
		});
	}
}
