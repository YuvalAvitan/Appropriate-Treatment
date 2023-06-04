import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Doctor_Screen extends JFrame {

	private JPanel contentPane;
	private JTextField Name;
	private JTextField Age;
	private JTextField id_text;


	public Doctor_Screen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 906, 611);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome Doctor");
		lblNewLabel.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(205, 28, 502, 52);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 235, 215));
		panel.setBounds(67, 123, 364, 241);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Enter patient details:");
		lblNewLabel_1.setBounds(10, 11, 291, 40);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 32));
		
		JLabel name = new JLabel("name:");
		name.setBounds(10, 58, 165, 59);
		panel.add(name);
		name.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		
		JLabel age = new JLabel("id:");
		age.setBounds(10, 124, 165, 59);
		panel.add(age);
		age.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		
		Name = new JTextField();
		Name.setBounds(79, 72, 165, 28);
		panel.add(Name);
		Name.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Name.setColumns(10);
		
		JLabel age_1 = new JLabel("age:");
		age_1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		age_1.setBounds(10, 180, 165, 59);
		panel.add(age_1);
		
		id_text = new JTextField();
		id_text.setFont(new Font("Tahoma", Font.PLAIN, 20));
		id_text.setColumns(10);
		id_text.setBounds(79, 138, 165, 28);
		panel.add(id_text);
		
		Age = new JTextField();
		Age.setBounds(79, 194, 165, 28);
		panel.add(Age);
		Age.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Age.setColumns(10);
		
		JButton ask_pat = new JButton("Ask patient");

		ask_pat.setIcon(new ImageIcon("D:\\softwareDev\\question.png"));
		ask_pat.setBackground(new Color(250, 235, 215));
		ask_pat.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		ask_pat.setBounds(67, 453, 203, 52);
		contentPane.add(ask_pat);
		
		JButton EnterDetails = new JButton("Enter Details");
		
		EnterDetails.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Enter_Deatils det = new Enter_Deatils();
				det.setVisible(true);
				
				
			}
		});
		EnterDetails.setEnabled(false);
		EnterDetails.setIcon(new ImageIcon("D:\\softwareDev\\editreg.png"));
		EnterDetails.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		EnterDetails.setBackground(new Color(250, 235, 215));
		EnterDetails.setBounds(359, 453, 203, 52);
		contentPane.add(EnterDetails);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Doctor.getWriter().close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				setVisible(false);
			}
		});
		btnLogout.setIcon(new ImageIcon("D:\\softwareDev\\exit.png"));
		btnLogout.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		btnLogout.setBackground(new Color(250, 235, 215));
		btnLogout.setBounds(646, 453, 203, 52);
		contentPane.add(btnLogout);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\softwareDev\\medical-file.png"));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 50));
		lblNewLabel_2.setBounds(426, 110, 502, 266);
		contentPane.add(lblNewLabel_2);
		
		
		ask_pat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(Age.getText().isEmpty() == false && Name.getText().isEmpty() == false && id_text.getText().isEmpty() == false)
				{
					Doctor.getPat().add(new Patient(Name.getText(),Age.getText(), id_text.getText()));
					System.out.println(Doctor.getPat().get(Doctor.getPat().size() -1));
					Ask_patient ask = new Ask_patient();
					ask.setVisible(true);
					EnterDetails.setEnabled(true);
				}
				else
				{
					Missing_data data = new  Missing_data();
					data.setVisible(true);
				}
				
				
			}
		});
	}

}