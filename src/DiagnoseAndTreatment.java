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
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class DiagnoseAndTreatment extends JFrame {

	private JPanel contentPane;


	
	public DiagnoseAndTreatment() {

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1236, 611);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Diagnoses and treatments:");
		lblNewLabel.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 30));
		lblNewLabel.setBounds(21, 11, 432, 41);
		contentPane.add(lblNewLabel);
		
		Patient pat = Doctor.getPat().get(Doctor.getPat().size() - 1);
		
		ArrayList<Integer> diagnose = pat.find_max();
		
		JLabel name = new JLabel("name: " + pat.getName());
		name.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		
		
		
		name.setBounds(21, 78, 205, 21);
		contentPane.add(name);
		
		JLabel id = new JLabel(",id: " +pat.getId());
		id.setFont(new Font("Tahoma", Font.PLAIN, 20));
		id.setBounds(274, 78, 224, 21);
		contentPane.add(id);
		
		JLabel age = new JLabel(",age: " +pat.getAge());
		age.setFont(new Font("Tahoma", Font.PLAIN, 20));
		age.setBounds(523, 82, 213, 21);
		contentPane.add(age);
		
		
		JButton Signup_Button = new JButton("Close");
		Signup_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		Signup_Button.setIcon(new ImageIcon("D:\\softwareDev\\exit.png"));
		Signup_Button.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		Signup_Button.setBackground(new Color(253, 245, 230));
		Signup_Button.setBounds(556, 506, 160, 42);
		contentPane.add(Signup_Button);
		
		try {
			Doctor.getWriter().write("-----------------------------------------------------------------------------------\n");
			Doctor.getWriter().write("Name of patient: " + pat.getName()+"    \n");
			Doctor.getWriter().write("Id: " +pat.getId() + "     \n");
			Doctor.getWriter().write("Age: " +pat.getAge()+ "     \n\n");
			Doctor.getWriter().write("-----------------------------------------------------------------------------------\n");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		for(int i=0; i<diagnose.size(); i++)
		{
			JLabel lblNewLabel_1_1 = new JLabel();
			lblNewLabel_1_1.setText("Diagnose:  " + pat.getDiagnose()[diagnose.get(i)] + "        ,Treatment:   " + pat.getTreatment()[diagnose.get(i)] );
			
			try {
				Doctor.getWriter().write("Diagnose:  " + pat.getDiagnose()[diagnose.get(i)] + "        ,Treatment:   " + pat.getTreatment()[diagnose.get(i)]);
				Doctor.getWriter().write("       \n");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNewLabel_1_1.setBounds(21, 141 + i*50, 1155, 30);
			contentPane.add(lblNewLabel_1_1);
		}
		try {
			Doctor.getWriter().write("-----------------------------------------------------------------------------------\n");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}
