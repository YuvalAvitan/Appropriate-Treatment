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

public class id_error extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					id_error frame = new id_error();
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
	public id_error() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Success_1 = new JPanel();
		Success_1.setLayout(null);
		Success_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		Success_1.setBackground(new Color(250, 235, 215));
		Success_1.setBounds(0, 0, 663, 263);
		contentPane.add(Success_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\softwareDev\\report.png"));
		lblNewLabel_3.setBounds(73, -87, 280, 402);
		Success_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Registration Failed!");
		lblNewLabel_1_1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(311, 36, 405, 44);
		Success_1.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		btnNewButton_1.setBackground(new Color(253, 245, 230));
		btnNewButton_1.setBounds(363, 146, 147, 33);
		Success_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Id error - invalid option!");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(342, 91, 265, 44);
		Success_1.add(lblNewLabel_2_1);
	}

}
