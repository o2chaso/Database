package t4_WindowBuilder;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.AbstractListModel;

public class T03_Combo_ListBox {

	private JFrame frame;

	public static void main(String[] args) {
		new T03_Combo_ListBox();
	}

	public T03_Combo_ListBox() {
		initialize();
	}

	@SuppressWarnings({ "unchecked", "rawtypes", "serial" })
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Radio Check Box Test");
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(44, 10, 341, 323);
		frame.getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblTitle = new JLabel("직업을 입력하세요");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("휴먼편지체", Font.PLAIN, 20));
		lblTitle.setBounds(12, 10, 317, 42);
		pn1.add(lblTitle);
		
		JComboBox comboJob = new JComboBox();
		comboJob.setFont(new Font("휴먼편지체", Font.PLAIN, 15));
		comboJob.setModel(new DefaultComboBoxModel(new String[] {"학생", "변호사", "의사", "변호사", "검찰", "유튜버", "소방관", "군인", "간호사", "선생님", "공무원", "자영업자", "잡상인", "기타"}));
		comboJob.setBounds(56, 62, 232, 28);
		pn1.add(comboJob);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(397, 10, 341, 323);
		frame.getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 63, 317, 158);
		pn2.add(scrollPane);
		
		JList listJob = new JList();
		listJob.setModel(new AbstractListModel() {
			String[] values = new String[] {"학생", "변호사", "의사", "변호사", "검찰", "유튜버", "소방관", "군인", "간호사", "선생님", "공무원", "자영업자", "잡상인", "기타"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listJob.setFont(new Font("휴먼편지체", Font.PLAIN, 15));
		scrollPane.setViewportView(listJob);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(44, 343, 694, 94);
		frame.getContentPane().add(pn3);
		pn3.setLayout(null);
		
		JButton btnCombo = new JButton("콤보상자");
		btnCombo.setFont(new Font("휴먼편지체", Font.PLAIN, 18));
		btnCombo.setBounds(61, 10, 97, 60);
		pn3.add(btnCombo);
		
		JButton btnList = new JButton("리스트출력");
		btnList.setFont(new Font("휴먼편지체", Font.PLAIN, 15));
		btnList.setBounds(219, 10, 97, 60);
		pn3.add(btnList);
		
		JButton btnMessage = new JButton("메세지출력");
		btnMessage.setFont(new Font("휴먼편지체", Font.PLAIN, 15));
		btnMessage.setBounds(377, 10, 97, 60);
		pn3.add(btnMessage);
		
		JButton btnExit = new JButton("종료");
		btnExit.setFont(new Font("휴먼편지체", Font.PLAIN, 18));
		btnExit.setBounds(535, 10, 97, 60);
		pn3.add(btnExit);
		
		JPanel pn4 = new JPanel();
		pn4.setBounds(44, 457, 694, 94);
		frame.getContentPane().add(pn4);
		pn4.setLayout(null);
		
		JLabel lblMessage = new JLabel("직업을 입력하세요");
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setFont(new Font("휴먼편지체", Font.PLAIN, 20));
		lblMessage.setBounds(190, 25, 317, 42);
		pn4.add(lblMessage);
		
		frame.setVisible(true);
		
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = "";
//				Object jobs = listJob.getSelectedValues();
				Object[] jobs = listJob.getSelectedValuesList().toArray();
				for(Object job : jobs) msg += job + "/";
				
				msg = msg.substring(0, msg.length() -1);
				lblMessage.setText(msg);
			}
		});
		
		comboJob.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String msg = comboJob.getSelectedItem().toString() + "("+ comboJob.getSelectedIndex() +")";
				lblMessage.setText(msg);
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
