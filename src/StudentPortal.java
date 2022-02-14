import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JLabel;

public class StudentPortal extends Page {

	public StudentPortal() {
		super("Student's portal");
		
		super.addShadowedText(50, 60, "5.46", EColor.BLUE, 140, "Grade Point Average");
		super.addShadowedText(350, 60, "46", EColor.BLUE, 140, "Number of grades");
		
		super.addShadowedText(70, 260, "13", EColor.GRAY, 140, "12a rank");
		super.addShadowedText(340, 260, "58", EColor.GREEN, 140, "Class rank");
		super.addShadowedText(610, 260, "476", EColor.RED, 140, "School rank");
		
		super.addImage(650, 40, 270, 170, new File("src/logo.png"));
		
		JButton btnGraphs = new JButton("Veiw graphs");
		btnGraphs.setFont(btnFont);
		btnGraphs.setBounds(420, 430, 150, 30);
		add(btnGraphs);
		
		JButton btnRate = new JButton("Rate a teacher");
		btnRate.setFont(btnFont);
		btnRate.setBounds(600, 430, 150, 30);
		add(btnRate);
		
		JButton btnGrades = new JButton("Veiw grades");
		btnGrades.setFont(btnFont);
		btnGrades.setBounds(770, 430, 150, 30);
		add(btnGrades);
	}
	
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g ); // call superclass's paint method

		Graphics2D g2d = ( Graphics2D ) g;
		g2d.setPaint( Color.LIGHT_GRAY );
		g2d.setStroke( new BasicStroke( 8.0f ) );
		g2d.draw( new Rectangle2D.Double( 50, 40, 250, 170 ) );
		g2d.draw( new Rectangle2D.Double( 350, 40, 250, 170 ) );
	}
}
