import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Registration extends JFrame {

	private JPanel Register_Frame;
	private JTextField username;
	private JTextField id;
	private JPasswordField password;

	
	public Registration() {
		setTitle("Appropiate Medical Treatment");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 906, 611);
		Register_Frame = new JPanel();
		Register_Frame.setBackground(new Color(250, 235, 215));
		Register_Frame.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Register_Frame);
		Register_Frame.setLayout(null);
		
		JLabel Register_Label = new JLabel("Registration");
		Register_Label.setHorizontalAlignment(SwingConstants.CENTER);
		Register_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 50));
		Register_Label.setBounds(274, 25, 341, 57);
		Register_Frame.add(Register_Label);
		
		JPanel Register_Panel = new JPanel();
		Register_Panel.setLayout(null);
		Register_Panel.setBackground(new Color(253, 245, 230));
		Register_Panel.setBounds(52, 109, 791, 365);
		Register_Frame.add(Register_Panel);
		
		JLabel User_name_label = new JLabel("User name:");
		User_name_label.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 30));
		User_name_label.setBounds(10, 29, 210, 42);
		Register_Panel.add(User_name_label);
		
		JLabel Password_label = new JLabel("Password:");
		Password_label.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 30));
		Password_label.setBounds(10, 112, 210, 42);
		Register_Panel.add(Password_label);
		
		JLabel id_label = new JLabel("Id:");
		id_label.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 30));
		id_label.setBounds(10, 192, 210, 42);
		Register_Panel.add(id_label);
		
		username = new JTextField();
		username.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 30));
		username.setColumns(10);
		username.setBounds(304, 30, 228, 42);
		Register_Panel.add(username);
		
		id = new JTextField();
		id.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 30));
		id.setColumns(10);
		id.setBounds(304, 193, 228, 42);
		Register_Panel.add(id);
		
		password = new JPasswordField();
		password.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 30));
		password.setBounds(304, 113, 228, 42);
		Register_Panel.add(password);
		
		JLabel Signup_Icon_1 = new JLabel("");
		Signup_Icon_1.setIcon(new ImageIcon("D:\\softwareDev\\contract.png"));
		Signup_Icon_1.setBounds(605, 95, 162, 170);
		Register_Panel.add(Signup_Icon_1);
		
		JLabel lblNewLabel = new JLabel("(6-8,include at most 2 digits and the rest letters)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel.setBounds(304, 71, 259, 25);
		Register_Panel.add(lblNewLabel);
		
		JLabel lblatLeast = new JLabel("(8-10 ,at least 1 letter, 1 number and 1 special character)");
		lblatLeast.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblatLeast.setBounds(304, 157, 331, 25);
		Register_Panel.add(lblatLeast);
		
		JButton Signup_Button = new JButton("Sign-up");
		Signup_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				String Username = username.getText();
				String Password = password.getText();
				String Id = id.getText();
				
				
				if(Doctor.Check_Username(Username) == true && Doctor.Check_Password(Password) == true && CheckExistUser(Username,Password,Id) == false && Id.isEmpty() == false)
				{
				     try {
				    	 			Class.forName("com.mysql.jdbc.Driver");
				                   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/doctordb?characterEncoding=utf8&useSSL=false&useUnicode=true", "root", "1111");
				                   String query = "INSERT INTO doctor(Username,Password,ID) values('"+Username + "','" + Password + "','" + Id + "')";
				                   Statement stmt = connection.createStatement();
				                   stmt.execute(query);
				                   stmt.close();
				                   
				                   Registration_succes succ = new Registration_succes();
				                   succ.setVisible(true);
				                   setVisible(false);

				               } catch (Exception exception) {
				                   exception.printStackTrace();
				             
				               }
				}
				else {
					if(Doctor.Check_Password(Password) == false) {
						Failed fail = new Failed();
						fail.setVisible(true);
						
					}
					else if(Doctor.Check_Username(Username) == false)
					{
						Userfail fail = new Userfail();
						fail.setVisible(true);
						
					}
					
					else if(Id.isEmpty() == true) {
						id_error fail = new id_error();
						fail.setVisible(true);
					}
					
					else if(CheckExistUser(Username,Password,Id)) {
						user_exist_error fail = new user_exist_error();
						fail.setVisible(true);
					}
				}
			}
		});
		Signup_Button.setIcon(new ImageIcon("D:\\softwareDev\\editreg.png"));
		Signup_Button.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		Signup_Button.setBackground(new Color(253, 245, 230));
		Signup_Button.setBounds(230, 503, 160, 42);
		Register_Frame.add(Signup_Button);
		
		JButton Back_Button_ = new JButton("Back");
		Back_Button_.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		Back_Button_.setIcon(new ImageIcon("D:\\softwareDev\\back-button.png"));
		Back_Button_.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		Back_Button_.setBackground(new Color(253, 245, 230));
		Back_Button_.setBounds(535, 503, 160, 42);
		Register_Frame.add(Back_Button_);
	}

	public boolean CheckExistUser(String Username, String Password, String Id)
	{
		 try {
			   Class.forName("com.mysql.jdbc.Driver");
			   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/doctordb?characterEncoding=utf8&useSSL=false&useUnicode=true", "root", "1111");
			   String query = "SELECT * FROM doctor";
			   Statement st = conn.createStatement();
			   ResultSet rs = st.executeQuery(query);
			   while(rs.next())
			   {
				   if(rs.getString("Username").equals(Username))
					   return true;
				   else if(rs.getString("Password").equals(Password))
					   return true;
				   else if(rs.getString("Id").equals(Id))
					   return true;
				   
			   }
			               } catch (Exception exception) {
			                   exception.printStackTrace();
			               }
		return false;

	}
}