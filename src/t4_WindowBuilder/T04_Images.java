package t4_WindowBuilder;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class T04_Images {
	JLabel lblImg1, lblImg2, lblImg3, lblImg4;
	int img1Cnt = 0, img2Cnt = 0, img3Cnt = 0, img4Cnt = 0;
	JLabel lblMessage;

	private JFrame frame;
	public static void main(String[] args) {
		new T04_Images();
	}

	public T04_Images() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("카드 횟수 맞추기");
		frame.setBounds(100, 100, 1088, 607);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(12, 10, 1048, 78);
		frame.getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JButton btnTotal = new JButton("모두보기");
		btnTotal.setFont(new Font("휴먼편지체", Font.PLAIN, 15));
		btnTotal.setBounds(33, 10, 93, 58);
		pn1.add(btnTotal);
		
		JButton btn1 = new JButton("1번 보기");
		btn1.setFont(new Font("휴먼편지체", Font.PLAIN, 15));
		btn1.setBounds(159, 10, 93, 58);
		pn1.add(btn1);
		
		JButton btn2 = new JButton("2번 보기");
		btn2.setFont(new Font("휴먼편지체", Font.PLAIN, 15));
		btn2.setBounds(285, 10, 93, 58);
		pn1.add(btn2);
		
		JButton btn3 = new JButton("3번 보기");
		btn3.setFont(new Font("휴먼편지체", Font.PLAIN, 15));
		btn3.setBounds(411, 10, 93, 58);
		pn1.add(btn3);
		
		JButton btn4 = new JButton("4번 보기");
		btn4.setFont(new Font("휴먼편지체", Font.PLAIN, 15));
		btn4.setBounds(537, 10, 93, 58);
		pn1.add(btn4);
		
		JButton btnRandom = new JButton("랜덤 보기");
		btnRandom.setFont(new Font("휴먼편지체", Font.PLAIN, 15));
		btnRandom.setBounds(663, 10, 93, 58);
		pn1.add(btnRandom);
		
		JButton btnClose = new JButton("모두 닫기");
		btnClose.setFont(new Font("휴먼편지체", Font.PLAIN, 15));
		btnClose.setBounds(789, 10, 93, 58);
		pn1.add(btnClose);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(915, 10, 93, 58);
		pn1.add(btnExit);
		btnExit.setFont(new Font("휴먼편지체", Font.PLAIN, 15));
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(12, 98, 1048, 358);
		frame.getContentPane().add(pn2);
		pn2.setLayout(null);
		
		lblImg1 = new JLabel("");
		lblImg1.setIcon(new ImageIcon(T04_Images.class.getResource("/t4_WindowBuilder/Images/1.jpg")));
		lblImg1.setBounds(14, 10, 244, 338);
		pn2.add(lblImg1);
		
		lblImg2 = new JLabel("");
		lblImg2.setIcon(new ImageIcon(T04_Images.class.getResource("/t4_WindowBuilder/Images/2.jpg")));
		lblImg2.setBounds(272, 10, 244, 338);
		pn2.add(lblImg2);
		
		lblImg3 = new JLabel("");
		lblImg3.setIcon(new ImageIcon(T04_Images.class.getResource("/t4_WindowBuilder/Images/3.jpg")));
		lblImg3.setBounds(530, 10, 244, 338);
		pn2.add(lblImg3);
		
		lblImg4 = new JLabel("");
		lblImg4.setIcon(new ImageIcon(T04_Images.class.getResource("/t4_WindowBuilder/Images/4.jpg")));
		lblImg4.setBounds(788, 10, 244, 338);
		pn2.add(lblImg4);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(12, 466, 1048, 78);
		frame.getContentPane().add(pn3);
		pn3.setLayout(null);
		
		lblMessage = new JLabel("선택된 카드의 횟수를 보여줍니다.");
		lblMessage.setForeground(new Color(102, 153, 255));
		lblMessage.setFont(new Font("휴먼편지체", Font.PLAIN, 17));
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setBounds(12, 10, 1024, 58);
		pn3.add(lblMessage);
		
		frame.setVisible(true);
		
		
		
//------------------------------------------------
		// 랜덤 보기
		btnRandom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rand = (int) (Math.random()*4) + 1;
				
				if(rand == 1) {
					lblImg1.setVisible(true);
					lblImg2.setVisible(false);
					lblImg3.setVisible(false);
					lblImg4.setVisible(false);
					img1Cnt++;
				}
				else if(rand == 2) {
					lblImg1.setVisible(false);
					lblImg2.setVisible(true);
					lblImg3.setVisible(false);
					lblImg4.setVisible(false);
					img2Cnt++;
				}
				else if(rand == 3) {
					lblImg1.setVisible(false);
					lblImg2.setVisible(false);
					lblImg3.setVisible(true);
					lblImg4.setVisible(false);
					img3Cnt++;
				}
				else if(rand == 4) {
					lblImg1.setVisible(false);
					lblImg2.setVisible(false);
					lblImg3.setVisible(false);
					lblImg4.setVisible(true);
					img4Cnt++;
					displayCount();
					
				}
			}
		});
		// 1번 보기 클릭 수행
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(true);
				lblImg2.setVisible(false);
				lblImg3.setVisible(false);
				lblImg4.setVisible(false);
				img1Cnt++;
				displayCount();
			}
		});
		// 2번
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(false);
				lblImg2.setVisible(true);
				lblImg3.setVisible(false);
				lblImg4.setVisible(false);
				img2Cnt++;
				displayCount();
			}
		});
		// 3번
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(false);
				lblImg2.setVisible(false);
				lblImg3.setVisible(true);
				lblImg4.setVisible(false);
				img3Cnt++;
				displayCount();
			}
		});
		// 4번
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(false);
				lblImg2.setVisible(false);
				lblImg3.setVisible(false);
				lblImg4.setVisible(true);
				img4Cnt++;
				displayCount();
			}
		});
		
		// 모두 보기 버튼 클릭 수행
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allDisplay();
				img1Cnt++;
				img2Cnt++;
				img3Cnt++;
				img4Cnt++;
				displayCount();
			}
		});
		
		// 모두 보기 닫기 클릭 수행
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allClose();
				img1Cnt = 0;
				img2Cnt = 0;
				img3Cnt = 0;
				img4Cnt = 0;
				displayCount();
			}
		});
		
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ans = JOptionPane.showConfirmDialog(null,"작업을 종료하시겠습니까?", "종료합니다.", JOptionPane.YES_NO_OPTION);
				if(ans == 0) System.exit(0);
			}
		});
	}
	// 카운트 수를 레이블에 출력하기
	protected void displayCount() {
		lblMessage.setText("1번: "+img1Cnt+", 2번: "+img2Cnt+", 3번: "+img3Cnt+", 4번: " + img4Cnt);
	}

	// 모두 보기
	protected void allDisplay() {
		lblImg1.setVisible(true);
		lblImg2.setVisible(true);
		lblImg3.setVisible(true);
		lblImg4.setVisible(true);
	}
	// 모두 닫기
	protected void allClose() {
		lblImg1.setVisible(false);
		lblImg2.setVisible(false);
		lblImg3.setVisible(false);
		lblImg4.setVisible(false);
	}
}
