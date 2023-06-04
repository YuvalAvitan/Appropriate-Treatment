import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ask_patient extends JFrame {

	private JPanel contentPane;

	public Ask_patient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 906, 611);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPleaseAnswerThe = new JLabel("Please answer the following:");
		lblPleaseAnswerThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseAnswerThe.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 50));
		lblPleaseAnswerThe.setBounds(10, 21, 756, 52);
		contentPane.add(lblPleaseAnswerThe);
		
		JLabel lblNewLabel = new JLabel("Are you smoking?");
		lblNewLabel.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 30));
		lblNewLabel.setBounds(48, 117, 276, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblAreYouPregnent = new JLabel("Are you pregnent?");
		lblAreYouPregnent.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 30));
		lblAreYouPregnent.setBounds(48, 187, 276, 32);
		contentPane.add(lblAreYouPregnent);
		
		JLabel lblAreYouHaving = new JLabel("Are you having fever?");
		lblAreYouHaving.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 30));
		lblAreYouHaving.setBounds(48, 264, 335, 32);
		contentPane.add(lblAreYouHaving);
		
		JLabel lblAreYouSuffer = new JLabel("Are you suffer from Lung disease? ");
		lblAreYouSuffer.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 30));
		lblAreYouSuffer.setBounds(48, 345, 484, 32);
		contentPane.add(lblAreYouSuffer);
		
		JComboBox smoke = new JComboBox();
		smoke.setModel(new DefaultComboBoxModel(new String[] {"yes", "no"}));
		smoke.setBackground(new Color(250, 235, 215));
		smoke.setFont(new Font("Tahoma", Font.PLAIN, 30));
		smoke.setMaximumRowCount(2);
		smoke.setBounds(630, 130, 184, 38);
		contentPane.add(smoke);
		
		JComboBox pregnent = new JComboBox();
		pregnent.setModel(new DefaultComboBoxModel(new String[] {"yes", "no"}));
		pregnent.setMaximumRowCount(2);
		pregnent.setFont(new Font("Tahoma", Font.PLAIN, 30));
		pregnent.setBackground(new Color(250, 235, 215));
		pregnent.setBounds(630, 194, 184, 38);
		contentPane.add(pregnent);
		
		JComboBox fever = new JComboBox();
		fever.setModel(new DefaultComboBoxModel(new String[] {"yes", "no"}));
		fever.setMaximumRowCount(2);
		fever.setFont(new Font("Tahoma", Font.PLAIN, 30));
		fever.setBackground(new Color(250, 235, 215));
		fever.setBounds(630, 258, 184, 38);
		contentPane.add(fever);
		
		JComboBox disease = new JComboBox();
		disease.setModel(new DefaultComboBoxModel(new String[] {"yes", "no"}));
		disease.setMaximumRowCount(2);
		disease.setFont(new Font("Tahoma", Font.PLAIN, 30));
		disease.setBackground(new Color(250, 235, 215));
		disease.setBounds(630, 334, 184, 38);
		contentPane.add(disease);
		
		JButton Send_button = new JButton("Send");
		Send_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Doctor.getPat().get(Doctor.getPat().size()-1).setSmoke(smoke.getSelectedItem().toString());
				Doctor.getPat().get(Doctor.getPat().size()-1).setPregnent(pregnent.getSelectedItem().toString());
				Doctor.getPat().get(Doctor.getPat().size()-1).setFever(fever.getSelectedItem().toString());
				Doctor.getPat().get(Doctor.getPat().size()-1).setDisese(disease.getSelectedItem().toString());
					
				setVisible(false);
			}
		});
		Send_button.setIcon(new ImageIcon("D:\\softwareDev\\back-button.png"));
		Send_button.setBackground(new Color(250, 235, 215));
		Send_button.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		Send_button.setBounds(387, 467, 158, 52);
		contentPane.add(Send_button);
	}
}
