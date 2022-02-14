import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class Menu extends JPanel {

	/**
	 * Create the panel.
	 */
	public Menu(String text) {
		setLayout(null);
		setBackground(Color.WHITE);
		setBounds(0, 0, 1200, 40);
		
		JLabel lblNewLabel = new JLabel(text);
		lblNewLabel.setBounds(20, 5, 1200, 35);
		lblNewLabel.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 22 ));
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("..........................................................................................................................");
		lblNewLabel_1.setBounds(8, 30, 1200, 10);
		lblNewLabel_1.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, 14));
		add(lblNewLabel_1);
	
	}

}
