import java.io.File;

import javax.swing.JButton;

public class StudentAccount extends Page {

	public StudentAccount() {
		super("Create a student account");
		
		super.addSpecialText(60, 20, "Student account");
		super.addTextComponent(60, 80, "First name");
		super.addTextComponent(260, 80, "Last name");
		super.addTextComponent(60, 150, "Phone number");
		super.addTextComponent(260, 150, "Email");
		super.addComboBoxComponent(60, 220, "Grade", new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"});
		super.addComboBoxComponent(260, 220, "Class letter", new String[] {"A", "B", "C", "D", "E", "F"});
		super.addTextComponent(60, 290, "Number in class");
		super.addComboBoxComponent(260, 290, "Gender", new String[] {"Male", "Female"});
		super.addTextComponent(60, 360, "Username");
		super.addTextComponent(260, 360, "Password");
		
		super.addImage(450, 80, 480, 330, new File("src/logo.png"));
		
		JButton btnStudentAccount = new JButton("Create account");
		btnStudentAccount.setFont(btnFont);
		btnStudentAccount.setBounds(60, 440, 150, 29);
		add(btnStudentAccount);
	}
}
