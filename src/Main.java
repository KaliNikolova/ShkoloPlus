import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

	static private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setTitle("Shkolo Plus");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//		contentPane.add(new Welcome());
//		contentPane.add(new StudentAccount());
//		contentPane.add(new TeacherAccount());
//		contentPane.add(new StudentPortal());
//		contentPane.add(new StudentGrades());
//		contentPane.add(new StudentRanking());
//		contentPane.add(new RateATeacher());
//		contentPane.add(new TeacherPortal());
		contentPane.add(new GradeAStudent());
	}

	public static void setMenu(String text) {
		JPanel menu = new Menu(text);
		contentPane.add(menu);
	}
}
