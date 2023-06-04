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
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Enter_Deatils extends JFrame {

	private JPanel contentPane;
	private final JLabel lblEnterDetails = new JLabel("Enter details:");
	private JTextField wbc;
	private JTextField rbc;
	private JTextField urea;
	private JTextField hemoglobin;
	private JTextField iron;
	private JTextField creatinine;
	private JTextField hdl;
	private JTextField ap;
	private JTextField neut;
	private JTextField lymph;
	private JTextField hct;

	public Enter_Deatils() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 952, 759);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 235, 215));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblEnterDetails.setBounds(-96, 0, 594, 119);
		contentPane.add(lblEnterDetails);
		lblEnterDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterDetails.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 50));
		
		JLabel lblNewLabel = new JLabel("Gender:");
		lblNewLabel.setBackground(new Color(238, 232, 170));
		lblNewLabel.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 30));
		lblNewLabel.setBounds(51, 123, 163, 30);
		contentPane.add(lblNewLabel);
		
		JLabel hdfghgfhdgf = new JLabel("Region:");
		hdfghgfhdgf.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 30));
		hdfghgfhdgf.setBounds(51, 185, 163, 30);
		contentPane.add(hdfghgfhdgf);
		
		JLabel lblRedBloodCells = new JLabel("Red Blood Cells:");
		lblRedBloodCells.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		lblRedBloodCells.setBounds(40, 337, 237, 30);
		contentPane.add(lblRedBloodCells);
		
		JLabel lblUrea = new JLabel("Urea:");
		lblUrea.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		lblUrea.setBounds(40, 392, 163, 30);
		contentPane.add(lblUrea);
		
		JLabel lblHemoglobin = new JLabel("Hemoglobin:");
		lblHemoglobin.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		lblHemoglobin.setBounds(40, 445, 226, 30);
		contentPane.add(lblHemoglobin);
		
		JLabel lblCreatinine = new JLabel("Creatinine:");
		lblCreatinine.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		lblCreatinine.setBounds(381, 337, 163, 30);
		contentPane.add(lblCreatinine);
		
		JLabel lblIron = new JLabel("Iron:");
		lblIron.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		lblIron.setBounds(381, 285, 163, 30);
		contentPane.add(lblIron);
		
		JLabel hdfhdhdf = new JLabel("High Density Lipoprotein:");
		hdfhdhdf.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		hdfhdhdf.setBounds(381, 392, 347, 30);
		contentPane.add(hdfhdhdf);
		
		JLabel lblAlkalinePhosphatase = new JLabel("Alkaline Phosphatase:");
		lblAlkalinePhosphatase.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		lblAlkalinePhosphatase.setBounds(381, 445, 308, 30);
		contentPane.add(lblAlkalinePhosphatase);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 228, 181));
		panel.setBounds(28, 117, 282, 136);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JComboBox gender = new JComboBox();
		gender.setBackground(new Color(250, 235, 215));
		gender.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		gender.setBounds(141, 23, 131, 22);
		panel.add(gender);
		
		JComboBox region = new JComboBox();
		region.setBackground(new Color(250, 235, 215));
		region.setModel(new DefaultComboBoxModel(new String[] {"East", "West", "Ethiopian"}));
		region.setBounds(141, 81, 131, 22);
		panel.add(region);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 228, 181));
		panel_1.setBounds(28, 248, 741, 364);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		wbc = new JTextField();
		wbc.setBounds(178, 43, 126, 30);
		panel_1.add(wbc);
		wbc.setColumns(10);
		
		JLabel lblWhiteBloodCells = new JLabel("White Blood Cells:");
		lblWhiteBloodCells.setBounds(10, 42, 248, 30);
		panel_1.add(lblWhiteBloodCells);
		lblWhiteBloodCells.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		
		rbc = new JTextField();
		rbc.setColumns(10);
		rbc.setBounds(178, 92, 126, 30);
		panel_1.add(rbc);
		
		urea = new JTextField();
		urea.setColumns(10);
		urea.setBounds(178, 146, 126, 30);
		panel_1.add(urea);
		
		hemoglobin = new JTextField();
		hemoglobin.setColumns(10);
		hemoglobin.setBounds(178, 196, 126, 30);
		panel_1.add(hemoglobin);
		
		iron = new JTextField();
		iron.setColumns(10);
		iron.setBounds(592, 31, 126, 30);
		panel_1.add(iron);
		
		creatinine = new JTextField();
		creatinine.setColumns(10);
		creatinine.setBounds(592, 92, 126, 30);
		panel_1.add(creatinine);
		
		hdl = new JTextField();
		hdl.setColumns(10);
		hdl.setBounds(592, 151, 126, 30);
		panel_1.add(hdl);
		
		ap = new JTextField();
		ap.setColumns(10);
		ap.setBounds(592, 201, 126, 30);
		panel_1.add(ap);
		
		JLabel lblNeut = new JLabel("Neut:");
		lblNeut.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		lblNeut.setBounds(10, 252, 226, 30);
		panel_1.add(lblNeut);
		
		JLabel lblHct = new JLabel("HCT:");
		lblHct.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		lblHct.setBounds(349, 252, 226, 30);
		panel_1.add(lblHct);
		
		JLabel EQWEQE = new JLabel("Lymph:");
		EQWEQE.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		EQWEQE.setBounds(10, 306, 226, 30);
		panel_1.add(EQWEQE);
		
		neut = new JTextField();
		neut.setColumns(10);
		neut.setBounds(178, 260, 126, 30);
		panel_1.add(neut);
		
		lymph = new JTextField();
		lymph.setColumns(10);
		lymph.setBounds(178, 314, 126, 30);
		panel_1.add(lymph);
		
		hct = new JTextField();
		hct.setColumns(10);
		hct.setBounds(592, 260, 126, 30);
		panel_1.add(hct);
		
		JButton Send_button = new JButton("Diagnose");
		Send_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Doctor.getPat().get(Doctor.getPat().size()-1).setGender(gender.getSelectedItem().toString());
				Doctor.getPat().get(Doctor.getPat().size()-1).setRegion(region.getSelectedItem().toString());
				Doctor.getPat().get(Doctor.getPat().size()-1).setWbc(wbc.getText());
				Doctor.getPat().get(Doctor.getPat().size()-1).setRbc(rbc.getText());
				Doctor.getPat().get(Doctor.getPat().size()-1).setUrea(urea.getText());
				Doctor.getPat().get(Doctor.getPat().size()-1).setHemoglobin(hemoglobin.getText());
				Doctor.getPat().get(Doctor.getPat().size()-1).setIron(iron.getText());
				Doctor.getPat().get(Doctor.getPat().size()-1).setCreatinine(creatinine.getText());
				Doctor.getPat().get(Doctor.getPat().size()-1).setHdl(hdl.getText());
				Doctor.getPat().get(Doctor.getPat().size()-1).setAp(ap.getText());
				Doctor.getPat().get(Doctor.getPat().size()-1).setNeut(neut.getText());
				Doctor.getPat().get(Doctor.getPat().size()-1).setHct(hct.getText());
				Doctor.getPat().get(Doctor.getPat().size()-1).setLymph(lymph.getText());
				
				
				DiagnoseAndTreatment diag = new DiagnoseAndTreatment();
				diag.setVisible(true);
				setVisible(false);
							
			}
		});
		Send_button.setIcon(new ImageIcon("D:\\softwareDev\\editreg.png"));
		Send_button.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		Send_button.setBackground(new Color(250, 235, 215));
		Send_button.setBounds(358, 632, 158, 52);
		contentPane.add(Send_button);
	}
}
