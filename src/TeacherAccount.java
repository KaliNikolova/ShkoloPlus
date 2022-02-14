import java.io.File;

import javax.swing.JButton;

public class TeacherAccount extends Page {

	public TeacherAccount() {
		super("Create a teacher account");
		
		super.addSpecialText(60, 50, "Teacher account");
		super.addTextComponent(60, 110, "First name");
		super.addTextComponent(260, 110, "Last name");
		super.addTextComponent(60, 180, "Phone number");
		super.addTextComponent(260, 180, "Email");
		super.addComboBoxComponent(60, 250, "Subject", new String[] {"Math", "Computer Science", "Chemistry", "Biology", "Physics", "Philosophy", "English Language", "Bulgarian Language", "German Language", "History", "Geography", "Information Technology", "Art", "Music"});
		super.addComboBoxComponent(260, 250, "Gender", new String[] {"Male", "Female"});
		super.addTextComponent(60, 320, "Username");
		super.addTextComponent(260, 320, "Password");
		
		super.addImage(450, 50, 480, 330, new File("src/logo.png"));
		
		JButton btnStudentAccount = new JButton("Create account");
		btnStudentAccount.setFont(btnFont);
		btnStudentAccount.setBounds(60, 410, 150, 29);
		add(btnStudentAccount);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(btnFont);
		btnBack.setBounds(260, 410, 150, 29);
		add(btnBack);
	}
}
