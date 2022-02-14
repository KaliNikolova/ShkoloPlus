import java.io.File;

import javax.swing.JButton;

public class TeacherPortal extends Page {
	public TeacherPortal() {
		super("Teacher's portal");

		super.addSpecialText(80, 30, "Your ranking");
		super.addShadowedText(30, 100, "13", EColor.RED, 140, "Rank by subject");
		super.addShadowedText(30, 260, "58", EColor.GREEN, 140, "All teachers");
		
		JButton btnGrade = new JButton("Grade a student");
		btnGrade.setFont(btnFont);
		btnGrade.setBounds(80, 420, 150, 30);
		add(btnGrade);
		
		super.addImage(400, 60, 500, 400, new File("src/teacher_ranking.png"));
	}
}