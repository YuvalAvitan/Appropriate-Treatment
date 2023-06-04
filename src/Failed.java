import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Failed extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Failed frame = new Failed();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Failed() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 303);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Success = new JPanel();
		Success.setLayout(null);
		Success.setBorder(new EmptyBorder(5, 5, 5, 5));
		Success.setBackground(new Color(250, 235, 215));
		Success.setBounds(0, 0, 663, 263);
		contentPane.add(Success);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\softwareDev\\report.png"));
		lblNewLabel.setBounds(73, -87, 280, 402);
		Success.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Registration Failed!");
		lblNewLabel_1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(311, 36, 405, 44);
		Success.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		btnNewButton.setBackground(new Color(253, 245, 230));
		btnNewButton.setBounds(363, 146, 147, 33);
		Success.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Password - invalid error!");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(342, 91, 265, 44);
		Success.add(lblNewLabel_2);
	}

}