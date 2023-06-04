import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration_succes extends JFrame {

	private JPanel Success;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_succes frame = new Registration_succes();
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
	public Registration_succes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 302);
		Success = new JPanel();
		Success.setBackground(new Color(250, 235, 215));
		Success.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Success);
		Success.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\softwareDev\\checked.png"));
		lblNewLabel.setBounds(10, -71, 280, 402);
		Success.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Registration Completed!");
		lblNewLabel_1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(311, 36, 405, 44);
		Success.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		btnNewButton.setBackground(new Color(253, 245, 230));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(382, 146, 147, 33);
		Success.add(btnNewButton);
	}

}
