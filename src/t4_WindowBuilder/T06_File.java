package t4_WindowBuilder;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

public class T06_File {

	private JFrame frame;

	public static void main(String[] args) {
		new T06_File();
	}

	public T06_File() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 465, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnImage = new JButton("이미지 선택");
		btnImage.setBounds(12, 10, 97, 43);
		frame.getContentPane().add(btnImage);
		
		JLabel lblImage = new JLabel("이미지가 출력됩니다.");
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage.setBounds(12, 63, 410, 124);
		frame.getContentPane().add(lblImage);
		
		JTextArea taMessage = new JTextArea();
		taMessage.setFont(new Font("휴먼편지체", Font.PLAIN, 18));
		taMessage.setBounds(12, 197, 410, 54);
		frame.getContentPane().add(taMessage);
		
		
		frame.setVisible(true);
		//----------------------------------------
		
		btnImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF & PNG Images", "jpg" , "gif" , "png");
				chooser.setFileFilter(filter);
				
				int res = chooser.showOpenDialog(null);
				
				if(res != chooser.APPROVE_OPTION) {
					JOptionPane.showMessageDialog(frame, "파일을 선택해 주세요", "경고", JOptionPane.WARNING_MESSAGE);
				}
				else {
					String filePath = chooser.getSelectedFile().getPath();
					String fileName = chooser.getSelectedFile().getName();
					
					lblImage.setIcon(new ImageIcon(filePath));
					String fileInfo = "경로명과 파일명 : " +  filePath + ", \n파일명 : " + fileName;
					taMessage.setText(fileInfo);
				}
				
				
			}
		});
		
	}
}
