package t4_WindowBuilder;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class T02_RadioCheckBox {

	private JFrame frmRadioCheckBox;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new T02_RadioCheckBox();
			}
		});
	}

	public T02_RadioCheckBox() {
		initialize();
	}

	private void initialize() {
		frmRadioCheckBox = new JFrame();
		frmRadioCheckBox.setTitle("Radio Check Box Test");
		frmRadioCheckBox.setBounds(100, 100, 800, 600);
		frmRadioCheckBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRadioCheckBox.getContentPane().setLayout(null);
		
		JPanel title_panel = new JPanel();
		title_panel.setBackground(new Color(102, 153, 255));
		title_panel.setBounds(0, 0, 784, 103);
		frmRadioCheckBox.getContentPane().add(title_panel);
		title_panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Stellive");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Vivaldi", Font.PLAIN, 25));
		lblNewLabel.setBounds(18, 10, 754, 83);
		title_panel.add(lblNewLabel);
		
		JPanel main_panel = new JPanel();
		main_panel.setBackground(new Color(250, 235, 215));
		main_panel.setBounds(0, 113, 784, 365);
		frmRadioCheckBox.getContentPane().add(main_panel);
		main_panel.setLayout(null);
		
		JButton btnGenders = new JButton("Gender");
		btnGenders.setFont(new Font("Vivaldi", Font.PLAIN, 15));
		btnGenders.setBounds(12, 10, 97, 43);
		main_panel.add(btnGenders);
		
		JButton btnHobby = new JButton("Hobby");
		btnHobby.setFont(new Font("Vivaldi", Font.PLAIN, 15));
		btnHobby.setBounds(12, 63, 97, 43);
		main_panel.add(btnHobby);
		
		JCheckBox chckbxMale = new JCheckBox("Male");
		buttonGroup.add(chckbxMale);
		chckbxMale.setFont(new Font("Vivaldi", Font.PLAIN, 12));
		chckbxMale.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxMale.setBounds(166, 21, 115, 23);
		main_panel.add(chckbxMale);
		
		JCheckBox chckbxFemale = new JCheckBox("FeMale");
		buttonGroup.add(chckbxFemale);
		chckbxFemale.setSelected(true);
		chckbxFemale.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxFemale.setFont(new Font("Vivaldi", Font.PLAIN, 12));
		chckbxFemale.setBounds(404, 21, 115, 23);
		main_panel.add(chckbxFemale);
		
		JCheckBox chckbxFps = new JCheckBox("FPS");
		chckbxFps.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxFps.setFont(new Font("Vivaldi", Font.PLAIN, 12));
		chckbxFps.setBounds(166, 74, 115, 23);
		main_panel.add(chckbxFps);
		
		JCheckBox chckbxRPG = new JCheckBox("RPG");
		chckbxRPG.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxRPG.setFont(new Font("Vivaldi", Font.PLAIN, 12));
		chckbxRPG.setBounds(285, 74, 115, 23);
		main_panel.add(chckbxRPG);
		
		JCheckBox chckbxAOS = new JCheckBox("AOS");
		chckbxAOS.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxAOS.setFont(new Font("Vivaldi", Font.PLAIN, 12));
		chckbxAOS.setBounds(404, 74, 115, 23);
		main_panel.add(chckbxAOS);
		
		JLabel lblMessage = new JLabel("메세지가 출력됩니다.");
		lblMessage.setForeground(new Color(51, 153, 255));
		lblMessage.setFont(new Font("휴먼편지체", Font.PLAIN, 20));
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setBounds(12, 279, 503, 76);
		main_panel.add(lblMessage);
		
		JPanel sub_panel = new JPanel();
		sub_panel.setBackground(new Color(102, 153, 255));
		sub_panel.setBounds(0, 488, 784, 63);
		frmRadioCheckBox.getContentPane().add(sub_panel);
		sub_panel.setLayout(null);
		
		JButton btnJoin = new JButton("Join");
		btnJoin.setFont(new Font("Vivaldi", Font.PLAIN, 15));
		btnJoin.setBounds(12, 10, 97, 43);
		sub_panel.add(btnJoin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Vivaldi", Font.PLAIN, 15));
		btnExit.setBounds(675, 10, 97, 43);
		sub_panel.add(btnExit);
		
		JButton btnHobby_t = new JButton("Hobby");
		btnHobby_t.setFont(new Font("Vivaldi", Font.PLAIN, 15));
		btnHobby_t.setBounds(340, 10, 97, 43);
		sub_panel.add(btnHobby_t);
		
		frmRadioCheckBox.setVisible(true);
		
//	-------- 위쪽은 디자인, 아래쪽은 메소드 --------- btnHobby
		
		btnHobby.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Hobby = "선택하신 취미는? ";
				if(chckbxFps.isSelected()) Hobby += chckbxFps.getText() + "/";
				if(chckbxRPG.isSelected()) Hobby += chckbxRPG.getText() + "/";
				if(chckbxAOS.isSelected()) Hobby += chckbxAOS.getText() + "/";
				
				Hobby = Hobby.substring(0, Hobby.length() -1);
				
				lblMessage.setText(Hobby);
			}
		});
		
		btnGenders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gender = "선택하신 성별은? ";
				if(chckbxMale.isSelected()) gender += chckbxMale.getText();
				else gender += chckbxFemale.getText();
				lblMessage.setText(gender);
			}
		});
		
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ans = JOptionPane.showConfirmDialog(null,"작업을 종료하시겠습니까?", "종료합니다.", JOptionPane.YES_NO_OPTION);
				if(ans == 0) System.exit(0);
			}
		});
	}
}
