import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.DefaultComboBoxModel;

public class Welcome extends Page {
	private JTextField txtUsername;
	private JPasswordField password;

	/**
	 * Create the panel.
	 */
	public Welcome() {
		super("Log in & Sign in");
//		setBackground(Color.WHITE);
//		setLayout(null);
//		
//		Main.setMenu("Log in & Sign in");
//		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 14);
//
//		BufferedImage imgWelcome;
//		try {
//			imgWelcome = ImageIO.read(new File("src/Welcome.png"));
//			Image newImage = imgWelcome.getScaledInstance(900, 65, Image.SCALE_DEFAULT);
//			JLabel picLabel = new JLabel(new ImageIcon(newImage));
//			picLabel.setBounds(50, 20, 900, 65);
//			add(picLabel);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		BufferedImage imgLogo;
//		try {
//			imgLogo = ImageIO.read(new File("src/logo.png"));
//			Image newImage = imgLogo.getScaledInstance(480, 340, Image.SCALE_DEFAULT);
//			JLabel picLabel = new JLabel(new ImageIcon(newImage));
//			picLabel.setBounds(460, 125, 480, 340);
//			add(picLabel);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		super.addImage(50, 20, 900, 65, new File("src/Welcome.png"));
		super.addImage(460, 125, 480, 340, new File("src/logo.png"));
//		
//		JLabel lblLogIn = new JLabel("<html><b><p style=\"font-family:'Monospace'\"><font size = +3><font color = #35AEF5>Log in</color></font></b></html>");
//		lblLogIn.setBounds(60, 100, 200, 80);
//		add(lblLogIn);
		
		super.addSpecialText(60, 115, "Log in");
		
//		txtUsername = new JTextField();
//		txtUsername.setBounds(60, 170, 150, 26);
//		add(txtUsername);
//		txtUsername.setColumns(10);
		
//		JLabel lblUsername = new JLabel("Username");
//		lblUsername.setFont(font);
//		lblUsername.setBounds(60, 200, 69, 20);
//		add(lblUsername);
		
		super.addTextComponent(60, 170, "Username");
		
		password = new JPasswordField();
		password.setBounds(260, 170, 150, 26);
		add(password);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(font);
		lblPassword.setBounds(260, 200, 150, 20);
		add(lblPassword);
		
		JComboBox comboTeacherStudent = new JComboBox();
		comboTeacherStudent.setFont(font);
		comboTeacherStudent.setModel(new DefaultComboBoxModel(new String[] {"", "Teacher", "Student"}));
		comboTeacherStudent.setBounds(60, 235, 350, 26);
		add(comboTeacherStudent);
		
		JLabel lblTeacherStudent = new JLabel("Are you a teacher or a student?");
		lblTeacherStudent.setFont(font);
		lblTeacherStudent.setBounds(60, 265, 269, 20);
		add(lblTeacherStudent);
		
		JButton btnLonIn = new JButton("Log in");
		btnLonIn.setFont(btnFont);
		btnLonIn.setBounds(310, 300, 100, 29);
		add(btnLonIn);
		
		JButton btnTeacherAccount = new JButton("Teacher account");
		btnTeacherAccount.setFont(btnFont);
		btnTeacherAccount.setBounds(60, 430, 153, 29);
		add(btnTeacherAccount);
		
		JButton btnStudentAccount = new JButton("Student account");
		btnStudentAccount.setFont(btnFont);
		btnStudentAccount.setBounds(260, 430, 150, 29);
		add(btnStudentAccount);
		
		super.addSpecialText(60, 350, "Sign in");
		JLabel lblNewAccount = new JLabel("Create a student or a teacher account!");
		lblNewAccount.setFont(font);
		lblNewAccount.setBounds(60, 370, 550, 60);
		add(lblNewAccount);
		
		
	}
}
