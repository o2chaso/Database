package t4_WindowBuilder;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class T01_Basic {

	private JFrame frame;
	private JTextField textField_UserID;
	private JTextField textField_Password;
	private JTextField textField_Name;
	private JTextField textField_Age;

	public static void main(String[] args) {
		new T01_Basic();
		
	}

	public T01_Basic() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JButton btnResult = new JButton("Result");
		btnResult.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		btnResult.setBounds(349, 504, 85, 33);
		frame.getContentPane().add(btnResult);
		
		JButton btnUserJoin = new JButton("Join");
		btnUserJoin.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		btnUserJoin.setBounds(132, 504, 85, 33);
		frame.getContentPane().add(btnUserJoin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		btnExit.setBounds(566, 504, 85, 33);
		frame.getContentPane().add(btnExit);
		
		JLabel lbluserId = new JLabel("UserID");
		lbluserId.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lbluserId.setBounds(12, 41, 85, 95);
		frame.getContentPane().add(lbluserId);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblPassword.setBounds(12, 93, 85, 95);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblUsername.setBounds(12, 212, 85, 66);
		frame.getContentPane().add(lblUsername);
		
		textField_UserID = new JTextField();
		textField_UserID.setFont(new Font("휴먼편지체", Font.PLAIN, 15));
		textField_UserID.setBounds(99, 77, 218, 21);
		frame.getContentPane().add(textField_UserID);
		textField_UserID.setColumns(10);
		
		textField_Password = new JTextField();
		textField_Password.setFont(new Font("휴먼편지체", Font.PLAIN, 15));
		textField_Password.setColumns(10);
		textField_Password.setBounds(99, 129, 218, 21);
		frame.getContentPane().add(textField_Password);
		
		textField_Name = new JTextField();
		textField_Name.setFont(new Font("휴먼편지체", Font.PLAIN, 15));
		textField_Name.setColumns(10);
		textField_Name.setBounds(99, 234, 218, 21);
		frame.getContentPane().add(textField_Name);
		
		textField_Age = new JTextField();
		textField_Age.setText("0");
		textField_Age.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textField_Age.setColumns(10);
		textField_Age.setBounds(99, 182, 218, 21);
		frame.getContentPane().add(textField_Age);
		
		JLabel lbluserId_1 = new JLabel("UserAge");
		lbluserId_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lbluserId_1.setBounds(12, 146, 85, 95);
		frame.getContentPane().add(lbluserId_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(366, 41, 406, 266);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JLabel lbluserId_2 = new JLabel("회원 소개");
		lbluserId_2.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 15));
		lbluserId_2.setBounds(535, 10, 69, 33);
		frame.getContentPane().add(lbluserId_2);

		frame.setVisible(true);
		
//	-------- 위쪽은 디자인, 아래쪽은 메소드 ---------
		
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		btnExit.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				System.exit(0);
			}
		});
		
		btnUserJoin.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e) {
				String mid = textField_UserID.getText();
				String pass = textField_Password.getText();
				int age = Integer.parseInt(textField_Age.getText());
				String name = textField_Name.getText();
				
				if(mid.trim().equals("")) {
					JOptionPane.showConfirmDialog(null, "ID는 필수입력입니다.", "회원가입", JOptionPane.INFORMATION_MESSAGE);
					textField_UserID.requestFocus();
				}
				else if(pass.trim().equals("")) {
					JOptionPane.showConfirmDialog(null, "비밀번호는 필수입력입니다.", "회원가입", JOptionPane.INFORMATION_MESSAGE);
					textField_Password.requestFocus();
				}
				else if(name.trim().equals("")) {
					JOptionPane.showConfirmDialog(null, "성명은 필수입력입니다.", "회원가입", JOptionPane.INFORMATION_MESSAGE);
					textField_Name.requestFocus();
				}
				else
				JOptionPane.showConfirmDialog(null, "회원등록을 하시겠습니까?", "회원가입", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
	}
}
