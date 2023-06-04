import java.awt.EventQueue;
import java.sql.*;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame Login_Frame;
	private JTextField user_text;
	private JTextField id_text;
	private JPasswordField password_text;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.Login_Frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
		initialize();
	}
	
	private void initialize() {
		Login_Frame = new JFrame();
		Login_Frame.setTitle("Appropiate Medical Treatment");
		Login_Frame.getContentPane().setBackground(new Color(250, 235, 215));
		Login_Frame.setBounds(100, 100, 906, 611);
		Login_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Login_Frame.getContentPane().setLayout(null);
		
		JPanel Login_Panel = new JPanel();
		Login_Panel.setBackground(new Color(253, 245, 230));
		Login_Panel.setBounds(128, 92, 635, 307);
		Login_Frame.getContentPane().add(Login_Panel);
		Login_Panel.setLayout(null);
		
		JLabel User_name_label = new JLabel("User name:");
		User_name_label.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 30));
		User_name_label.setBounds(10, 29, 210, 42);
		Login_Panel.add(User_name_label);
		
		JLabel Password_label = new JLabel("Password:");
		Password_label.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 30));
		Password_label.setBounds(10, 112, 210, 42);
		Login_Panel.add(Password_label);
		
		JLabel id_label = new JLabel("Id:");
		id_label.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 30));
		id_label.setBounds(10, 197, 210, 42);
		Login_Panel.add(id_label);
		
		user_text = new JTextField();
		user_text.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 30));
		user_text.setBounds(194, 29, 228, 42);
		Login_Panel.add(user_text);
		user_text.setColumns(10);
		
		id_text = new JTextField();
		id_text.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 30));
		id_text.setColumns(10);
		id_text.setBounds(194, 197, 228, 42);
		Login_Panel.add(id_text);
		
		password_text = new JPasswordField();
		password_text.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 30));
		password_text.setBounds(194, 119, 228, 42);
		Login_Panel.add(password_text);
		
		JLabel Doctor_Icon = new JLabel("");
		Doctor_Icon.setIcon(new ImageIcon("D:\\softwareDev\\doctor.png"));
		Doctor_Icon.setBounds(473, 69, 162, 170);
		Login_Panel.add(Doctor_Icon);
		
		JLabel Login_Label = new JLabel("Login");
		Login_Label.setHorizontalAlignment(SwingConstants.CENTER);
		Login_Label.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 50));
		Login_Label.setBounds(286, 11, 341, 57);
		Login_Frame.getContentPane().add(Login_Label);
		
		JButton Login_Button = new JButton("Login");
		Login_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 try {
					   Class.forName("com.mysql.jdbc.Driver");
					                   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/doctordb?characterEncoding=utf8&useSSL=false&useUnicode=true", "root", "1111");
					                   String query = "Select * from doctor where Username=? and Password=? and Id=?";
					                   PreparedStatement pst = connection.prepareStatement(query);
					                   
					                   pst.setString(1, user_text.getText());
					                   pst.setString(2, password_text.getText());
					                   pst.setString(3, id_text.getText());
					                                   
					                   ResultSet rs = pst.executeQuery();
					                                     
					                   if(rs.next())
					                   {
					                	   	Doctor_Screen doc = new Doctor_Screen();
					                	   	new Doctor();
					                	   	doc.setVisible(true);
					                	   	
					                   }
					                   else
					                   {
					                	   NosuchUser nou = new NosuchUser();
					                	   nou.setVisible(true);
					                   }
					                   
					               } catch (Exception exception) {
					                   exception.printStackTrace();
					               }

			}
		});
		Login_Button.setIcon(new ImageIcon("D:\\softwareDev\\login.png"));
		Login_Button.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		Login_Button.setBackground(new Color(253, 245, 230));
		Login_Button.setBounds(128, 465, 160, 42);
		Login_Frame.getContentPane().add(Login_Button);
		
		JButton Register_Button = new JButton("Register");
		Register_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registration reg = new Registration();
				reg.setVisible(true);
			}
		});
		Register_Button.setIcon(new ImageIcon("D:\\softwareDev\\edit.png"));
		Register_Button.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		Register_Button.setBackground(new Color(253, 245, 230));
		Register_Button.setBounds(366, 465, 160, 42);
		Login_Frame.getContentPane().add(Register_Button);
		
		JButton Exit_Button = new JButton("Exit");
		Exit_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		Exit_Button.setIcon(new ImageIcon("D:\\softwareDev\\exit.png"));
		Exit_Button.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		Exit_Button.setBackground(new Color(253, 245, 230));
		Exit_Button.setBounds(603, 465, 160, 42);
		Login_Frame.getContentPane().add(Exit_Button);
	}
}
