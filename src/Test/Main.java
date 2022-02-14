package Test;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GraphicsEnvironment;

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
		
		//contentPane.add(new StudentPortal());
		
		JLabel lbl = new JLabel();
		String fonts[] = 
        GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
String s = "<html><font size = 15>";
		    for (int i = 100; i < 110; i++) {
		     s+="<p style=\"font-family:'"+fonts[i]+"'\">" + "1234567890"+ fonts[i] +"</font>";
	    }
		lbl.setText(s);
		lbl.setBounds(0,0,800,600);
		add(lbl);
	}
}
