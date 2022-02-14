import java.io.File;

import javax.swing.JButton;

public class StudentRanking extends Page {

	public StudentRanking() {
		super("Student's ranking");
		
		addImage(50, 30, 900, 400, new File("src/student_ranking.png"));
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(btnFont);
		btnBack.setBounds(800, 450, 150, 30);
		add(btnBack);
	}
}
