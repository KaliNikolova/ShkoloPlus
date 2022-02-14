import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class GradeAStudent extends Page {

	public GradeAStudent() {
		super("Grade a student");
		
		addSpecialText(50, 20, "Grades");
		
		addComboBoxComponent(50, 80, "Choose a class", new String[] {"12a", "12b", "12c"});
		
		String[][] data = {
	            { "Nikola Georgiev", "6, 6, 6", "6","","", "" },
	            { "Vasil Georgiev", "6, 6, 6", "6","","", "" },
	            { "Pesho Georgiev", "6, 6, 6", "6","","", "" },
	            { "Kalina Georgieva", "6, 6, 6", "6","","", "" },
	            { "Nikola Georgiev", "6, 6, 6", "6","","", "" },
	            { "Vasil Georgiev", "6, 6, 6", "6","","", "" },
	            { "Pesho Georgiev", "6, 6, 6", "6","","", "" },
	            { "Kalina Georgieva", "6, 6, 6", "6","","", "" },
	            { "Nikola Georgiev", "6, 6, 6", "6","","", "" },
	            { "Vasil Georgiev", "6, 6, 6", "6","","", "" },
	            { "Pesho Georgiev", "6, 6, 6", "6","","", "" },
	            { "Kalina Georgieva", "6, 6, 6", "6","","", "" }
	        };
	 
	        // Column Names
	        String[] columnNames = { "Student", "First Term Grades", "Final First Term Grade", "Second Term Grades", "Final Second Term Grade", "Final Grade" };
	 
	        // Initializing the JTable
	        JTable j = new JTable(data, columnNames);
	        j.setFont(font);
	 
	        // adding it to JScrollPane
	        JScrollPane sp = new JScrollPane(j);
	        sp.setBounds(50, 150, 900, 150);
	        add(sp);
	        

			addComboBoxComponent(50, 330, "Student", new String[] {"Nikola Georgiev", "Vasil Georgiev", "Pesho Georgiev", "Kalina Georgieva"});
	        
			addTextComponent(250, 330, "Student's grade");
			
			JTextArea txtDescription = new JTextArea();
			txtDescription.setVisible(true);
			txtDescription.setLineWrap(true);
			txtDescription.setFont(font);
			JScrollPane spDescription = new JScrollPane(txtDescription);
			txtDescription.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			spDescription.setBounds(450, 330, 500, 50);
			add(spDescription);
			
			JLabel lblDescription = new JLabel("Description");
			lblDescription.setBounds(450, 385, 100, 30);
			lblDescription.setFont(font);
			add(lblDescription);
			
	        JButton btnBack = new JButton("Back");
			btnBack.setFont(btnFont);
			btnBack.setBounds(600, 450, 150, 30);
			add(btnBack);
			
			JButton btnGrade = new JButton("Grade student");
			btnGrade.setFont(btnFont);
			btnGrade.setBounds(800, 450, 150, 30);
			add(btnGrade);
	}
}
