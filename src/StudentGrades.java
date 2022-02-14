import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class StudentGrades extends Page {

	public StudentGrades() {
		super("Student's grades");
		
		addSpecialText(50, 20, "Grades");
		String[][] data = {
	            { "6.00", "Mathematics", "Stoicho Stoev","","22.02.2022" },
	            { "5.50", "English Language", "Nina Nencheva","","02.02.2022" },
	            { "6.00", "Mathematics", "Stoicho Stoev","","22.02.2022" },
	            { "5.50", "English Language", "Nina Nencheva","","02.02.2022" },
	            { "6.00", "Mathematics", "Stoicho Stoev","","22.02.2022" },
	            { "5.50", "English Language", "Nina Nencheva","","02.02.2022" },
	            { "6.00", "Mathematics", "Stoicho Stoev","","22.02.2022" },
	            { "5.50", "English Language", "Nina Nencheva","","02.02.2022" },
	            { "6.00", "Mathematics", "Stoicho Stoev","","22.02.2022" },
	            { "5.50", "English Language", "Nina Nencheva","","02.02.2022" },
	            { "6.00", "Mathematics", "Stoicho Stoev","","22.02.2022" },
	            { "5.50", "English Language", "Nina Nencheva","","02.02.2022" },
	            { "6.00", "Mathematics", "Stoicho Stoev","","22.02.2022" },
	            { "5.50", "English Language", "Nina Nencheva","","02.02.2022" },
	            { "6.00", "Mathematics", "Stoicho Stoev","","22.02.2022" },
	            { "5.50", "English Language", "Nina Nencheva","","02.02.2022" },
	            { "6.00", "Mathematics", "Stoicho Stoev","","22.02.2022" },
	            { "5.50", "English Language", "Nina Nencheva","","02.02.2022" },
	            { "6.00", "Mathematics", "Stoicho Stoev","","22.02.2022" },
	            { "5.50", "English Language", "Nina Nencheva","","02.02.2022" },
	            { "6.00", "Mathematics", "Stoicho Stoev","","22.02.2022" },
	            { "5.50", "English Language", "Nina Nencheva","","02.02.2022" },
	            { "6.00", "Mathematics", "Stoicho Stoev","","22.02.2022" },
	            { "5.50", "English Language", "Nina Nencheva","","02.02.2022" },
	            { "6.00", "Mathematics", "Stoicho Stoev","","22.02.2022" },
	            { "5.50", "English Language", "Nina Nencheva","","02.02.2022" },
	            { "6.00", "Mathematics", "Stoicho Stoev","","22.02.2022" },
	            { "5.50", "English Language", "Nina Nencheva","","02.02.2022" },
	            { "6.00", "Mathematics", "Stoicho Stoev","","22.02.2022" },
	            { "5.50", "English Language", "Nina Nencheva","","02.02.2022" }
	        };
	 
	        // Column Names
	        String[] columnNames = { "Grade", "Subject", "Teacher", "Description", "Date" };
	 
	        // Initializing the JTable
	        JTable j = new JTable(data, columnNames);
	        j.setFont(font);
	 
	        // adding it to JScrollPane
	        JScrollPane sp = new JScrollPane(j);
	        sp.setBounds(50, 70, 900, 350);
	        add(sp);
	        
	        JButton btnBack = new JButton("Back");
			btnBack.setFont(btnFont);
			btnBack.setBounds(800, 450, 150, 30);
			add(btnBack);
	}
}
