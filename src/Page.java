import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Page extends JPanel {

	protected Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 17);
	protected Font btnFont = new Font(Font.SANS_SERIF, Font.BOLD, 15);

	/**
	 * Create the panel.
	 */
	public Page(String text) {
		Main.setMenu(text);
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(0, 40, 1000, 600);
		setVisible(true);
	}

	public Page() {
	}

	protected void addImage(int x, int y, int width, int height, File file) {
		BufferedImage imgLogo;
		try {
			imgLogo = ImageIO.read(file);
			Image newImage = imgLogo.getScaledInstance(width, height, Image.SCALE_DEFAULT);
			JLabel picLabel = new JLabel(new ImageIcon(newImage));
			picLabel.setBounds(x, y, width, height);
			add(picLabel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void addTextComponent(int x, int y, String text) {
		JTextField txtField = new JTextField();
		txtField.setFont(font);
		txtField.setBounds(x, y, 150, 26);
		add(txtField);
		txtField.setColumns(10);

		JLabel lblUsername = new JLabel(text);
		lblUsername.setFont(font);
		lblUsername.setBounds(x, y + 30, 150, 20);
		add(lblUsername);
	}

	protected void addSpecialText(int x, int y, String text) {
		JLabel lbl = new JLabel("<html><b><p style=\"font-family:'Monospace'\"><font size = +3><font color = #35AEF5>"
				+ text + "</color></font></b></html>");
		lbl.setBounds(x, y, 400, 40);
		add(lbl);
	}

	protected void addComboBoxComponent(int x, int y, String text, String[] model) {
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(font);
		comboBox.setModel(new DefaultComboBoxModel(model));
		comboBox.setBounds(x, y, 150, 26);
		add(comboBox);

		JLabel lblTeacherStudent = new JLabel(text);
		lblTeacherStudent.setFont(font);
		lblTeacherStudent.setBounds(x, y + 30, 150, 20);
		add(lblTeacherStudent);
	}

	protected void addShadowedText(int x, int y, String text, EColor color, int size, String label) {

		String font = "IrisUPC";

		JLabel lbl2 = new JLabel("<html><b><p style=\"font-family:'" + font + "'\"><font color = " + color.toString()
				+ ">" + text + "</color></font></b></html>");
		lbl2.setFont(new Font("Georgia", Font.BOLD, size));
		lbl2.setBounds(x, y, 250, 100);
		lbl2.setHorizontalAlignment(JLabel.CENTER);
		add(lbl2);

		JLabel lbl = new JLabel("<html><b><p style=\"font-family:'" + font + "'\"><font color = 	#64F9FF>" + text
				+ "</color></font></b></html>");
		lbl.setFont(new Font("Georgia", Font.BOLD, size));
		lbl.setHorizontalAlignment(JLabel.CENTER);
		lbl.setBounds(x + 3, y - 2, 250, 100);
		add(lbl);

		JLabel lbl3 = new JLabel("<html><b><p style=\"font-family:'" + font + "'\"><font color = #FF3FC3>" + text
				+ "</color></font></b></html>");
		lbl3.setFont(new Font("Georgia", Font.BOLD, size));
		lbl3.setHorizontalAlignment(JLabel.CENTER);
		lbl3.setBounds(x - 4, y + 2, 250, 100);
		add(lbl3);
		
		JLabel lblText = new JLabel(label);
		lblText.setBounds(x, y + 90, 250, 30);
		lblText.setHorizontalAlignment(JLabel.CENTER);
		lblText.setFont(this.font);
		add(lblText);
	}
}
